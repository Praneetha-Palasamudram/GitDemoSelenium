import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","D:\\myeclipse\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		//dynamic calendar dropdwo
		String month="6";
		String date="22";
		String year="2024";
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
//		Set<String> windows=driver.getWindowHandles();//[parent,child]
//		Iterator<String> it=windows.iterator();
//		String parent=it.next();//0 th index of string
//		String child=it.next();//1st index
//		driver.switchTo().window(child);
//		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
//		driver.switchTo().window(parent);
//		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		//drag and drop methods with actions
		/*
		 * WebElement src=driver.findElement(By.id("draggable")); WebElement
		 * des=driver.findElement(By.id("droppable")); Actions a=new Actions(driver);
		 * a.dragAndDrop(src, des).build().perform();
		 */
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		
	}
}

