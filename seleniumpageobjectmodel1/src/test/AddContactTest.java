package test;

import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.AddContactPage;
import page.TechFiosHomePage2;
import util.BrowserFactory;

public class AddContactTest {

@Test
public void loginTest4() throws IOException{
		
WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
				
TechFiosHomePage2 loginPage3 = PageFactory.initElements(driver, TechFiosHomePage2.class);


loginPage3.login_demo();

AddContactPage loginPage4 = PageFactory.initElements(driver, AddContactPage.class);
		
			
loginPage4.add_contact();

driver.close();

driver.quit();
			
	
}
}

