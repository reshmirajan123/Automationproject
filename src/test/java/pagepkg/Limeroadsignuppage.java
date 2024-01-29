package pagepkg;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Limeroadsignuppage {
	WebDriver driver;
	By profile=By.xpath("//*[@id=\"desktop_profile\"]/div[2]/div/div[2]");
	By login=By.xpath("//*[@id=\"desktop_profile_expand\"]/div[1]/div[3]/a");
	By mobile=By.xpath("//*[@id=\"emph\"]");
	By nextbtn=By.xpath("//*[@id=\"signinnewForm\"]/div[3]/input");
	By searchbtn=By.xpath("//*[@id=\"deskSearch\"]/a/div/div[2]");
	By searchfield=By.xpath("//*[@id=\"srcInpu\"]");
	WebElement search;
	By firstsaree=By.xpath("//*[@id=\"19471988\"]");
	WebElement firstitem;
	By addtocartbtn=By.xpath("//*[@id=\"views\"]/div/div/div[3]/div[1]/div[4]/div[6]/div[2]/div[2]");
	By carthome=By.xpath("//*[@id=\"cartB\"]/div[2]/div[2]");
			
   public Limeroadsignuppage(WebDriver driver)
    {
       this.driver=driver;
     
       
    }
    /* public void signUp(String mobno)
	{
  
    	
    	 driver.findElement(profile).click();
    	 driver.findElement(login).click();
    	 driver.findElement(mobile).sendKeys(mobno);
 

    	
    }
     public void login()
     {
    	 driver.findElement(nextbtn).click();
     }*/
   
   public void searchText()
   {
	   driver.findElement(searchbtn).click();
	   search=driver.findElement(searchfield);
	   search.sendKeys("sarees");
	   search.sendKeys(Keys.ENTER);
	   firstitem=driver.findElement(firstsaree);
	   firstitem.click();
	   driver.findElement(addtocartbtn).click();
	   
	  // firstitem.sendKeys(Keys.ENTER);
	  // driver.navigate().refresh();
	 // driver.navigate().forward();
	 // driver.findElement(carthome).click();
   }
   public void addtocartTest()
   {
	   driver.navigate().forward();
		driver.findElement(carthome).click();
   }
   
  
    
	
}

