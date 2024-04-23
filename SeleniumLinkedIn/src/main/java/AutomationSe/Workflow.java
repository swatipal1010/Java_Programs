package AutomationSe;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Workflow {

	public static void main(String[] args) {
		//Set the path to ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91983\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		submitForm(driver);
		
		waitForAlertBanner(driver);
		
		
		assertEquals("The form was successfully submitted!", getAlertBannerText(driver));
		
		driver.quit();

	}
	
	public static void submitForm(WebDriver driver) {
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("Doe");
		
		driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
		
		driver.findElement(By.id("radio-button-2")).click();
		
		driver.findElement(By.id("checkbox-2")).click();
		
		driver.findElement(By.cssSelector("option[value='1']")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("05/20/2023");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);			//To close the datepicker
		
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}

	public static void waitForAlertBanner(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert"))); //Wait for 10seconds until alert class appears
	}
	
	public static String getAlertBannerText(WebDriver driver) {
		return driver.findElement(By.className("alert")).getText();
	}
}
