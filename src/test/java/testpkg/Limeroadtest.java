package testpkg;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import basepkg.Baseclasssnapdeal;
import pagepkg.Limeroadsignuppage;

public class Limeroadtest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.limeroad.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void pagelogin() throws IOException,InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		Limeroadsignuppage  ob=new Limeroadsignuppage(driver);
		
		//ob.signUp("9496437240");
	   // ob.login();
		ob.searchText();
		Thread.sleep(2);
		//ob.selectFirstproduct();
		ob.addtocartTest();
		
				
		
	}
	
	/*@AfterTest
	public void tearDown()
	{
		driver.quit();
	}*/
	
	
	
	
	

}
