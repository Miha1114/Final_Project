import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePageTests {
    protected static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Verify functionality for Start The Enrolment button on Home Page")
    public void ClickOnStartTheEnrolmentButton() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.ClickonStartTheEnrolment();
        EnrolmentPagePersonalInfo enrolmentPagePersonalInfo = new EnrolmentPagePersonalInfo(driver);
        Assert.assertEquals(enrolmentPagePersonalInfo.GetPersonalInformationHeader(), Constants.PERSONAL_INFORMATION);
    }

    @Test(testName = "Verifies if we can insert an email address in Home Page - email filed")
    public void InsertEmailAddressOnHomePage() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.InsertTextInEmailField();
        webForm.ClickOnSubmitbutton();
    }

    @Test(testName = "Verify if Virtual Read More button on Home Page is functional")
    public void VerifyFunctionalityOfVirtualReadMoreButton() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.ClickVirtualReadMore();
        VirtualPage virtualPage = new VirtualPage(driver);
        Assert.assertEquals(virtualPage.OpenStartVirtualPage(), Constants.VIRTUAL);
    }

    @Test(testName = "Verifiy functionality of Learn More button - Learn Of Fundamentals")
    public void ClickReadMoreButtonOfLearnFundamentals() {
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.ClickReadMoreOfLearnFundamentals();
        FundamentalsPage fundamentalsPage = new FundamentalsPage(driver);
        Assert.assertEquals(fundamentalsPage.OpenFundamentalsPage(), Constants.FUNDAMENTALS_PAGE);
    }

    @Test (testName = "Verifiy if Read More of Learn Selenium button is functional")
    public void ClickReadMoreSeleniumPageButton(){
        driver.get(Utils.BASE_URL);
        HomePage webForm = new HomePage(driver);
        webForm.ClickOnLearnMoreSeleniumButton();
        SeleniumPage seleniumPage = new SeleniumPage(driver);
        Assert.assertEquals(seleniumPage.OpenSeleniumPage(), Constants.SELENIUM_PAGE);
    }

    @Test (testName = "Verify enrollment email format on Home Page")
    public void VerifyEnrollmentEmailFormat(){
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        homePage.VerifyEnrollmentFormatEmail();
        Assert.assertEquals(homePage.VerifyEnrollmentFormatEmail(), Constants.ENROLLMENT_EMAIL_FORMAT);
    }



    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
