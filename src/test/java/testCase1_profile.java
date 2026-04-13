import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testCase1_profile extends test_base{
    profile_section profile_obj;
    @Test
    public void run_test_profile() throws InterruptedException {
        profile_obj = new profile_section(driver);
        profile_obj.setUser("Seven");
        profile_obj.setAccess();
        profile_obj.setRegion("Text");
    }

}
