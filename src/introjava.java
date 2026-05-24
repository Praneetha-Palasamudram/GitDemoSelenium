import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
public class introjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome driver running
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver(options);
		
		//ms edge driver
		
		  System.setProperty("webdriver.edge.driver","D:\\myeclipse\\msedgedriver.exe"); 
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl()); //while using close() method
		 // socket issue is coming so bettter to use //driver.quit while using ms edge
		 // browser
		  driver.quit();
		 
	 ArrayList <String> a=new ArrayList();
	 a.add("ranjit");
	 a.add("srit");
	 a.add("1");
	 System.out.println(a.contains("ranjit"));
	 for(String al: a) {
		 System.out.println(al);
	 }
	 for(int i=0;i<a.size();i++) {
		 System.out.println(a.get(i));
	 }
	 System.out.println(a);	
	//to covret the norml array to arraylist means use Arrays 
	 String []abc= {"prani","niki"};
	 List <String>name =Arrays.asList(abc);
	 System.out.println(name);
	 //string is a object//string literal
	 String s="praneetha";
	 String s1="praneetha";
	 //if value is same then it will point to previous object wont create new
	 //using new word
	 String s3=new String("Ranjit");
	 String s4=new String("Ranjit");
	 //no matter if value is same it will create separate objects
	 String s5="niki in srit";
	 
	 //.out.println(s5.concat(s));
	 //String [] splittedarray=s5.split("in");
	 //System.out.println(splittedarray[0]);
	 
	 }
	 
	}
	

