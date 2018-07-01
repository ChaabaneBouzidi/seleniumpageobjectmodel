package test;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.TechFiosloginPage;
import util.BrowserFactory;

public class TechFiosLoginTest {


@Test
public void loginTest() throws IOException{
		
WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
				
		
TechFiosloginPage loginPage = PageFactory.initElements(driver, TechFiosloginPage.class);
		
			
loginPage.login_demo();

driver.close();

driver.quit();
			
	
}
}
