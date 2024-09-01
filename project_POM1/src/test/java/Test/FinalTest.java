package Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import Generics.BaseTest;
import pageclasses.BoxSets;
import pageclasses.Homepage;
import pageclasses.Requestpage;
public class FinalTest extends BaseTest{
 Homepage hPage;
 Requestpage rpage;
 BoxSets Bpage;
 public static void capture(WebDriver driver, int n) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//using getscreenshotAs() to take screenshot

		File image = ts.getScreenshotAs(OutputType.FILE);
		
		File img = new File("/Users/hiteshpkumar/Documents/workspace-spring-tool-suite-4-4.23.1.RELEASE/project_POM1/target/Screenshots"+n+".png");
		
		FileUtils.copyFile(image, img); 
	}
	
 @Test(priority=1)
 public void Bookicon() throws IOException {
     // Initialize the Homepage page object
     hPage = new Homepage(driver);
     hPage.getBOOKicon().click();
     test.log(LogStatus.PASS, "Navigated to  Bookicon");
   
 }
 @Test(priority=-1)
 public void NewArrivals() throws IOException {
     // Initialize the Homepage page object
     hPage = new Homepage(driver);
     hPage.getNewArrivals().click();
     driver.findElement(By.cssSelector("[href=\"https://www.bookswagon.com/book/hidden-hindu-trilogy-gupta-akshat/9780143467359\"]")).click();
     Bpage = new BoxSets(driver);
     Bpage.getAddtocart().click();
     capture(driver,1);
     test.log(LogStatus.PASS, "Navigated to NewArrivals and added to cart");
 }
 @Test(priority=3)
 public void setboxpage() throws IOException {
 	hPage = new Homepage(driver);
 	hPage.getBoxSets().click();
 	Bpage = new BoxSets(driver);
     Bpage.getBook().click();
     Bpage.getAddtocart().click();
     Bpage.getBuynow().click();
     capture(driver,2);
     test.log(LogStatus.PASS, "Navigated to setboxs and added to cart and added to buynow");
 }


 @Test(priority=4)
 public void setboxpage2() throws IOException {
 	hPage = new Homepage(driver);
 	hPage.getBoxSets().click();
 	Bpage = new BoxSets(driver);
     Bpage.getBook().click();
     Bpage.getAddtocart().click();
     capture(driver,3);
 	
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     test.log(LogStatus.PASS, "Navigated to setboxs2");
 }
 @Test(priority=5)
 public void setboxpage3() throws IOException {
 	hPage = new Homepage(driver);
 	hPage.getBoxSets().click();
 	Bpage = new BoxSets(driver);
     Bpage.getBook().click();
    Bpage.getSeedetails().click();
    capture(driver,4);
    test.log(LogStatus.PASS, "Navigated to setboxs and click on see details");

  }
  
 @Test(priority=6)
 public void setboxpage4() throws IOException {
 	hPage = new Homepage(driver);
 	hPage.getBoxSets().click();
 	Bpage = new BoxSets(driver);
     Bpage.getBook().click();
     Bpage.getAddtocart().click();
     capture(driver,5);
 	
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     SoftAssert as = new SoftAssert();
		as.assertEquals(driver.findElements(By.cssSelector("[id=\"ctl00_phBody_BookCart_lvCart_ctrl0_lblProductTitle\"]")), "The Hidden Hindu");
		capture(driver,6);
		test.log(LogStatus.PASS, "Navigated to setboxs and asserted the book");
		
 }
 @Test(priority=-2)
 public void setboxpage5() throws IOException {
 	hPage = new Homepage(driver);
 	hPage.getBoxSets().click();
 	Bpage = new BoxSets(driver);
     Bpage.getBook().click();
     Bpage.getAddtocart().click();
     Bpage.getSeedetails().click();
     capture(driver,7);
     test.log(LogStatus.PASS, "Navigated to setboxs and added to cart");
 	
		
 }
 @Test(priority=7)
 public void Bestsellers() throws IOException {
     // Initialize the Homepage page objec
     hPage = new Homepage(driver);
     hPage.getBestsellers().click();
     driver.findElement(By.cssSelector("[href=\"https://www.bookswagon.com/book/atomic-habits-james-clear/9781847941831\"]")).click();
  
     //Bpage = new BoxSets(driver);

     Bpage.getBuynow().click();
     capture(driver,8);
     test.log(LogStatus.PASS, "Navigated to Bestsellers");
 	
 
 }
 @Test(priority=8)
 public void Awardwinners() throws IOException {
     // Initialize the Homepage page object
     hPage = new Homepage(driver);
     hPage.getAwardWinners().click();
     capture(driver,9);
     test.log(LogStatus.PASS, "Navigated to Awardwinners");
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
     driver.findElement(By.cssSelector("[href=\"https://www.bookswagon.com/book/red-white-royal-blue-casey/9781250316776\"]")).click();
     driver.findElement(By.cssSelector("[class=\"readmoredesc\"]")).click();
     Bpage = new BoxSets(driver);
     Bpage.getAddtocart();
   
 }
 @Test(priority=9)
 public void FeaturedAuthors() throws IOException {
     // Initialize the Homepage page object
     hPage = new Homepage(driver);
     hPage.getFeaturedAuthors().click();
     capture(driver,10);
 	
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     driver.findElement(By.cssSelector("[alt=\"Arundhati Roy\"]")).click();
    driver.findElement(By.cssSelector("[class=\"rdmore btnst\"]")).click();
    Bpage.getAddtocart();
    test.log(LogStatus.PASS, "Navigated to Feauture authors and view the details");
 }

 @Test(priority=10)
 public void FictionBooks() throws IOException {
     // Initialize the Homepage page object
     hPage = new Homepage(driver);
     hPage.getFictionBooks().click();
     capture(driver,11);
     test.log(LogStatus.PASS, "Navigated to Fictionbooks");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     SoftAssert as = new SoftAssert();
		as.assertEquals(driver.getTitle(), "Fiction Books");
     
 }
 @Test(priority=11)
 public void FeaturedAuthors1() throws IOException {
     // Initialize the Homepage page object
     hPage = new Homepage(driver);
     hPage.getFeaturedAuthors().click();
     capture(driver,12);
 	
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     driver.findElement(By.cssSelector("[alt=\"John Green\"]")).click();
    driver.findElement(By.cssSelector("[class=\"rdmore btnst\"]")).click();
    capture(driver,13);
    test.log(LogStatus.PASS, "Navigated to featureAuthors and view the details");
  
    
 }
@Test(priority=12)
 
 public void Requestabook1() throws IOException {
     // Initialize the Homepage page object
     hPage = new Homepage(driver);
     hPage.getRequestaBook().click();
     capture(driver,14);
 	
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     rpage = new Requestpage(driver);
     rpage.RequestpageForm2(isbn13, author, emailid);
     driver.findElement(By.cssSelector("[data-dismiss=\"modal\"]")).click();
     SoftAssert as = new SoftAssert();
		as.assertEquals(driver.getTitle(), "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com ");
		test.log(LogStatus.PASS, "Navigated to Requesta book and fill the form");
 }
@Test(priority=13)

public void Requestabook() throws IOException {
    // Initialize the Homepage page object
    hPage = new Homepage(driver);
    hPage.getRequestaBook().click();
    capture(driver,15);
	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    rpage = new Requestpage(driver);
    rpage.RequestpageForm1(isbn13, emailid, title, phonenumber);
    capture(driver,16);
    test.log(LogStatus.PASS, "Navigated to Requestabook");
}

}