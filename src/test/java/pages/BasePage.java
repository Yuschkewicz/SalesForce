package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public static final By USER_NAME = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    WebDriver driver;
    WebDriverWait wait;
    String baseUrl = "https://login.salesforce.com/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 50);
    }

    public BasePage() {
    }
}
