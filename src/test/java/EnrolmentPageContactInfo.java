import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrolmentPageContactInfo extends PageObject {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactinformationtext;

    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement emailaddress;

    @FindBy (xpath = "//*[@id=\"phone\"]")
    private WebElement phonenumber;

    @FindBy (xpath = "//*[@id=\"country\"]")
    private WebElement insertcountry;

    @FindBy (xpath = "//*[@id=\"city\"]")
    private WebElement insertcity;

    @FindBy (xpath = "//*[@id=\"postCode\"]")
    private WebElement insertpostcode;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement clicknextcontactinfobutton;

    public EnrolmentPageContactInfo(WebDriver driver) { super(driver);}

    public String OpenContactInfo (){
        return this.contactinformationtext.getText();

    }

    public void ClickNextButtonOnContactInfo(){
        this.clicknextcontactinfobutton.click();
    }

    public void FillInInformationInContactInfo(){
        emailaddress.sendKeys("Miha.Floarea@gmail.com");
        phonenumber.sendKeys("0723111123");
        insertcountry.sendKeys("Romania");
        insertcity.sendKeys("Brasov");
        insertpostcode.sendKeys("500388");
        clicknextcontactinfobutton.click();


    }


}



