package page;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFiosHomePage2 {

	
	public WebDriver driver;
	
	public TechFiosHomePage2(WebDriver lldriver){
		
		this.driver=lldriver;
	}
	// username=Id= user_login
	@FindBy(how=How.ID,using="username")
	WebElement username;
	
	@FindBy(how=How.ID,using="password")
	WebElement password;
	
	@FindBy(how=How.NAME, using="login")
	WebElement sign_in;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[2]/a")
	WebElement CRM;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[2]/ul/li[1]/a")
	WebElement addcontact;
	

public void login_demo() {
	// TODO Auto-generated method stub
	username.sendKeys("techfiosdemo@gmail.com");
	password.sendKeys("abc123");
	sign_in.click();
	//CRM.click();
	//addcontact.click();
	
}
}




    
