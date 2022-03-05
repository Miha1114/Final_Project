import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VirtualPage extends PageObject {

    @FindBy(xpath = "/html/body/h1")
    private WebElement startvirtualpage;


    public VirtualPage(WebDriver driver) {
        super(driver);
    }

    public String OpenStartVirtualPage() {
        return this.startvirtualpage.getText();
    }
}
