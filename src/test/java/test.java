import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {
    @Test
    public void FormyTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://formy-project.herokuapp.com/form");
        webDriver.findElement(By.id("first-name")).sendKeys("AbdulRaouf");
        webDriver.findElement(By.id("last-name")).sendKeys("Mahmoud");
        webDriver.findElement(By.id("job-title")).sendKeys("Engineer");
        webDriver.findElement(By.id("radio-button-1")).click();
        webDriver.findElement(By.id("radio-button-2")).click();
        webDriver.findElement(By.id("radio-button-3")).click();
        webDriver.findElement(By.id("checkbox-1")).click();
        webDriver.findElement(By.id("checkbox-2")).click();
        webDriver.findElement(By.id("checkbox-3")).click();
        Select yearsOfExperience = new Select(webDriver.findElement(By.id("select-menu")));
        yearsOfExperience.selectByIndex(0);
        yearsOfExperience.selectByIndex(1);
        yearsOfExperience.selectByIndex(2);
        yearsOfExperience.selectByIndex(3);
        yearsOfExperience.selectByIndex(4);
        WebElement dateBox = webDriver.findElement(By.id("datepicker"));
        dateBox.sendKeys("01/01/2001",Keys.TAB);
        webDriver.findElement(By.className("btn-primary")).click();

    }
}
