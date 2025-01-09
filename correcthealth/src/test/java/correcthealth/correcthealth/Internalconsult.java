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

public class Internalconsult {
	WebDriver driver = new ChromeDriver();


@Test
public void f() throws InterruptedException {
	
	 driver.get("http://localhost:8090/CHCP/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Dev@9090");
	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	rememberme.click();
	driver.findElement(By.id("btn-login")).click();

	driver.findElement(By.xpath("//a[normalize-space()='Specialty Care']")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 	WebElement clickspsummary = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Specialty Care Status']")));
 	clickspsummary.click(); 
 	Thread.sleep(15000);
 	//Actions action = new Actions(driver);
 	//WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Internal Consult']"));
 	//action.moveToElement(we).click().build().perform();
 	WebElement internalconsult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Internal Consult']")));
 	internalconsult.click(); 
 	
 	Thread.sleep(5000);
 	
 	//Select Facility
    driver.findElement(By.xpath("//span[contains(text(),'Select Facility')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Acadia Parish");
    WebElement facility = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Acadia Parish Jail (182)']")));
    facility.click();
    
    //Select patientid
    driver.findElement(By.xpath("//span[@id='select2-autoCompleterPatientIDConsult-container']")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("182-P00015");
    WebElement patientid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'182-P00015')]")));
    patientid.click();
    
    //Select patientname
    driver.findElement(By.id("select2-autoCompleterPatientNameConsult-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Chargois");
    WebElement patientname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Chargois Brizenick')]")));
    patientname.click();
    
  //Select Destination
    driver.findElement(By.xpath("//span[contains(text(),'Select Destination')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Advanced");
    WebElement destination = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Advanced Eye CAre']")));
    destination.click();
    
    //Select referrer
    driver.findElement(By.xpath("//span[contains(text(),'Select Referrer')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("zee");
    WebElement referrer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='zee']")));
    referrer.click();
    
  //Select visitid
    driver.findElement(By.xpath("//span[contains(text(),'Select Visit ID')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("182-V00022");
    WebElement VISITID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='182-V00022']")));
    VISITID.click();

    
    //Select visitTYPE
      driver.findElement(By.xpath("//span[contains(text(),'Select Visit Type')]")).click();
      driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("OffSite");
      WebElement Visittype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='OffSite']")));
      Visittype.click();


      //Select Servicetype
        driver.findElement(By.xpath("//span[contains(text(),'Select Service Type')]")).click();
        driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("DentalOff");
        WebElement Servicetype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='DentalOff']")));
        Servicetype.click();

      //Select Status
        WebElement Status = driver.findElement(By.id("specialityCareStatus"));
        Select select4 = new Select(Status);
        select4.selectByVisibleText("Active");
       
      //Click Search
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
        search.click(); 
        
        //Click Clear
        WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
        clear.click(); 
        
    	//Resubmit edit
        WebElement resubmitupdateedit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_3119728']//a[contains(text(),'Resubmit')]")));
        resubmitupdateedit.click(); 
        driver.findElement(By.id("internalNotes")).sendKeys("Verify and Submit");
        driver.findElement(By.xpath("//button[@id='internalConsultResubmit1']")).click();
        driver.findElement(By.xpath("//img[@id='gotoSummary']")).click();
        
        //Complate Consult
        WebElement completeconsult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_3119728']//a[contains(text(),'Complete Consult')]")));
        completeconsult.click(); 
        driver.findElement(By.id("completeVisitNotes")).sendKeys("tESTED");
        driver.findElement(By.id("requestClosingDate")).click();
        driver.findElement(By.xpath("(//div[contains(text(),'10')])[5]")).click();
        driver.findElement(By.id("internalConsultComplete3")).click();
        WebElement Okaybutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='Ok'])[1]")));
        Okaybutton.click(); 
        driver.findElement(By.id("gotoSummary")).click();
        
  }
}
