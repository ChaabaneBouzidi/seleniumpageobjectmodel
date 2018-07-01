package test;

import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.DashBoardPage;
import page.TechFiosHomePage2;
import util.BrowserFactory;

public class DashBoardTest {


@Test
public void loginTest7() throws IOException{
		
WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
				
		
TechFiosHomePage2 loginPage3 = PageFactory.initElements(driver, TechFiosHomePage2.class);
		
			
loginPage3.login_demo();

DashBoardPage loginPage8 = PageFactory.initElements(driver, DashBoardPage.class);


loginPage8.validatedashboardpage();
loginPage8.validateIncomeExpenseCurve();
loginPage8.validateWelcomeTechFios();
loginPage8.validateSearchCustomers();
loginPage8.validateNetWorkAccountBalanceTable();
loginPage8.validateIncomeVSExpenseGraph();
loginPage8.validateRecentInvoicesTable();
loginPage8.validateLatestExpenseTable();
loginPage8.validateLatestIncomeTable();


driver.close();

driver.quit();
			
	
}
}




