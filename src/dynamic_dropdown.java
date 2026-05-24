import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class dynamic_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\myeclipse\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// window alrets
		String name = "ranjit";
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		//Assert.assertEquals(driver.switchTo().alert().getText(),
			//	"Hello " + name + ", share this practice page and share your knowledge");
		driver.switchTo().alert().accept();
		System.out.println();

		// in css selector use * to get crunchy names
		/*
		 * driver.findElement(By.xpath(
		 * "//div[@class='form-group']/label/following::input[@name='name'][1]")).
		 * sendKeys("Charulatha"); driver.findElement(By.xpath(
		 * "//div[@class='form-group']/label/following::input[@name='email']")).sendKeys
		 * ("palas.charu@gmail.com");
		 * driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
		 * driver.findElement(By.id("exampleCheck1")).click();
		 * Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
		 * //need to create a object to access all methods inside select Select
		 * dropdown=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		 * dropdown.selectByVisibleText("Female");
		 * driver.findElement(By.cssSelector("#inlineRadio1")).click();
		 * driver.findElement(By.cssSelector("input[type='date']")).click();
		 * driver.findElement(By.cssSelector("input[type='date']")).sendKeys(
		 * "22-06-1991");
		 * driver.findElement(By.cssSelector("input[class*='success']")).click();
		 * 
		 * String web=driver.findElement(By.
		 * xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		 * 
		 * System.out.println(web.split("x"));
		 */
		// win

		;

	}

}
