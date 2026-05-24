import org.openqa.selenium.edge.EdgeDriver;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","D:\\myeclipse\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//implicit wait--if we give 4 sec waited for 4 sec in all lines and gives output
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("praneetha");
		driver.findElement(By.name("inputPassword")).sendKeys("1234");
		driver.findElement(By.className("submit")).click();
		//css selector--classname--tagname.classname
		//id==tagname#id)
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Name')]")).sendKeys("rohit");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rohit@gmail.com");
		driver.findElement(By.xpath("//form/h2//following::input[3]")).sendKeys("8989876544");
		driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
		String[] password=driver.findElement(By.cssSelector(".infoMsg")).getText().split("'");
		System.out.println(password[0]);
		String newpw=password[1];
		System.out.println(newpw);
		driver.findElement(By.className("go-to-login-btn")).click();
		//login into the page again
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'inputUsername')]")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(newpw);
		driver.findElement(By.cssSelector("button[class*='sign']")).click();
		Thread.sleep(1000);
		//Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'successfully')]")).getText(),"You are successfully logged in.");
		driver.findElement(By.tagName("button")).click();

		//driver.quit();
	}

}
