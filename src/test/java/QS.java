import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QS {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://qsconnect-staging.qs.com/wp-login.php");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.cssSelector("#user_login")).sendKeys("vinay@qs.com");
		driver.findElement(By.cssSelector("#user_pass")).sendKeys("Vinay@490");
		driver.findElement(By.cssSelector("#wp-submit")).click();
		driver.findElement(By.cssSelector(".btn-success")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@id='side-menu']/li[3]/a/span[2]")).click();
		driver.findElement(By.xpath("//ul[@id='qsstaffsubmenu']/li[3]/a/span[2]")).click();
		driver.findElement(By.xpath("//ul[@id='supportsubmenu']/li[1]/a/span[2]")).click();
		driver.findElement(By.xpath("//button[text()='+ Add Institution']")).click();
		driver.findElement(By.cssSelector("#institution_name")).sendKeys("BGSIT-2999");
		WebElement drop = driver.findElement(By.cssSelector("#selected_type"));
		Select dropdown = new Select(drop);
		dropdown.selectByVisibleText("Top Level Institution ");
		WebElement Country = driver.findElement(By.cssSelector("#country"));
		Select dropdown1 = new Select(Country);
		dropdown1.selectByVisibleText("India ");
		driver.findElement(By.cssSelector("#institute_save")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("label[for='switchab']")).click();
		driver.findElement(By.cssSelector("label[for='switch3']")).click();
		driver.findElement(By.cssSelector("label[for='switch4']")).click();
		driver.findElement(By.cssSelector("label[for='switch17']")).click();
		driver.findElement(By.cssSelector("label[for='switch10']")).click();
		driver.findElement(By.cssSelector("label[for='switch-program-40']")).click();
		driver.findElement(By.cssSelector("label[for='switch-tm-40']")).click();
		driver.findElement(
				By.xpath("//form[@id='genral-support-form']//button[@name='submit'][normalize-space()='Save']"))
				.click();

	}

}
