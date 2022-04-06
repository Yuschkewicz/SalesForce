package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        return this;
    }

    public LoginPage login() {
        driver.get(baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        driver.findElement(USER_NAME).sendKeys("13and.jei-kd2q@force.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("minsk1985");
        driver.findElement(LOGIN_BUTTON).submit();
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("trial-customdemo"))));
        return this;
    }

    public LoginPage invalidLogin() {
        driver.get(baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        driver.findElement(USER_NAME).sendKeys("13and.jei-kd12q@force.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("minsk1985");
        driver.findElement(By.id("Login")).submit();
        String notification = driver.findElement(By.id("error")).getText();
        assertEquals(notification, "Please check your username and password." +
                " If you still can't log in, contact your Salesforce administrator.");
        return this;
    }

    public LoginPage invalidPassword(){
        driver.get(baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        driver.findElement(USER_NAME).sendKeys("13and.jei-kd2q@force.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("minsk1981");
        driver.findElement(By.id("Login")).submit();
        String alert=driver.findElement(By.id("error")).getText();
        assertEquals(alert,"Please check your username and password. " +
                "If you still can't log in, contact your Salesforce administrator.");
        return this;


    }


}
