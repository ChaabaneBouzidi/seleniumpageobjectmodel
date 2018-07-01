package test;

import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.AddContactPage;
import page.BankAndCashPage;
import page.TechFiosHomePage2;
import util.BrowserFactory;

public class BankCashTest {

	@Test
	public void loginTest6() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
					
	TechFiosHomePage2 loginPage3 = PageFactory.initElements(driver, TechFiosHomePage2.class);


	loginPage3.login_demo();

	BankAndCashPage loginPage5 = PageFactory.initElements(driver, BankAndCashPage.class);
			
				
	loginPage5.New_contact();;

	driver.close();

	driver.quit();
				
		
	}
	}



