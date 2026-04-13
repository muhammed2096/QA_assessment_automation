import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class page_base {
    WebDriver driver;
    public page_base(WebDriver driver){
        this.driver = driver;
    }
    public void Enter_text(By elementLocator, String text){
        driver.findElement(elementLocator).sendKeys(new CharSequence[]{text});
    }
    public void Click_btn(By elementLocator){
        driver.findElement(elementLocator).click();
    }
    public void wait(By elementLocator){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }
    public void Select_by_index(By elementLocator, int index){
        Select select = new Select(driver.findElement(elementLocator));
        select.selectByIndex(index);
    }
    public void Select_by_value(By elementLocator, String value){
        Select select = new Select(driver.findElement(elementLocator));
        select.selectByValue(value);
    }
    public void Select_by_visible(By elementLocator, String visible){
        Select select = new Select(driver.findElement(elementLocator));
        select.selectByVisibleText(visible);
    }
}