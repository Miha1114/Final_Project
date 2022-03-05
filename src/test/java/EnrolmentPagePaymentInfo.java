import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrolmentPagePaymentInfo extends PageObject {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentinfotext;

    public EnrolmentPagePaymentInfo(WebDriver driver) { super(driver);}


    public String OpenPaymentInfo(){

        return this.paymentinfotext.getText();
    }
}

