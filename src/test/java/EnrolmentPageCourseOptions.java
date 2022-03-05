import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrolmentPageCourseOptions extends PageObject {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseoptiontext;

    @FindBy(xpath = "//*[@id=\"flexRadioButton3\"]")
    private WebElement clickoptioncourse;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement clicknextbuttoninoptioncourse;


    public EnrolmentPageCourseOptions(WebDriver driver) {
        super(driver);
    }

    public String OpenCourseOption() {
        return this.courseoptiontext.getText();

    }

    public void SelectOptionCourse() {
        this.clickoptioncourse.click();
    }

    public void ClickNextButtonOnOptionsCourse(){
        this.clicknextbuttoninoptioncourse.click();
    }
}