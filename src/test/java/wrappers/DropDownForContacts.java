package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownForContacts {

    WebDriver driver;
    String label;

    public DropDownForContacts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//span", label))).click();
        driver.findElement(By.cssSelector(String.format("//span[text()='%s']", option))).click();

    }
}
