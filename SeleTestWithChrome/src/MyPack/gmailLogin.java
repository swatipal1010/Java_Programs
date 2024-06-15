package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Set the path to ChromeDriver
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

		        // Create a new instance of the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Open Gmail.com
		        driver.get("https://www.gmail.com");

		        try {
		            // Find the username input field and enter the correct username
		            WebElement usernameInput = driver.findElement(By.id("identifierId"));
		            usernameInput.sendKeys("swatipal39@gmail.com");

		            // Click the "Next" button to proceed to the password page
		            WebElement nextButton = driver.findElement(By.id("identifierNext"));
		            nextButton.click();

		            // Delay to allow the next page to load
		            Thread.sleep(2000);

		            // Find the password input field and enter a wrong password
		            WebElement passwordInput = driver.findElement(By.name("password"));
		            passwordInput.sendKeys("wrong_password");

		            // Click the "Next" button to attempt login with the wrong password
		            nextButton = driver.findElement(By.id("passwordNext"));
		            nextButton.click();

		            // Delay to allow error message to appear
		            Thread.sleep(2000);

		            // Find the error message element
		            WebElement errorMessage = driver.findElement(By.xpath("//div[@role='alert']/div[2]"));
		            String errorText = errorMessage.getText();

		            // Display the error message in a prompt
		            System.out.println("Error Message: " + errorText);

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Close the browser
		            driver.quit();
		        }
	}

}
