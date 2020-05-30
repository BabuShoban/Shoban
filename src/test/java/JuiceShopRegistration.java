import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JuiceShopRegistration {

    @Test
    public void openBrowser() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/#/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".mat-raised-button:nth-child(2)")).click();
        driver.findElement(By.id("navbarAccount")).click();
        driver.findElement(By.id("navbarLoginButton")).click();
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("newCustomerLink"))).click();
        driver.findElement(By.id("emailControl")).sendKeys("abc1@gmail.com");
        driver.findElement(By.id("passwordControl")).sendKeys("Sample123");
        driver.findElement(By.id("repeatPasswordControl")).sendKeys(("Sample123"));
        driver.findElement((By.cssSelector(".mat-select-arrow-wrapper"))).click();
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-option-3"))).click();
        driver.findElement(By.id("securityAnswerControl")).sendKeys("abcd");
        driver.findElement(By.id("registerButton")).click();
        Thread.sleep(2000);
    }
}
