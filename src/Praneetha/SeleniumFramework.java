package Praneetha;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","D:\\myeclipse\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("palas.prani@gmail.com");
		driver.findElement(By.cssSelector("#userPassword")).sendKeys("Shiva@1411");
		driver.findElement(By.cssSelector("#login")).click();
		
		List<WebElement>Products=driver.findElements(By.cssSelector("div[class*='col-lg-4']"));
		
		WebElement Prod=Products.stream().filter(product->product.
				findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		Prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	
}}
