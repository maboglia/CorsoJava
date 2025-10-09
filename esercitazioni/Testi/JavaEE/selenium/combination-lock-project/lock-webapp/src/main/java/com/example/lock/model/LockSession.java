package com.example.lock.model;

public class LockSession {
    private String secret;
    private int attemptsLeft;
    private boolean unlocked;

    public LockSession(String secret, int attempts) {
        this.secret = secret;
        this.attemptsLeft = attempts;
        this.unlocked = false;
    }

    public String getSecret() { return secret; }
    public int getAttemptsLeft() { return attemptsLeft; }
    public void decrementAttempt() { this.attemptsLeft = Math.max(0, this.attemptsLeft - 1); }
    public boolean isUnlocked() { return unlocked; }
    public void setUnlocked(boolean unlocked) { this.unlocked = unlocked; }
}
