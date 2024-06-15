package LoginSeleTest;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginSelenium {
    private WebDriver driver;
    //private String baseUrl = "file:///C:/Users/91983/OneDrive/Desktop/SEM6/Test Automation Experiments/login.html";
    private String baseUrl = "file:///C:/Users/91983/OneDrive/Desktop/Web Dev/Login/login.html";

    @BeforeClass
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91983\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
                { "user1", "password1", "Login successful" },
                { "user1", "wrongpassword", "Incorrect password" },
                { "nonexistentuser", "password", "User does not exist" }
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String expectedMessage) throws InterruptedException {
        // Find the username, password, and submit button elements
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        // Enter username
        usernameInput.sendKeys(username);
        Thread.sleep(1000); // Wait for 1 second

        // Enter password
        passwordInput.sendKeys(password);
        Thread.sleep(1000); // Wait for 1 second

        // Click on the submit button
        submitButton.click();

        WebElement messageElement = null;
        int attempts = 0;
        while (attempts < 10) {
            try {
                messageElement = driver.findElement(By.id("message"));
                if (messageElement.isDisplayed()) {
                    break;
                }
            } catch (NoSuchElementException | StaleElementReferenceException e) {
                // Element not found or stale, continue looping
            }
            Thread.sleep(1000); // Poll every second
            attempts++;
        }

        // Find the message element and assert the text
        WebElement messageElement1 = driver.findElement(By.id("message"));
        Assert.assertEquals(messageElement1.getText(), expectedMessage);

        // Clear username and password fields for the next iteration
        usernameInput.clear();
        passwordInput.clear();
    }


    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
