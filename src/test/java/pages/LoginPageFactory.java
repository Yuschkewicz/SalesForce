package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class LoginPageFactory extends BasePage {

    @FindBy(id = "username")
    WebElement userInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "Login")
    WebElement loginInput;


    public LoginPageFactory(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(LOGIN_BUTTON);
    }

    public void login() {
        driver.get(baseUrl);
        PageFactory.initElements(driver, this);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        userInput.sendKeys("13and.jei-kd2q@force.com");
        passwordInput.sendKeys("minsk1985");
        loginInput.submit();
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("trial-customdemo"))));
    }

    public void invalidLogin() {
        driver.get(baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        userInput.sendKeys("13and.jei-kd12q@force.com");
        passwordInput.sendKeys("minsk1985");
        loginInput.submit();
        String notification = driver.findElement(By.id("error")).getText();
        assertEquals(notification, "Please check your username and password." +
                " If you still can't log in, contact your Salesforce administrator.");
    }

    public void invalidPassword() {
        driver.get(baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        userInput.sendKeys("13and.jei-kd2q@force.com");
        passwordInput.sendKeys("minsk1981");
        loginInput.submit();
        String alert = driver.findElement(By.id("error")).getText();
        assertEquals(alert, "Please check your username and password. " +
                "If you still can't log in, contact your Salesforce administrator.");


    }
}
