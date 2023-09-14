import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyA {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Vinay");
		Actions ac = new Actions(driver);
		// Ctrl A
		
		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		// Ctrl C
		
		ac.keyDown(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).perform();
		
		// Tab
		
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		// Ctrl V
		
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).perform();
		
		

	}

}
