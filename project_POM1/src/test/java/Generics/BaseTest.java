package Generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class BaseTest {
	
	protected WebDriver driver;
	String origin;
	public String isbn13;
	public String author;
	public String emailid;
	public String title;
	public String quantity;
	public String phonenumber;
	protected ExtentTest test;
	protected ExtentReports report;
	
	
	@BeforeClass
	public void reportconfig() {
		//step -1 create object of extent report class
		
		 report = new ExtentReports("/Users/hiteshpkumar/Documents/workspace-spring-tool-suite-4-4.23.1.RELEASE/project_POM1/target.reporthtml");
		 test= report.startTest("bookswagon.comreport");
	
		
	}
	
	@BeforeMethod(alwaysRun = true)
	
	public void setup() throws IOException{
		driver = new ChromeDriver();
		Properties pr = new Properties();
		 FileInputStream fis= new FileInputStream("/Users/hiteshpkumar/Documents/workspace-spring-tool-suite-4-4.23.1.RELEASE/project_POM1/src/test/resources/config.properties");
		pr.load(fis);
		origin = pr.getProperty("url");
		isbn13 = pr.getProperty("isbn13");
		author = pr.getProperty("author");
		emailid = pr.getProperty("emailid");
		title = pr.getProperty("title");
		quantity = pr.getProperty("quantity");
		phonenumber = pr.getProperty("phonenumber");
		driver.get(origin);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		test.log(LogStatus.PASS, "Browser opened");
	}
	@AfterMethod
	public void teardown() {
		
		driver.close();
		test.log(LogStatus.PASS, "Browser closed");
	}
	@AfterClass
	public void flush() {
		
		report.flush();
		report.endTest(test);
	}


}
