package com.example.lock.controller;

import com.example.lock.model.LockSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;
import java.util.*;

@Controller
public class LockController {

    private final int MAX_ATTEMPTS = 10;

    private String generateSecret() {
        Random r = new Random();
        int code = r.nextInt(10000);
        return String.format("%04d", code);
    }

    private LockSession createSessionIfAbsent(HttpSession session) {
        LockSession ls = (LockSession) session.getAttribute("lockSession");
        if (ls == null) {
            ls = new LockSession(generateSecret(), MAX_ATTEMPTS);
            session.setAttribute("lockSession", ls);
            session.setAttribute("secretForTest", ls.getSecret());
        }
        return ls;
    }

    @GetMapping("/")
    public String index(@RequestParam(value="test", required=false) String test,
                        HttpSession session, Model model) {
        boolean testMode = "true".equalsIgnoreCase(test);
        LockSession ls = createSessionIfAbsent(session);
        model.addAttribute("attemptsLeft", ls.getAttemptsLeft());
        model.addAttribute("unlocked", ls.isUnlocked());
        if (testMode) {
            model.addAttribute("secret", ls.getSecret());
            model.addAttribute("testMode", true);
        } else model.addAttribute("testMode", false);
        return "index";
    }

    @PostMapping("/guess")
    @ResponseBody
    public Map<String,Object> guess(@RequestParam("code") String code, HttpSession session) {
        Map<String,Object> resp = new HashMap<>();
        LockSession ls = (LockSession) session.getAttribute("lockSession");
        if (ls == null) ls = createSessionIfAbsent(session);

        if (ls.isUnlocked()) {
            resp.put("result", "already_unlocked");
            resp.put("message", "Il lucchetto è già aperto.");
            resp.put("attemptsLeft", ls.getAttemptsLeft());
            return resp;
        }
        if (ls.getAttemptsLeft() <= 0) {
            resp.put("result", "locked_out");
            resp.put("message", "Hai esaurito i tentativi.");
            resp.put("attemptsLeft", 0);
            return resp;
        }

        code = code == null ? "" : code.trim();
        if (!code.matches("\d{4}")) {
            resp.put("result", "invalid");
            resp.put("message", "Inserisci un codice di 4 cifre.");
            resp.put("attemptsLeft", ls.getAttemptsLeft());
            return resp;
        }

        if (code.equals(ls.getSecret())) {
            ls.setUnlocked(true);
            resp.put("result", "ok");
            resp.put("message", "Codice corretto! Lucchetto aperto.");
        } else {
            ls.decrementAttempt();
            resp.put("result", "wrong");
            resp.put("message", "Codice sbagliato.");
        }
        resp.put("attemptsLeft", ls.getAttemptsLeft());
        return resp;
    }

    @PostMapping("/reset")
    @ResponseBody
    public Map<String,Object> reset(HttpSession session) {
        LockSession newLs = new LockSession(generateSecret(), MAX_ATTEMPTS);
        session.setAttribute("lockSession", newLs);
        session.setAttribute("secretForTest", newLs.getSecret());
        Map<String,Object> resp = new HashMap<>();
        resp.put("result", "reset");
        resp.put("message", "Sessione resettata.");
        resp.put("secret", newLs.getSecret());
        resp.put("attemptsLeft", newLs.getAttemptsLeft());
        return resp;
    }
}
