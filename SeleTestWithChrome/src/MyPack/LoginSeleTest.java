package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginSeleTest {

    private WebDriver driver;
    private String baseUrl = "file:///C:/Users/91983/OneDrive/Desktop/Web%20Dev/Registration-form/login.html";

    @BeforeClass
    public void setUp() {
        // Set ChromeDriver executable path
    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        
        // Initialize the class-level WebDriver variable
        driver = new ChromeDriver();
        
        // Open the baseUrl in the Chrome browser
        driver.get(baseUrl);
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
                { "user1", "password1", "Login successful" },
                { "user1", "wrongpassword", "Incorrect password" },
                { "nonexistentuser", "password", "User does not exist" }
                // Add more test data as needed
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String expectedMessage) {
        // Find the username, password, and submit button elements
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        // Clear existing text and enter username and password
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);

        // Click on the submit button
        submitButton.click();

        // Find the message element and assert the text
        WebElement messageElement = driver.findElement(By.id("message"));
        Assert.assertEquals(messageElement.getText(), expectedMessage, "Login message mismatch");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after all tests are executed
        driver.quit();
    }
}
