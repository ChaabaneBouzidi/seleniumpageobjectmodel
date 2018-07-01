package test;

import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.TechFiosHomePage2;
import util.BrowserFactory;

public class TechFiosHomePageTest2 {


@Test
public void loginTest2() throws IOException{
		
WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
				
		
TechFiosHomePage2 loginPage3 = PageFactory.initElements(driver, TechFiosHomePage2.class);
		
			
loginPage3.login_demo();

driver.close();

driver.quit();
			
	
}
}


