package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Requestpage {WebDriver driver;

public Requestpage(WebDriver driver) {
	 
this.driver=driver;
	 
PageFactory.initElements(driver, this);
}
	@FindBy(css= "[name=\"ctl00$phBody$RequestBook$txtISBN\"]")
	private WebElement ISBN13;
	@FindBy(css="[name=\"ctl00$phBody$RequestBook$txtAuthor\"]")
	private WebElement Author;
	@FindBy(css= "[name=\"ctl00$phBody$RequestBook$txtEmailReq\"]")
	private WebElement Emailid;
	@FindBy(css= "[value=\"Verify Email\"]")
	private WebElement Verifyemail;
	@FindBy(css= "[name=\"ctl00$phBody$RequestBook$txtTitle\"]")
	private WebElement Title;
	@FindBy(css= "[name=\\\"ctl00$phBody$RequestBook$txtQty\\\"]")
	private WebElement Quantity ;
	@FindBy(css="[name=\"ctl00$phBody$RequestBook$txtPhone\"]")
	private WebElement Phonenumber;
	@FindBy(css="[value=\"Submit\"]")
	private WebElement Submit;



	public WebElement getISBN13() {
		return ISBN13;
	}


	public WebElement getAuthor() {
		return Author;
	}


	public WebElement getEmailid() {
		return Emailid;
	}


	public WebElement getVerifyemail() {
		return Verifyemail;
	}


	public WebElement getTitle() {
		return Title;
	}


	public WebElement getQuantity() {
		return Quantity;
	}


	public WebElement getPhonenumber() {
		return Phonenumber;
	}


	public WebElement getSubmit() {
		return Submit;
	}


public void RequestpageForm(String isbn13,String author ,String emailid,String title,String quantity,String phonenumber) {
	            ISBN13.sendKeys(isbn13);
		        Author.sendKeys(author);
		        Emailid.sendKeys(emailid);
		        Title.sendKeys(title);
		        Quantity.sendKeys(quantity);
		        Phonenumber.sendKeys(phonenumber);
		        Submit.click();
		        
}        
		        
		        public void RequestpageForm2(String isbn13,String author ,String emailid) {
		            ISBN13.sendKeys(isbn13);
			        Author.sendKeys(author);
			        Emailid.sendKeys(emailid);
			        Verifyemail.click();
		        }   
			        public void RequestpageForm1(String isbn13,String emailid,String title,String phonenumber) {
			            ISBN13.sendKeys(isbn13);
				        //Author.sendKeys(author);
				        Emailid.sendKeys(emailid);
				        Title.sendKeys(title);
				       // Quantity.sendKeys(quantity);
				        Phonenumber.sendKeys(phonenumber);
				        Submit.click();
				          
		    }

	}

