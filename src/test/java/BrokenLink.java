import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		// Broken Links

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();

		List<WebElement> Links = driver.findElements(By.tagName("a"));

		System.out.println(Links.size());

		int brokenLinks = 0;
		
		

		for (WebElement link : Links) {
			String targetLink = link.getAttribute("href");
			if (targetLink == null || targetLink.isEmpty()) {
				System.out.println("Href attribute value is null");
				continue;
			}
			URL linkurl = new URL(targetLink); // Convert string into URL
			HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection(); // Open Connection and connect to
																					// server
			conn.connect();
			if(conn.getResponseCode()>= 400) {
				System.out.println("It is a broken link" + link.getText());
				brokenLinks ++;
			}
			else
			{
				System.out.println("It is not a broken Link");
			}
		}

	}

}
