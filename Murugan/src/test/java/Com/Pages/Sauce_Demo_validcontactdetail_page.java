package Com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Com.Excel.Excel_utility;

public class Sauce_Demo_validcontactdetail_page  {
	WebDriver driver;
	By username= By.id("user-name");
	By password=By.id("password");
	By login=By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");
    By option=By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	By About=By.id("about_sidebar_link");
	By company=By.linkText("Company");
	By Technology_Alliance=By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[5]/div[2]/div/div/div/ul/li/div/ul/li/div/ul/li[4]/div/ul/li/ul/li[1]/a");
	By cookies=By.xpath("/html/body/div[1]/div/a");
	By contact_us=By.linkText("Contact us");
	By fname=By.id("FirstName");
    By lname=By.id("LastName");
    By companyname=By.id("Company");
    By valid_email_id=By.id("Email");
    By company_size=By.id("Company_Size__c");
    By phoneno =By.id("Phone");
    By partnership_interest=By.id("Notes__c_account");
    By comments=By.id("Sales_Contact_Comments__c");
    By submit=By.xpath("//*[@id=\"mktoForm_1193\"]/div[13]/span/button");	
    
  //To open the chromedriver
	public void url()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	//To go the homepage of the saucedemo
	public void homepage()
	{
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
	}
	
	//To login the details in the saucedemo using username and password
	public void login() throws IOException, InterruptedException
	{
		Excel_utility excel= new Excel_utility();
		
		driver.findElement(username).sendKeys(excel.excel_username(1));
		Thread.sleep(2000);
	    driver.findElement(password).sendKeys(excel.excel_password(1));
	    Thread.sleep(2000);
	    driver.findElement(login).click();
	}
	
	//To check the technology alliance in company field for valid details
	public void valid_partner_details() throws InterruptedException
	{   
		driver.findElement(option).click();
		Thread.sleep(2000);
		driver.findElement(About).click();
		Thread.sleep(2000);
		driver.findElement(company).click();
		Thread.sleep(2000);
	    driver.findElement(Technology_Alliance).click();
	    Thread.sleep(2000);
	  //To remove the cookies in the page
	    driver.findElement(cookies).click();
	    Thread.sleep(3000);
	  //Scroll to click the contact us button
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = driver.findElement(By.linkText("Contact us"));
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	  //To click the contact us using the ENTER keys
		driver.findElement(contact_us).sendKeys(Keys.ENTER);
	  //To handle the second window and send the values in the second window
		Set<String> winHandles = driver.getWindowHandles();
		System.out.println("The number of windows handles are" +winHandles.size());
		for(String winHandle:winHandles)
		{
			driver.switchTo().window(winHandle);
			
		}
		driver.findElement(fname).sendKeys("murugan");
		Thread.sleep(2000);
		driver.findElement(lname).sendKeys("ravi");
		Thread.sleep(2000);
		driver.findElement(companyname).sendKeys("gsd");
		Thread.sleep(2000);
		driver.findElement(valid_email_id).sendKeys("muru@gmail.com");
		Thread.sleep(2000);
		Select size = new Select(driver.findElement(company_size));
		size.selectByValue("51-100");
		Thread.sleep(2000);
		driver.findElement(phoneno).sendKeys("5745441541");
		Thread.sleep(2000);
		Select partnership = new Select(driver.findElement(partnership_interest));
		partnership.selectByValue("Technology Partner");
		Thread.sleep(2000);
		driver.findElement(comments).sendKeys("gjiugs");
		Thread.sleep(2000);
		driver.findElement(submit).click();
		
		WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"entry-6tzZTZm0qmjXHtdxEmFEca\"]/div/div[2]/div[2]/div/div/p"));
	    js.executeScript("arguments[0].scrollIntoView();", Element1);
	    Thread.sleep(2000);
	    
	}

	//To take Screenshot of the Technology alliance for the Valid partner details
	public void screenshot(String path) throws IOException, InterruptedException
	{
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src,new File(path));					
}

	//To close the browser
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
