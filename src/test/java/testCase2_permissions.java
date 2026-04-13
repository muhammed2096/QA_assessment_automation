import org.testng.annotations.Test;

public class testCase2_permissions extends test_base{
    permissions_section permissions_obj;
    @Test
    public void run_test_profile() throws InterruptedException {
        permissions_obj = new permissions_section(driver);
        permissions_obj.setPassword("Test");
        permissions_obj.setAdmin();
        permissions_obj.setStatus("Four");
    }

}
