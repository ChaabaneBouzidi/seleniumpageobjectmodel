package page;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage {

	
	WebDriver driver;
	
	public AddContactPage(WebDriver llldriver){
		
		this.driver=llldriver;
	}
	// username=Id= user_login
	@FindBy(how=How.ID,using="account")
	WebElement FullName;
	
	@FindBy(how=How.ID,using="company")
	WebElement CompanyName;
	
	@FindBy(how=How.ID, using="email")
	WebElement Email;
	
	@FindBy(how=How.ID,using="phone")
	WebElement Phone;
	
	@FindBy(how=How.ID,using="address")
	WebElement Address;
	
	@FindBy(how=How.ID,using="city")
	WebElement City;
	
	@FindBy(how=How.ID,using="state")
	WebElement State_Region;
	
	@FindBy(how=How.ID,using="zip")
	WebElement PostalCode;
	
	@FindBy(how=How.ID,using="select2-country-container")
	WebElement Country;
	
	@FindBy(how=How.ID,using="submit")
	WebElement Submitbutton;

public void add_contact() {
	// TODO Auto-generated method stub
	FullName.sendKeys("chaabane bouzidi");
	CompanyName.sendKeys("techfios");
	Email.sendKeys("techfios@gmail.com");
	Phone.sendKeys("888 888 8888");
	Address.sendKeys("71523 bedford texas");
	City.sendKeys("Bedford");
	State_Region.sendKeys("Texas");
	PostalCode.sendKeys("75020");
	Country.sendKeys("Uited States");
	Submitbutton.click();
}
}




    




