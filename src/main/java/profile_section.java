import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class profile_section extends page_base{

    public profile_section(WebDriver driver) {
        super(driver);
    }

    private By fieldByLabel(String label){
        return By.xpath("//label[contains(text(),'" + label + "')]/following::input[1]");
    }

    private By selectByLabel(String label){
        return By.xpath("//label[contains(text(),'" + label + "')]/following::select[1]");
    }

    public void setUser(String value){
        Select_by_visible(selectByLabel("User"), value);
    }

    public void setAccess() throws InterruptedException {
        Click_btn(fieldByLabel("Access"));
    }

    public void setRegion(String text){
        Enter_text(fieldByLabel("Region"), text);
    }
}
