package pageclasses;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class BoxSets{WebDriver driver;

	public BoxSets(WebDriver driver) {
		 
	this.driver=driver;
		 
	PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css="[src=\"https://www.bookswagon.com/productimages/images200/754/9780008387754.jpg\"]")
	private WebElement book;

	@FindBy(css="[class=\"seedetailall\"]")
	private WebElement Seedetails;
	@FindBy(css="[id=\"besticon\"]")
	private WebElement Besticon ;
	@FindBy(css="[src=\"https://www.bookswagon.com/images/icons/easy-return.png\"]")
	private WebElement premiumquality;
	@FindBy(css="[src=\"https://www.bookswagon.com/images/icons/certified-product.png\"]")
	private WebElement certifiedproduct;
	@FindBy(css="[src=\"https://www.bookswagon.com/images/icons/moneyback-guarantee.png\"]")
	private WebElement moneybackguarantee;
	@FindBy(css="[src=\"https://www.bookswagon.com/images/icons/secure-express.png\"]")
	private WebElement securecheckout;
	@FindBy(css="[src=\"https://www.bookswagon.com/images/icons/ontime-delivery.png\"]")
	private WebElement ontimedelivery;
	@FindBy(css="[id=\"btnAddtocart\"]")
	private WebElement Addtocart ;
	@FindBy(css="[id=\"lblcartmsg_32832903\"]")
	private WebElement Buynow ;
	@FindBy(css="[id=\"divNotifyMsg\"]")
	private WebElement wishlist ;
	public WebElement getBook() {
		return book;
	}
	public WebElement getSeedetails() {
		return Seedetails;
	}
	public WebElement getBesticon() {
		return Besticon;
	}
	public WebElement getPremiumquality() {
		return premiumquality;
	}
	public WebElement getCertifiedproduct() {
		return certifiedproduct;
	}
	public WebElement getMoneybackguarantee() {
		return moneybackguarantee;
	}
	public WebElement getSecurecheckout() {
		return securecheckout;
	}
	public WebElement getOntimedelivery() {
		return ontimedelivery;
	}
	public WebElement getAddtocart() {
		return Addtocart;
	}
	public WebElement getBuynow() {
		return Buynow;
	}
	public WebElement getWishlist() {
		return wishlist;
	}
	


	}
