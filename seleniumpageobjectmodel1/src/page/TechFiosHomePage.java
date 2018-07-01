package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFiosHomePage {


WebDriver driver;
	
	public TechFiosHomePage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.XPATH,using="//text()[contains(.,'CRM')]/ancestor::a[1]--------XPATH FOR CRM LINK\r\n" + 
			"")
	WebElement crmlink1;
	
	@FindBy(how=How.XPATH,using="//text()[contains(.,'CRM')]/ancestor::a[1]--------XPATH FOR CRM LINK\r\n" + 
			"")
	WebElement crmlink;
	 public void publish1(){
	
			crmlink.click();
		}




   public void validatehomepage(){
    	
	  if (driver.findElement(By.xpath("crm")).isDisplayed())
	  
	  {
		  System.out.println("Home page opened");
		  
	  }
    
    	 
     }


}
