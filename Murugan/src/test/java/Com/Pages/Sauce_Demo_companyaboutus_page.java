package Com.Pages;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Excel.Excel_utility;

public class Sauce_Demo_companyaboutus_page {
	  WebDriver driver;

	By username= By.id("user-name");
	By password=By.id("password");
	By login=By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");
    By option=By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	By About=By.id("about_sidebar_link");
	By company=By.linkText("Company");
	By Aboutus=By.linkText("About Us");
	By company_view_sheet=By.linkText("View company fact sheet");
		
	public void url()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	//To go to the homepage of the saucedemo
	public void homepage()
	{
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
	}
	//To login the details in the saucedemo using username and password
	public void login(String name,String pass) throws IOException, InterruptedException
	{
		
		
		driver.findElement(username).sendKeys(name);
		Thread.sleep(2000);
	    driver.findElement(password).sendKeys(pass);
	    Thread.sleep(2000);
	    driver.findElement(login).click();
	    Thread.sleep(2000);

	}
	//To search the saucedemo about us in the company field
	public void company_about_us() throws InterruptedException
	{
		driver.findElement(option).click();
		Thread.sleep(2000);
		driver.findElement(About).click();
		Thread.sleep(2000);
		driver.findElement(company).click();
		Thread.sleep(2000);
		driver.findElement(Aboutus).click();
		driver.findElement(company_view_sheet).click();

        // Scroll to view the open company sheet 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

    //To take Screenshot of the company view sheet
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
