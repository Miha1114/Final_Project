import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrolmentPagePersonalInfo extends PageObject {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement startEnrollmentHeader;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstname;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastname;

    @FindBy (xpath = "//*[@id=\"username\"]")
    private WebElement username;

    @FindBy (xpath = "//*[@id=\"password\"]")
    private WebElement password;

    @FindBy (xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmpassword;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement clicknextbutton;

    public EnrolmentPagePersonalInfo(WebDriver driver) { super(driver);}

    public void InsertTextInFirstName(){
        this.firstname.sendKeys("Miha");}

    public void InsertTextInLastName(){
        this.lastname.sendKeys("Floarea");}


    public void InsertUserName(){
        this.username.sendKeys("MihaFloarea");}

    public void InsertPassword(){
        this.password.sendKeys("Miha_01");}

    public void ConfirmPassword(){
        this.confirmpassword.sendKeys("Miha_01");}


    public String GetPersonalInformationHeader() {
        return this.startEnrollmentHeader.getText();

    }

    public void ClickOnNextButton() {
        this.clicknextbutton.click();
    }

    public void FillInInformationInPersonalInfo() {
        InsertTextInFirstName();
        InsertTextInLastName();
        InsertUserName();
        InsertPassword();
        ConfirmPassword();
    }
}