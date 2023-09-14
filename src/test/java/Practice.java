import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// Find no of rows in the table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("No of rows: " + rows);

		// find total number of columns

		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("No of columns: " + columns);

		String name = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/child::td[1]")).getText();
		System.out.println(name);

		// Read data from all rows and columns

		/*
		 * List<WebElement> records =
		 * driver.findElements(By.xpath("//table[@name='BookTable']//tr/td")); for
		 * (WebElement record : records) { System.out.println(record.getText());
		 */

		for (int r = 2; r <= rows; r++) {
			for (int c = 1; c <= columns; c++) {
				String names = driver
						.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/child::td[" + c + "]"))
						.getText();
				System.out.print(names+ "   ");

			}
			System.out.println();

		}
		
		// print book name whose author is amit
		
		List<WebElement> books = driver.findElements(By.xpath("//td[contains(text(),'Amit')]//preceding-sibling::td"));
		for (WebElement book : books) {
			System.out.println(book.getText());
			
		}
		
		// Sum of price
		int sum = 0;
		List<WebElement> prices = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td[4]"));
		for(WebElement price: prices) {
			String value =  price.getText();
			sum = sum + Integer.parseInt(value);
			
		}
		System.out.println(sum);

	}

}
