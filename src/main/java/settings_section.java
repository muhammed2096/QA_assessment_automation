import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class settings_section extends page_base{
    public settings_section(WebDriver driver) {
        super(driver);
    }

    private By fieldByLabel(String label){
        return By.xpath("//label[contains(text(),'" + label + "')]/following::input[1]");
    }

    private By selectByLabel(String label){
        return By.xpath("//label[contains(text(),'" + label + "')]/following::select[1]");
    }

    public void setPriority(String value){
        Select_by_visible(selectByLabel("Priority"), value);
    }

    public void setPassword() throws InterruptedException {
        Click_btn(fieldByLabel("Password"));
    }

    public void setRole(String text){
        Enter_text(fieldByLabel("Role"), text);
    }
}
