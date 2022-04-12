package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class LoginPage extends BasePage {
    public static final String USER ="13and.jei-kd2q@force.com";
    public static final String PASSWORD = "minsk1985";
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(LOGIN_BUTTON);
    }

    public LoginPage login() {
        driver.get(startUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        driver.findElement(USER_NAME).sendKeys(USER);
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
        driver.findElement(LOGIN_BUTTON).submit();

        return this;
    }

    public LoginPage invalidLogin() {
        driver.get(startUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        driver.findElement(USER_NAME).sendKeys(USER);
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
        driver.findElement(By.id("Login")).submit();

        return this;
    }

    public LoginPage invalidPassword() {
        driver.get(startUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        driver.findElement(USER_NAME).sendKeys(USER);
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
        driver.findElement(By.id("Login")).submit();

        return this;


    }


}
