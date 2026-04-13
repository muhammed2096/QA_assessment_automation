import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class notifications_section extends page_base{
    public notifications_section(WebDriver driver) {
        super(driver);
    }

    private By fieldByLabel(String label){
        return By.xpath("//label[contains(text(),'" + label + "')]/following::input[1]");
    }

    private By selectByLabel(String label){
        return By.xpath("//label[contains(text(),'" + label + "')]/following::select[1]");
    }

    public void setAccess(String value){
        Select_by_visible(selectByLabel("Access"), value);
    }

    public void setUser() throws InterruptedException {
        Click_btn(fieldByLabel("User"));
    }

    public void setFlag(String text){
        Enter_text(fieldByLabel("Flag"), text);
    }
}
