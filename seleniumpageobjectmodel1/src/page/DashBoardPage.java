package page;

import org.junit.Assert;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {

WebDriver driver;
	
	public DashBoardPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[1]/div")
	WebElement IncomeToday;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/div")
	WebElement ExpenseToday;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[3]/div/div")
	WebElement IncomeThisMonth;

	@FindBy(how=How.XPATH, using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[4]/div")
	WebElement ExpenseThisMonth;
	
	
	
	@FindBy(how=How.XPATH, using="//*[@id=\"chart\"]/svg/g[1]/g[3]/g[1]/rect[12]")
	WebElement IncomeExpenseCurve;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[3]/a/span")
	WebElement WelcomeTechFios;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[1]/form/div/input")
	WebElement SearchCustomers;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"sort_2\"]/div[1]/div/div[2]")
	WebElement NetWorkAccountBalanceTable;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"sort_2\"]/div[2]/div/div[2]")
	WebElement IncomeVSExpenseGraph;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"sort_4\"]/div/div/div[2]")
	WebElement RecentInvoicesTable;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"sort_3\"]/div[1]/div/div[2]")
	WebElement LatestIncomeTable;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"sort_3\"]/div[2]/div/div[2]")
	WebElement LatestExpenseTable;
	
   public void validatedashboardpage(){
    	
	  if (IncomeToday.isDisplayed())
	  {
		  System.out.println("IncomeToday Page Displayed");		  
	  }
	  if (ExpenseToday.isDisplayed())		  
	  {
		  System.out.println("ExpenseToday Page Displayed");		  
	  }
	  if (IncomeThisMonth.isDisplayed())		  
	  {
		  System.out.println("IncomeThisMonth Page Displayed");		  
	  }
	  if (ExpenseThisMonth.isDisplayed())		  
	  {
		  System.out.println("ExpenseThisMonth Page Displayed");		  
	  }
    	 
      }

   public void validateIncomeExpenseCurve(){
   	
		  if (IncomeExpenseCurve.isDisplayed())
		  {
			  System.out.println("IncomeExpense Curve  Displayed");		  
		  }
          }

   public void validateWelcomeTechFios(){
	   	
		  if (WelcomeTechFios.isDisplayed())
		  {
			  System.out.println("WelcomeTechFios box Displayed");		  
		  }
          }
   
   public void validateSearchCustomers(){
	   	
		  if (SearchCustomers.isDisplayed())
		  {
			  System.out.println("SearchCustomers box Displayed");		  
		  }
          }
   
   public void validateNetWorkAccountBalanceTable(){
	   	
		  if (NetWorkAccountBalanceTable.isDisplayed())
		  {
			  System.out.println("NetWorkAccountBalance Table Displayed");		  
		  }
          }
   
   public void validateIncomeVSExpenseGraph(){
	   	
		  if (IncomeVSExpenseGraph.isDisplayed())
		  {
			  System.out.println("IncomeVSExpense Graph Displayed");		  
		  }
          }
   
   public void validateRecentInvoicesTable(){
	   	
		  if (RecentInvoicesTable.isDisplayed())
		  {
			  System.out.println("RecentInvoices Table Displayed");		  
		  }
          }
   
   public void validateLatestExpenseTable(){
	   	
		  if (LatestExpenseTable.isDisplayed())
		  {
			  System.out.println("LatestExpense Table Displayed");		  
		  }
          }
   
   public void validateLatestIncomeTable(){
	   	
		  if (LatestIncomeTable.isDisplayed())
		  {
			  System.out.println("LatestIncome Table Displayed");		  
		  }
          }
   
  

}

