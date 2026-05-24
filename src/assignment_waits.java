import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class assignment_waits {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.setProperty("webdriver.edge.driver","D:\\myeclipse\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		WebElement dropdown=driver.findElement(By.cssSelector("select.form-control"));
		Select options=new Select(dropdown);
		options.selectByVisibleText("Consultant");
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.name("signin")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		
		
		

	}
	public static void addItems(WebDriver driver,String[] vegetables) {
		int j=0;
		List<WebElement>  productList=driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < productList.size(); i++)
		{
			String[] name = productList.get(i).getText().split("-");
			String formattedname=name[0].trim();
			//check whether name is in present in vegtables list or not
					// Conversion of array to ArrayList
			        // using Arrays.asList
			List result=Arrays.asList(vegetables);
			//chk whether name is present in result list or not
			if (result.contains(formattedname))
			{
				j++;
				//click on Add to cart button
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==vegetables.length) {
					break;
			}}
	}
	}}
