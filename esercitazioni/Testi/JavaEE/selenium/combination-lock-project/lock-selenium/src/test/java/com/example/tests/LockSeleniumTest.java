package com.example.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LockSeleniumTest {

    private WebDriver driver;
    private final String baseUrl = "http://localhost:8080/?test=true";

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    void teardown() {
        if (driver != null) driver.quit();
    }

    @Test
    void unlockUsingSecret() throws InterruptedException {
        driver.get(baseUrl);
        String secret = driver.findElement(By.id("secret")).getText().trim();
        Assertions.assertTrue(secret.matches("\d{4}"));
        WebElement code = driver.findElement(By.id("code"));
        code.clear();
        code.sendKeys(secret);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(500);
        String msg = driver.findElement(By.id("msg")).getText();
        Assertions.assertTrue(msg.toLowerCase().contains("aperto") || msg.toLowerCase().contains("corretto"));
    }

    @Test
    void wrongCodeDecreasesAttempts() throws InterruptedException {
        driver.get(baseUrl);
        int before = Integer.parseInt(driver.findElement(By.id("attempts")).getText().trim());
        WebElement code = driver.findElement(By.id("code"));
        code.clear();
        code.sendKeys("9999");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(500);
        int after = Integer.parseInt(driver.findElement(By.id("attempts")).getText().trim());
        Assertions.assertEquals(before - 1, after);
    }
}
