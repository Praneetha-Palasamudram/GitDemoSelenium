import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Addingitemstocart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","D:\\myeclipse\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String [] vegetables= {"Cucumber","Brocolli","Beans"};
		//using static we cn access methodds wihout creating the methods inside class
		//Addingitemstocart option=new Addingitemstocart();
		addItems(driver, vegetables);
		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		
		
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		//driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
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
}
}
