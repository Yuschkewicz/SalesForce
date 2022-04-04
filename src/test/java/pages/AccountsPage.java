package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class AccountsPage extends BasePage {

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        driver.get(baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        driver.findElement(USER_NAME).sendKeys("13and.jei-kd2q@force.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("minsk1985");
        driver.findElement(By.id("Login")).submit();
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("trial-customdemo"))));

    }

    public void invalidLogin() {
        driver.get(baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        driver.findElement(USER_NAME).sendKeys("13and.jei-kd12q@force.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("minsk1985");
        driver.findElement(By.id("Login")).submit();
        String notification = driver.findElement(By.id("error")).getText();
        assertEquals(notification, "Please check your username and password." +
                " If you still can't log in, contact your Salesforce administrator.");
    }

    public void invalidPassword(){
        driver.get(baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        driver.findElement(USER_NAME).sendKeys("13and.jei-kd2q@force.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("minsk1981");
        driver.findElement(By.id("Login")).submit();
        String alert=driver.findElement(By.id("error")).getText();
        assertEquals(alert,"Please check your username and password. " +
                "If you still can't log in, contact your Salesforce administrator.");


    }
    public void accountCreate() {
        driver.get("https://tsw17.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class," +
                "'slds-breadcrumb__item')]//span[text()='Accounts']")));
        driver.findElement(By.cssSelector("a[title=New]")).click();


    }
}
