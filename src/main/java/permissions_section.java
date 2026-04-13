import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class permissions_section extends page_base{
    public permissions_section(WebDriver driver) {
        super(driver);
    }

    private By fieldByLabel(String label){
        return By.xpath("//label[contains(text(),'" + label + "')]/following::input[1]");
    }

    private By selectByLabel(String label){
        return By.xpath("//label[contains(text(),'" + label + "')]/following::select[1]");
    }

    public void setPassword(String value){
        Select_by_visible(selectByLabel("Password"), value);
    }

    public void setAdmin() throws InterruptedException {
        Click_btn(fieldByLabel("Admin"));
    }

    public void setStatus(String text){
        Enter_text(fieldByLabel("Status"), text);
    }
}
