package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactsPage extends BasePage{
    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public void newContacts(){
        driver.get(baseUrl+"lightning/o/Contact/list?filterName=Recent");
        driver.findElement(USER_NAME).sendKeys("13and.jei-kd2q@force.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("minsk1985");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.className("forceActionLink")).click();
        Select select = new Select(driver.findElement(By.name("salutation")));
        select.getOptions().get(4);
        driver.findElement(By.id("input-727")).sendKeys("Gregory");
        driver.findElement(By.id("input-728")).sendKeys("House");
        Select select1 = new Select(driver.findElement(By.id("combobox-input-807")));
        select1.getOptions().get(1);


    }
}
