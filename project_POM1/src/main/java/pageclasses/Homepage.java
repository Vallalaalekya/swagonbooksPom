package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {WebDriver driver;
public Homepage(WebDriver driver) {//its coming from outside
	//we need to use the constructor to initialize the driver from base test
	
   this.driver=driver;
   //for calling the class variable to refer the global variable
   
   PageFactory.initElements(driver, this);
   
}


    // Locator for the "Request a Book" link

   @FindBy(linkText= "Request a Book")
    private WebElement RequestaBook;
   //Locator for the "New Arrivals"
   @FindBy(linkText= "New Arrivals")
   private WebElement NewArrivals;
   //Locator for the "Box Sets"
   @FindBy(linkText= "Box Sets")
   private WebElement BoxSets ;
 //Locator for the "Bestsellers"
   @FindBy(linkText= "Best sellers")
   private WebElement Bestsellers ;
 //Locator for the "Fictionbooks"
   @FindBy(linkText= "Fiction Books")
   private WebElement FictionBooks ;
 //Locator for the "Awardwinners"
   @FindBy(linkText= "Award Winners")
   private WebElement AwardWinners ;
 //Locator for the "Featured Authors"
   @FindBy(linkText= "Featured Authors")
   private WebElement FeaturedAuthors ;
   @FindBy(css="[class=\"desktopdropdowninit dropdown-toggle\"]")
	private WebElement BOOKicon;
public WebDriver getDriver() {
	return driver;
}
public WebElement getRequestaBook() {
	return RequestaBook;
}
public WebElement getNewArrivals() {
	return NewArrivals;
}
public WebElement getBoxSets() {
	return BoxSets;
}
public WebElement getBestsellers() {
	return Bestsellers;
}
public WebElement getFictionBooks() {
	return FictionBooks;
}
public WebElement getAwardWinners() {
	return AwardWinners;
}
public WebElement getFeaturedAuthors() {
	return FeaturedAuthors;
}
public WebElement getBOOKicon() {
	return BOOKicon;
}






}
  
   