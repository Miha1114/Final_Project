import org.openqa.selenium.WebDriver;

enum MyPages {
    HOME_PAGE
}

enum MyEnrolmentPages{
    PERSONAL_INFORMATION,
    CONTACT_INFORMATION,
    COURSE_OPTION,
    PAYMENT_INFO
}


public class PageNavigation extends PageObject {

    public PageNavigation(WebDriver driver) { super(driver);}

    public void SwitchToPages(MyEnrolmentPages EnrolmentPages){
        switch (EnrolmentPages){
            case PERSONAL_INFORMATION -> SwitchToPersonalInformation();
            case CONTACT_INFORMATION -> SwitchToContactInformation();
            case COURSE_OPTION -> SwitchToCourseOptions();
            case PAYMENT_INFO -> SwitchToPaymentInfo();
        }

    }

    public void SwichToHomePage (){
        driver.get(Utils.BASE_URL);

    }

    public void SwitchToPersonalInformation(){
        driver.get(Utils.BASE_URL);
        HomePage homePage = new HomePage(driver);
        homePage.ClickonStartTheEnrolment();
    }

    public void SwitchToContactInformation(){
        SwitchToPersonalInformation();
        EnrolmentPagePersonalInfo personalInfo = new EnrolmentPagePersonalInfo(driver);
        personalInfo.FillInInformationInPersonalInfo();
        personalInfo.ClickOnNextButton();
    }

    public void SwitchToCourseOptions(){
        SwitchToContactInformation();
        EnrolmentPageContactInfo contactInfo = new EnrolmentPageContactInfo(driver);
        contactInfo.FillInInformationInContactInfo();
        contactInfo.ClickNextButtonOnContactInfo();
    }

    public void SwitchToPaymentInfo(){
        SwitchToCourseOptions();
        EnrolmentPageCourseOptions courseOptions = new EnrolmentPageCourseOptions(driver);
        courseOptions.SelectOptionCourse();
        courseOptions.ClickNextButtonOnOptionsCourse();
    }


}