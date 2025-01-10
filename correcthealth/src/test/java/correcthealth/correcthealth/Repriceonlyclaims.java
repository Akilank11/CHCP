package correcthealth.correcthealth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Repriceonlyclaims {
	WebDriver driver = new ChromeDriver();
	//WebDriver driver;
	//FirefoxOptions firefoxoptions = new FirefoxOptions();
	//ChromeOptions chromeoptions = new ChromeOptions();
	//EdgeOptions edgeoptions = new EdgeOptions();

	//@Parameters("browser")
	//@BeforeTest

	//public void initialize(String browser) 

	//{
		// if (browser.equalsIgnoreCase("chrome")) {
	          
	           // driver = new ChromeDriver();
	        //} else if (browser.equalsIgnoreCase("firefox")) {
	            
	            //driver = new FirefoxDriver();
	       // } else if (browser.equalsIgnoreCase("edge")) {
	           
	            //driver = new EdgeDriver();
	        //}
	        //driver.manage().window().maximize();
	    //}
	
	@Test (enabled=true)
	public void f() throws InterruptedException {
		  driver.get("http://localhost:8090/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Invoices = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Invoices']")));
		 	Invoices.click(); 
		 	Thread.sleep(3000);
		 	WebElement Repriceonlyclaims = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Reprice Only Claims']"))); 
		 	Repriceonlyclaims.click();
	  Thread.sleep(2000);
	  
	  
	  //Create New Invoice
	  driver.findElement(By.xpath("//button[normalize-space()='Create New Reprice Only Claims']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("invoiceDate")).click();
	  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement invoicedate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[15]")));
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
      invoicedate.click();
       WebElement invoicedateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='2'][data-year='2024']")));
       invoicedateselect.click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[normalize-space()='>>']")).click();
	  driver.findElement(By.xpath("(//input[@placeholder='Filter'])[2]")).sendKeys("Lau");
	  Actions act = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]/option[1]")); 
	act.doubleClick(ele).perform();
	driver.findElement(By.xpath("//button[@id='pushInvoiceData1']")).click();
	Thread.sleep(40000);
	WebElement okay = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='ok']"))); 
	okay.click();
	Thread.sleep(1500);
	driver.findElement(By.id("generateInvoicePDF1")).click();
	Thread.sleep(5000);
	
	}
	
	//Search Function 
	//Facility
	@Test (enabled=false)
	public void edit() throws InterruptedException {
		  driver.get("http://localhost:8090/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Invoices = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Invoices']")));
		 	Invoices.click(); 
		 	Thread.sleep(3000);
		 	WebElement Repriceonlyclaims = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Reprice Only Claims']"))); 
		 	Repriceonlyclaims.click();
	  Thread.sleep(2000);
	  
	  //Edit
	  driver.findElement(By.xpath("//tr[@id='row_70']//td[@class=' edit-control btnCol']")).click();
	  
	  //Facility
	  WebElement Facility = driver.findElement(By.name("facilityIdFilter"));
      Select Facilityselect = new Select(Facility);
      Facilityselect.selectByVisibleText("Bartow County Jail (114)	");
	 WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
	 search.click();
	 Thread.sleep(1000);
	 WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
	 clear.click();
	
	//Contract Type
	  WebElement CONTRACTTYPE = driver.findElement(By.name("contractTypeFilter"));
      Select CONTRACTTYPEselect = new Select(CONTRACTTYPE);
      CONTRACTTYPEselect.selectByVisibleText("CAP");
      Thread.sleep(1500);
		 search.click();
		 Thread.sleep(1000);
		 clear.click();
		 
		//Emailstatus
		  WebElement Email = driver.findElement(By.name("emailStatusFilter"));
	      Select Emailselect = new Select(Email);
	      Emailselect.selectByVisibleText("Email Sent");
	      Thread.sleep(1500);
			 search.click();
			 Thread.sleep(1000);
			 clear.click();
			 
			 //Invoice Date
			 driver.findElement(By.id("invoiceDateFilter")).click();
			  WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		      WebElement invoiceDateFilter = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[21]")));
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		      invoiceDateFilter.click();
		       WebElement invoiceDateFilterselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='2'][data-year='2024']")));
		       invoiceDateFilterselect.click();
		
		       Thread.sleep(1000);
				 search.click();
				 Thread.sleep(1000);
				 clear.click();
				 Thread.sleep(2000);
		
					
					
					//Download and Delete
					driver.findElement(By.xpath("//img[@class='download-control fileDownloadBtn']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//img[@class='download-control1 fileDownloadBtn']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//td[@class=' delete-control fileDeleteBtn']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[normalize-space()='cancel']")).click();
					Thread.sleep(1000);
					
				
	}
					
				//Summary Search and Delete
					@Test (enabled=false)
					public void searchdelete() throws InterruptedException {
						  driver.get("http://localhost:8090/CHCP/login");
						 	driver.manage().window().maximize();
						 	
						 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
						 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
						 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
						 	rememberme.click();
						 	driver.findElement(By.id("btn-login")).click();

						 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
						 	WebElement Invoices = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Invoices']")));
						 	Invoices.click(); 
						 	Thread.sleep(3000);
						 	WebElement Repriceonlyclaims = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Reprice Only Claims']"))); 
						 	Repriceonlyclaims.click();
					  Thread.sleep(2000);	
					
					//Invoice Date
						 driver.findElement(By.id("invoiceFromDateFilter")).click();
						  WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
					      WebElement invoiceDate = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					      invoiceDate.click();
					       WebElement invoiceDateFilterselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='2'][data-year='2024']")));
					       invoiceDateFilterselect.click();
					
					       Thread.sleep(1000);
							
					     //Invoice Date
							 driver.findElement(By.id("invoiceToDateFilter")).click();
							  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
						      WebElement invoiceDateto = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[10]")));
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      invoiceDateto.click();
						      
						      WebElement invoiceDatetoselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='3'][data-year='2024']")));
						       invoiceDatetoselect.click();
						
						       Thread.sleep(2000);
					
					driver.findElement(By.id("newSearch")).click();
					Thread.sleep(2000);
					driver.findElement(By.id("clearSearch")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//tr[@id='row_70']//td[contains(@class,'delete-control fileDeleteBtn')]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[normalize-space()='cancel']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//th[@aria-label='Invoice Date: activate to sort column ascending']")).click();
					Thread.sleep(2000);
					//Page navigation
			        WebElement pagenavigation = driver.findElement(By.name("repriceOnlyClaimsSummaryListTable_length"));
			        Select select4 = new Select(pagenavigation);
			        select4.selectByVisibleText("80");
			        Thread.sleep(3000);
			        WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("repriceOnlyClaimsSummaryListTable_next")));
			        nextpage.click();
			        Thread.sleep(5000);
			        WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("repriceOnlyClaimsSummaryListTable_previous")));
			        previous.click();
			        Thread.sleep(8000);
					
					}
}
