package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleFormTesting {
	public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the local HTML file served by Live Server
        driver.get("http://127.0.0.1:5500/Registration-form/index.html");

     // Enter first name
        WebElement firstNameField = driver.findElement(By.id("first-name"));
        firstNameField.sendKeys("John");

        // Enter last name
        WebElement lastNameField = driver.findElement(By.id("last-name"));
        lastNameField.sendKeys("Doe");

        // Enter email
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("john.doe@example.com");

        // Perform any assertions or further interactions as needed

        // Close the browser
        //driver.quit();
    }
}
