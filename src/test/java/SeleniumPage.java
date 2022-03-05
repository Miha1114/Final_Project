import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumPage extends PageObject {

    @FindBy(xpath = "/html/body/h1")
    private WebElement seleniumpage;


    public SeleniumPage(WebDriver driver) {
        super(driver);
    }

    public String OpenSeleniumPage() {

        return this.seleniumpage.getText();
    }

}
