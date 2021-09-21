package Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("PER", Keys.ENTER);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MAS", Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> trainName = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		int size = trainName.size();
		System.out.println("Number of trains before removing duplicates:" + size);
		List<String> tname = new ArrayList<String>();
		Set<String> traname = new LinkedHashSet<String>();
		for (int i = 0; i < size; i++) {
			tname.add(trainName.get(i).getText());
		}
		traname.addAll(tname);
		System.out.println("Number of trains After removing duplicates:" + traname.size());
		for (String trainname : traname) {

			System.out.println(" Train Name:" + trainname);
		}

	}

}
