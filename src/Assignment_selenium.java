import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","D:\\myeclipse\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption2")).click();
		String solname=driver.findElement(By.cssSelector("div[id='checkbox-example'] label:nth-child(3)")).getText();
		System.out.println(solname);
		  WebElement val=driver.findElement(By.id("dropdown-class-example")); 
		  Select drpdwn=new Select(val); Thread.sleep(1000);
		  drpdwn.selectByVisibleText(solname);
		  driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(
		  solname); Thread.sleep(1000); driver.findElement(By.id("alertbtn")).click();
		  String actual=driver.switchTo().alert().getText();
		  if(actual.contains(solname)) {
			  System.out.println(solname+" is present in the popup"); }
		  else { 
			  System.out.println(solname +" is not present in the popup"); }
	}
}
