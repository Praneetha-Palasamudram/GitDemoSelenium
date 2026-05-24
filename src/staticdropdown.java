import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","D:\\myeclipse\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//autosuggestion dynamnic dropdown
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(1200);
	List<WebElement> options= driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
	for(WebElement option: options) {
		if(option.getText().equalsIgnoreCase("India")) {
			option.click();
			break;
		}}
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(1500);
	//take entirepage(box) xpath as aparent and from there give required xpath asa child
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	Thread.sleep(1200);
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
		System.out.println("enabled");
	}else {
		System.out.println("dissabled");}
	driver.findElement(By.cssSelector("div#divpaxinfo")).click();
	 Thread.sleep(3000); int totaladults=4; for(int i=1;i<totaladults;i++) {
	  driver.findElement(By.id("hrefIncAdt")).click(); }
	  driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
	  System.out.println(driver.findElement(By.cssSelector("div#divpaxinfo")).
	  getText());
	
		//static dropdowns
		//to pss the webelement iside object taking webelemnt of static select tag
		WebElement staticdrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//need to create a object to access all methods inside select
		Select dropdown=new Select(staticdrop);
		
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  dropdown.selectByValue("USD");
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		 driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	}
}
