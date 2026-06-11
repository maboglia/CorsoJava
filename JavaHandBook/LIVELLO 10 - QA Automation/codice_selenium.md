## 1. Getting Started with Selenium Webdriver

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.wikipedia.org");
        driver.close();
    }
}
```

---

## 2. Locators

```java

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.wikipedia.org");

        //locators
        //id
        Long start = System.currentTimeMillis();
        driver.findElement(By.id("js-link-box-en"));
        Long end = System.currentTimeMillis();

        System.out.println("The time needed to get a locator by ID is: " + (end - start));

        //xpath
        start = System.currentTimeMillis();
        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]/div[2]"));
        end = System.currentTimeMillis();

        System.out.println("The time needed to get a locator by Xpath is: " + (end - start));

        //cssSelector
        start = System.currentTimeMillis();
        driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-featured > div.central-featured-lang.lang2"));
        end = System.currentTimeMillis();

        System.out.println("The time needed to get a locator by CSSSelector is: " + (end - start));

        driver.close();
    }
}
```

---

## 3. Getting Text from a WebPage

```java

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.wikipedia.org");

        WebElement titleOfWebPage = driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span"));

        String titleText = titleOfWebPage.getText();

        String expectedText = "Wikipedia";

        if(titleText.equals(expectedText)){
            System.out.println("Test has passed!");
        }
        else{
            System.out.println("Test did not pass!");
            driver.close();
            throw new Exception();
        }

        driver.close();
    }
}
```

---

## 4. Clicking on a WebPage

```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.wikipedia.org");
        WebElement englishButton = driver.findElement(By.id("js-link-box-en"));

        englishButton.click();

        String expectedTitle = "Welcome to Wikipedia,";
        WebElement titleOfEnglishPage = driver.findElement(By.id("mp-welcome"));

        if(titleOfEnglishPage.getText().equals(expectedTitle)){
            System.out.println("Test has passed! Page is the English one");
        }

        else{
            System.out.println("Test has failed! Click() was not successful.");
        }

        driver.close();
    }
}
```

---

## 5. Send Text to a WebPage

```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.wikipedia.org");

        WebElement searchBox = driver.findElement(By.id("searchInput"));
        String searchStr = "Selenium Webdriver";
        searchBox.sendKeys(searchStr);

        WebElement searchButton = driver.findElement(By.cssSelector("#search-form > fieldset > button"));
        searchButton.click();

        //driver.close();
    }
}
```

---

## 6. Working with Tables

```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("file:///D:/tablePage.html");

        //System.out.println(driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[2]/td[1]")).getText());
        //System.out.println(driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[1]/th[2]")).getText());

        List<WebElement> listOfWebElements = driver.findElements(By.xpath("/html/body/table/tbody[1]/tr"));

        for(WebElement element : listOfWebElements){
            System.out.println(element.getText());
        }

        driver.close();
    }
}
```

---

## 7. Types of Waits.srt

```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");

        System.out.println(driver.getTitle());

        //Explicit Wait

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("js-link-box-en"))));

        //Fluent Wait
        Wait fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        fluentWait.until(new Function<WebDriver, WebElement>(){

            public WebElement apply(WebDriver driver ) {
                return driver.findElement(By.id("js-link-box-en"));
            }
        });

        driver.close();
    }
}
```

---

## 9. Using the JavascriptExecutor

```java
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.udemy.com/course/core-java-programming-language-tutorial/");

        WebElement signUpButton = driver.findElement(By.cssSelector("#udemy > div.main-content-wrapper > div.ud-app-loader.ud-component--header-v6--header.udlite-header.ud-app-loaded > div.udlite-text-sm.header--header--3sK1h.header--flex-middle--2Xqjv > div:nth-child(9) > a > span"));

        //Clicking with JavascriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", signUpButton);

        //Setting up timeouts
        ((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");

        //Changing the webpage
        ((JavascriptExecutor) driver).executeScript("window.location = 'https://wikipedia.com'");

        //Scroll the webpage
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");

        driver.close();
    }
}
```

---

## 10. Alerts in Selenium

```java
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("file:///D:/Projects/Video/youtube/bitheap/DesignPatterns/seleniumDemo/alerts.html");
        WebElement basicAlertButton = driver.findElement(By.cssSelector("body > button:nth-child(2)"));
        WebElement confirmationAlertButton = driver.findElement(By.cssSelector("body > button:nth-child(5)"));
        WebElement promptAlertButton = driver.findElement(By.cssSelector("body > button:nth-child(8)"));

        //Basic Alert Demo
        basicAlertButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert basicAlert = driver.switchTo().alert();
        basicAlert.accept();

        //Confirmation Alert Demo
        confirmationAlertButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.dismiss();

        //Prompt Alert Demo
        promptAlertButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert promptAlert = driver.switchTo().alert();

        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Laurentiu");
        promptAlert.accept();

        //driver.close();
    }
}
```

---

## 11. Working with iFrames

```java
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_iframe.asp");

        String title = driver.switchTo().frame(0).findElement(By.cssSelector("#main > h1")).getText();
        System.out.println(title);

        WebElement iframe = driver.findElement(By.cssSelector("#main > div:nth-child(7) > iframe"));

        driver.switchTo().frame(iframe).findElement(By.cssSelector("#topnav > div > div.w3-bar.w3-left > a:nth-child(5)")).click();

        driver.close();
    }
}
```

---

## 12. Bonus How to Handle Select in Selenium WebDriver

```java
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        WebElement selectable = driver.findElement(By.id("cars"));

        Select select = new Select(selectable);
        select.selectByIndex(1);

        driver.close();
    }
}
```

---

## 13. Bonus Performing Special Actions

```java
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(By.cssSelector("#content > iframe")));

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions dragAndDrop = new Actions(driver);
        dragAndDrop.dragAndDrop(draggable, droppable).build().perform();

        Actions contextClick = new Actions(driver);

        contextClick.contextClick().build().perform();

        Actions actionObj = new Actions(driver);
        actionObj.keyDown(Keys.F1);

        driver.close();
    }
}
```

```java

```

```java

```

```java

```

```java

```

```java

```