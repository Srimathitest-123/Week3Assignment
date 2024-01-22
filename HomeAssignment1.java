package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		//driver.findElement(By.xpath("//div[@class='facet-linkhead']/label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='facet-linkhead']/label[text()='Fashion Bags (964)']")).click();
		
		Thread.sleep(3000);

		String count=driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		System.out.println("No of values "+count);

		List<WebElement> Brand=driver.findElements(By.xpath("//div[@class='contentHolder']/div[@class='brand']"));//brand name
		int size=Brand.size();
		//45 links only printed instead of 964- need to ask tomorrow
		System.out.println("total no of links"+size);
		
		//List<String> list=new ArrayList<String>();
		
		for (WebElement data : Brand) {
			String text=data.getText();
			System.out.println("Brand name "+ text);
			

		}
		
		List<WebElement> name=driver.findElements(By.xpath("//div[@class='contentHolder']/div[@class='nameCls']"));//name
		int sizename=name.size();
		System.out.println("total no of links in product name"+sizename);
		
		//List<String> list=new ArrayList<String>();
		
		for (WebElement dataname : name) {
			String textname=dataname.getText();
			System.out.println("Name of the Bag "+ textname);
			

		}


		

	}

}
