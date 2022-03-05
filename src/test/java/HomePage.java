import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy (xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement starttheenrollment;

    @FindBy (xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailfield;

    @FindBy (xpath ="/html/body/section[2]/div/div/div/button" )
    private WebElement clickonsubmitbutton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement clickvirtualreadmore;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybridtext;

    @FindBy (xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement clickonreadnmorefundamentalsbutton;

    @FindBy (xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/p[2]")
    private WebElement readmorefundamentalstext;

    @FindBy (xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement clickonlearnmoreseleniumbutton;

    @FindBy (xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/p[2]")
    private WebElement learnmoreseleniumtext;

    @FindBy (xpath = "/html/body/section[8]/div/div/div[1]/ul/li[4]")
    private WebElement enrollmentemailformat;

    @FindBy (xpath = "/html/body/section[8]/div/div/div[1]/ul/li[4]/span")
    private WebElement enrollmentemailtext;



    public HomePage(WebDriver driver) { super(driver);}


    public void ClickonStartTheEnrolment() {

        this.starttheenrollment.click();
    }

    public void InsertTextInEmailField(){
        this.emailfield.sendKeys("miha.floarea@yahoo.com");

    }

    public void ClickOnSubmitbutton() {
        this.clickonsubmitbutton.click();}

    public void ClickVirtualReadMore() {
        Utils.scrollToElement(driver, hybridtext);
        this.clickvirtualreadmore.click();
    }


    public void ClickReadMoreOfLearnFundamentals(){
        Utils.scrollToElement(driver, readmorefundamentalstext);
        this.clickonreadnmorefundamentalsbutton.click();

    }

    public void ClickOnLearnMoreSeleniumButton(){
        Utils.scrollToElement(driver, learnmoreseleniumtext);
        this.clickonlearnmoreseleniumbutton.click();
    }

    public String VerifyEnrollmentFormatEmail(){
        Utils.scrollToElement(driver, enrollmentemailtext);
        return this.enrollmentemailformat.getText();

    }
}

