import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class method2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","D:\\myeclipse\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//to print count of links in page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//to get footer links
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		//to get column links only
		WebElement column=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		//to traverse each and evry link in column and check if pages ore open or not
		for(int i=0;i<column.findElements(By.tagName("a")).size();i++) {
			String clicking= Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clicking);
			Thread.sleep(5000L);
		}
			Set<String> windows=driver.getWindowHandles();//[parent,child,child3,c4,c5]
			Iterator<String> it=windows.iterator();
			while(it.hasNext()) {//it.hasnext--whethre other index tab is present or not
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		//frames assignment
		/*
		 * driver.get("http://the-internet.herokuapp.com/");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		 * System.out.println(driver.findElements(By.tagName("frame")).size());
		 * //driver.switchTo().frame(driver.findElement(By.name("frame-top"))).switchTo(
		 * ).frame(driver.findElement(By.name("frame-middle")));
		 * driver.switchTo().frame("frame-top"); driver.switchTo().frame("frame-right");
		 * System.out.println(driver.findElement(By.xpath(
		 * "//body[contains(text(),'RIGHT')]")).getText());
		 */
			 System.out.println("Accenture");
			 System.out.println("Interiordesign");
			 System.out.println("palas Nivas is getting ready");
	}	
}
