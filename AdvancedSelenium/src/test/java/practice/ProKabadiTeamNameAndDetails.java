package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProKabadiTeamNameAndDetails {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.prokabaddi.com/standings");
		
		List<WebElement> allTeamName = driver.findElements(By.xpath("//div[@class='team-name']"));
		
		//p[contains(text(),'Haryana Steelers')]
		
	}

}
