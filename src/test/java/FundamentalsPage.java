import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FundamentalsPage extends PageObject {

    @FindBy(xpath = "/html/body/h1")
    private WebElement fundamentalspage;


    public FundamentalsPage(WebDriver driver) {
        super(driver);
    }

    public String OpenFundamentalsPage() {
        return this.fundamentalspage.getText();
    }
}
