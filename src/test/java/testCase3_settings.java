import org.testng.annotations.Test;

public class testCase3_settings extends test_base{
    settings_section settings_obj;
    @Test
    public void run_test_profile() throws InterruptedException {
        settings_obj = new settings_section(driver);
        settings_obj.setPriority("Three");
        settings_obj.setPassword();
        settings_obj.setRole("Text");
    }
}
