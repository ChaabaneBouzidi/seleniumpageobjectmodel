package page;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCashPage {
		
		WebDriver driver;
		
		public BankAndCashPage(WebDriver driver){
			
			this.driver=driver;
		}
		// username=Id= user_login
		@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[5]/a")
		WebElement BankCash_click;
		
		@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a")
		WebElement NewAccount;
		
		@FindBy(how=How.ID, using="account")
		WebElement account;
		
		@FindBy(how=How.ID,using="description")
		WebElement description;
		
		@FindBy(how=How.ID,using="balance")
		WebElement Initial_balance;
		
		@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
		WebElement Submitbuton;

	public void New_contact() {
		// TODO Auto-generated method stub
		BankCash_click.click();
		NewAccount.click();
		account.sendKeys("hamourabi");
		description.sendKeys("New User");
		Initial_balance.sendKeys("1000");
		Submitbuton.click();
	}
	}




	    






