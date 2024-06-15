package Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmailTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91983\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			        // Create a new instance of the ChromeDriver 
			        WebDriver driver = new ChromeDriver();

			        // Open the email.com website
			       driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=ARZ0qKKbtfOHa4Yj637w1jmBJc6-lSgkPTYywlERmPCnNWRCpDpOZFaMu4V6qaqXMRP6krXIlaKG&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1997319091%3A1713175423210690&theme=mn&ddm=0");

			        // Find the username input field and enter the correct username
			        WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
			        usernameInput.sendKeys("swatipal39@gmail.com");
			        
			        WebElement nextButton1 = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
			        nextButton1.click();
			        
			        // Wait for the page to load
			        try {
			            Thread.sleep(2000); 				// You may need to adjust the sleep time based on your system and network speed
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
			     // Find the element with the specified XPath
			        WebElement errorMsgElement = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div/div[2]"));
			        
			        // Get the text content of the element and print it to the console
			        String errorMsg = errorMsgElement.getText();
			        System.out.println(errorMsg);
			        System.out.println("Error message: This browser or app may not be secure. Learn more\r\n"
			        		+ "Try using a different browser. If you’re already using a supported browser, you can try again to sign in."); 

	}

}
