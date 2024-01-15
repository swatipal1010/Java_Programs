package seleniumreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selreports {
    public static void main(String[] args) {
        // Setup ExtentReports
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/ExtentReport.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // Create a test with a name and description
        ExtentTest test = extent.createTest("Selenium Test", "Testing Google search functionality");

        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.google.co.in");

            // Assertion: Check if the page title is as expected
            String expectedTitle = "Google";
            String actualTitle = driver.getTitle();
            assert expectedTitle.equals(actualTitle) : "Page title does not match!";
            test.log(Status.PASS, "Page title is as expected.");

            // Interaction: Enter a search query and submit
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium testing");
            searchBox.submit();

            // Assertion: Check if search results are displayed
            WebElement searchResults = driver.findElement(By.id("search"));
            assert searchResults.isDisplayed() : "Search results are not displayed!";
            test.log(Status.PASS, "Search results are displayed.");

            // Close the browser window
            driver.quit();

        } catch (Exception e) {
            // Log failure status and details in ExtentReports
            test.log(Status.FAIL, "Test case failed: " + e.getMessage());
        } finally {
            // Close the test and save the report
            extent.flush();
        }
    }
}
