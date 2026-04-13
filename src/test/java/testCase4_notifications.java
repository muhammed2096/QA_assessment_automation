import org.testng.annotations.Test;

public class testCase4_notifications extends test_base{
    notifications_section notifications_obj;
    @Test
    public void run_test_profile() throws InterruptedException {
        notifications_obj = new notifications_section(driver);
        notifications_obj.setAccess("Two");
        notifications_obj.setUser();
        notifications_obj.setFlag("Text");
    }
}
