package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

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
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("uiImage"))));
    }

    public void accountCreate() {

        driver.get(baseUrl + "lightning/o/Account/list?filterName=Recent");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
        driver.findElement(USER_NAME).sendKeys("13and.jei-kd2q@force.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("minsk1985");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.className("forceActionLink")).click();


    }
}
