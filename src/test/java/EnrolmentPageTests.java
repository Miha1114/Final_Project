import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EnrolmentPageTests {
    protected static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Fill in text in all fields of Enrollment Page - Personal Information and click Next Button")
    public void InsertTextInAllFileds() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        homePage.ClickonStartTheEnrolment();
        EnrolmentPagePersonalInfo personalInfo = new EnrolmentPagePersonalInfo(driver);
        personalInfo.FillInInformationInPersonalInfo();
        personalInfo.ClickOnNextButton();
        EnrolmentPageContactInfo contactInfo = new EnrolmentPageContactInfo(driver);
        Assert.assertEquals(contactInfo.OpenContactInfo(), Constants.CONTACT_INFORMATION);

    }

    @Test(testName = "Fill in text in all fields of Enrollment Page - Contact Information and click Next Button")
    public void InsertTextInContactInfo() {
        PageNavigation pageNavigation = new PageNavigation(driver);
        pageNavigation.SwitchToContactInformation();
        EnrolmentPageContactInfo enrolmentPageContactInfo = new EnrolmentPageContactInfo(driver);
        enrolmentPageContactInfo.FillInInformationInContactInfo();
        EnrolmentPageCourseOptions enrolmentPageCourseOptions = new EnrolmentPageCourseOptions(driver);
        Assert.assertEquals(enrolmentPageCourseOptions.OpenCourseOption(), Constants.COURSE_OPTIONS);

    }

    @Test(testName = "Verify functionality of Next Button in Enrollment Page - Options Course ")
    public void VerifyCourseOptionsNextButton() {
        PageNavigation pageNavigation = new PageNavigation(driver);
        pageNavigation.SwitchToCourseOptions();
        EnrolmentPageCourseOptions enrolmentPageCourseOptions = new EnrolmentPageCourseOptions(driver);
        enrolmentPageCourseOptions.SelectOptionCourse();
        enrolmentPageCourseOptions.ClickNextButtonOnOptionsCourse();
        EnrolmentPagePaymentInfo enrolmentPagePaymentInfo = new EnrolmentPagePaymentInfo(driver);
        Assert.assertEquals(enrolmentPagePaymentInfo.OpenPaymentInfo(), Constants.PAYMENT_INFORMATION);
    }


    @Test(testName = "Verfies that the validation for the personal information field works as intended without first name")
    public void NegativeVerifyPersonalInformationValidationWithoutFirstName() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        homePage.ClickonStartTheEnrolment();
        EnrolmentPagePersonalInfo enrolmentPagePersonalInfo = new EnrolmentPagePersonalInfo(driver);
        enrolmentPagePersonalInfo.InsertTextInLastName();
        enrolmentPagePersonalInfo.InsertUserName();
        enrolmentPagePersonalInfo.InsertPassword();
        enrolmentPagePersonalInfo.ConfirmPassword();
        enrolmentPagePersonalInfo.ClickOnNextButton();
        Assert.assertEquals(enrolmentPagePersonalInfo.GetPersonalInformationHeader(), Constants.PERSONAL_INFORMATION);
    }


    @Test(testName = "Verfies that the validation for the personal information field works as intended without password")
    public void NegativeVerifyPersonalInformationValidationWithoutPassword() {
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        homePage.ClickonStartTheEnrolment();
        EnrolmentPagePersonalInfo enrolmentPagePersonalInfo = new EnrolmentPagePersonalInfo(driver);
        enrolmentPagePersonalInfo.InsertTextInFirstName();
        enrolmentPagePersonalInfo.InsertTextInLastName();
        enrolmentPagePersonalInfo.InsertUserName();
        enrolmentPagePersonalInfo.ConfirmPassword();
        enrolmentPagePersonalInfo.ClickOnNextButton();
        Assert.assertEquals(enrolmentPagePersonalInfo.GetPersonalInformationHeader(), Constants.PERSONAL_INFORMATION);
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.quit();

    }

}
