package Auto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

public class Facebook {
	WebDriver driver;
//	Facebook fb=new Facebook();
	JSONParser parser = new JSONParser();
    Object obj;
//    System.out.println();
    JSONObject jsonObject;
    String uname;
    String pwd;
    
//    
	@Test
	public void facebook_login() {	
		System.out.println(uname);
		System.out.println(pwd);
		driver.findElement(By.id("email")).sendKeys(uname);
        driver.findElement(By.id("pass")).sendKeys(pwd);
        //driver.findElement(By.cssSelector("#u_0_2")).click();
        //driver.findElement(By.xpath(("*//input[contains(text(), 'Log In')]"))).click();
        driver.findElement(By.id("pass")).sendKeys(Keys.RETURN);
        //driver.findElement(By.id("u_0_5")).click();
        
	}
	@BeforeMethod
	public void BrowserOpen() throws FileNotFoundException, IOException, ParseException {
		// Create a new instance of the Firefox driver
		 obj = parser.parse(new FileReader("C:\\Users\\ajesuraj\\21_nov_Luna_workspace\\TestNG_Learning\\src\\Auto\\Data\\file1.json"));
		 jsonObject =  (JSONObject) obj;
		 uname = (String) jsonObject.get("username");
		 pwd = (String) jsonObject.get("password");
		  String exePath = "C:\\JUNIT\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", exePath);
		  ChromeOptions options = new ChromeOptions();
		  driver = new ChromeDriver(options);
	      driver.get("http://www.facebook.com");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		  ChromeOptions options = new ChromeOptions();
//		  options.addArguments("start-maximized");
//		  options.addArguments("test-type");
//		  options.addArguments("enable-strict-powerful-feature-restrictions");
//		  options.addArguments("disable-geolocation");
//		  DesiredCapabilities cap = DesiredCapabilities.chrome();
//		  cap.setCapability(ChromeOptions.CAPABILITY, options);
//		  cap = cap.merge(DesiredCapabilities.chrome());
//		  driver = new ChromeDriver();

	   
	  }
	 
	  @AfterMethod	 
	  public void afterMethod() {
	 	  // Close the driver
	      driver.quit();
	  }

	

}
