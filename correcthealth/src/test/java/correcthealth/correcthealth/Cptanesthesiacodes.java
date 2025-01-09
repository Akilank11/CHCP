package correcthealth.correcthealth;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Cptanesthesiacodes {
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
	@Test (enabled=false)
	public void f() throws InterruptedException {
		  driver.get("http://localhost:8090/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement ratemanagement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Rate Management']")));
		 	ratemanagement.click(); 
		 	Thread.sleep(3000);
		 	WebElement cptanesthesiacode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='CPT Anesthesia Codes']"))); 
		 	cptanesthesiacode.click();
	  Thread.sleep(2000);
	  
	  
	  //Add New Data
	
	
	
	  driver.findElement(By.id("cptcode")).sendKeys("11010");
	  
      
      driver.findElement(By.id("baseunits")).sendKeys("33.54");

      
    //select Effectivedate
      driver.findElement(By.id("effectiveDate")).click();
      WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement Effectivedate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[12]")));
      Effectivedate.click();
      WebElement Effectivedateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='18'][data-month='1'][data-year='2025']")));
      Effectivedateselect.click();

Thread.sleep(2000);
      
WebElement status = driver.findElement(By.name("status"));
Select statusselect = new Select(status);
statusselect.selectByVisibleText("Pending");
Thread.sleep(1500);

      driver.findElement(By.id("addNewData")).click();
      
	}  
      
	
	@Test (enabled=false)
  	public void searchandupdate() throws InterruptedException {
  		  driver.get("http://localhost:8090/CHCP/login");
  		 	driver.manage().window().maximize();
  		 	
  		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
  		 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
  		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
  		 	rememberme.click();
  		 	driver.findElement(By.id("btn-login")).click();

  		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  		 	WebElement ratemanagement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Rate Management']")));
  		 	ratemanagement.click(); 
  		 	Thread.sleep(3000);
  		 	WebElement cptanesthesiacode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='CPT Anesthesia Codes']"))); 
		 	cptanesthesiacode.click();
  	  Thread.sleep(8000);
      
  	  
  	  //Searchandupdate
  	  
  	 driver.findElement(By.id("cptcode")).sendKeys("11010");
    WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
    search.click(); 
    WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearNewData")));
    clear.click(); 
 Thread.sleep(2000);
 
 driver.findElement(By.id("baseunits")).sendKeys("33.54");
 search.click(); 
 clear.click(); 
 Thread.sleep(1500);

 
 driver.findElement(By.id("effectiveDate")).click();
 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
 WebElement Effectivedate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[12]")));
 Effectivedate.click();
 WebElement Effectivedateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='18'][data-month='1'][data-year='2025']")));
 Effectivedateselect.click();
 search.click(); 
 clear.click(); 
 Thread.sleep(1500);
 WebElement status = driver.findElement(By.name("status"));
 Select statusselect = new Select(status);
 statusselect.selectByVisibleText("Pending");
 Thread.sleep(2000);
 
 search.click(); 
 clear.click();
 
 
 Thread.sleep(2000);
 WebElement checkboxclick = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_300']//input[@id='cptAnesthesiaCodeCheck']")));
 checkboxclick.click();
 driver.findElement(By.id("inactiveTran1")).click();
 Thread.sleep(1000);
 driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
 Thread.sleep(1000);
 driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
 Thread.sleep(1000);
 WebElement pagenavigation = driver.findElement(By.name("cptAnesthesiaCodesTable_length"));
 Select select4 = new Select(pagenavigation);
 select4.selectByVisibleText("200");
 Thread.sleep(3000);
 WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cptAnesthesiaCodesTable_next")));
 nextpage.click();
 Thread.sleep(3000);
 WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cptAnesthesiaCodesTable_previous")));
 previous.click();
 Thread.sleep(4000);
 WebElement download = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/CHCP/resources/images/excel.png']")));
 download.click();
      }
	
	@Test 
	public void fileupload() throws InterruptedException {
		  driver.get("http://localhost:8090/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement ratemanagement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Rate Management']")));
		 	ratemanagement.click(); 
		 	Thread.sleep(3000);
		 	WebElement cptanesthesiacode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='CPT Anesthesia Codes']"))); 
		 	cptanesthesiacode.click();
	  Thread.sleep(5000);
	  
	  
	  //Add File Upload
	  WebElement fileupload = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='addRow']")));
	  fileupload.click(); 
	  Thread.sleep(1000);
	  WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement fileInput = wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("masterDocFiles")));
	  File fileToUpload = new File("C:\\Users\\panini019\\Desktop\\Nov\\CH_consolidated_excel.xlsx"); // Update with the path to your PNG file
	  fileInput.sendKeys(fileToUpload.getAbsolutePath());
	  driver.findElement(By.id("fileUploadStartDate")).click();
	  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement Startdate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[24]")));
	  Startdate.click();
	  WebElement Startdateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='18'][data-month='1'][data-year='2025']")));
	  Startdateselect.click();
	  driver.findElement(By.id("fileUploadEndDate")).click();
	  WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement enddate = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[30]")));
	  enddate.click();
	  enddate.click();
	   WebElement enddateselect = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='11'][data-month='2'][data-year='2025']")));
	   enddateselect.click();
	   driver.findElement(By.id("select2-autoCompleterVendorIdUpload-container")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("3M COMPANY");
		  Thread.sleep(2000);
		  WebElement vendor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='3M COMPANY']")));
		  vendor.click();
		  
		  
	  driver.findElement(By.xpath("//input[@id='uploadDateCheckBox']")).click();
	  driver.findElement(By.xpath("//button[normalize-space()='Upload File']")).click();
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
	  Thread.sleep(1500);
	  WebElement delete = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_97']//td[contains(@class,'delete-control fileDeleteBtn2')]")));
	  delete.click();
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
	  Thread.sleep(1000);
	  WebElement pagenavigation = driver.findElement(By.name("rateFilesTable_length"));
	  Select select4 = new Select(pagenavigation);
	  select4.selectByVisibleText("50");
	  Thread.sleep(3000);
	  WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rateFilesTable_next")));
	  nextpage.click();
	  Thread.sleep(3000);
	  WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rateFilesTable_previous")));
	  previous.click();
	  
	  
	}
}
