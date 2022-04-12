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
        driver.findElement(By.xpath(String.format("//span[text()='%s']", option))).click();

    }

    public void deleteContact(String option) {
        driver.get("https://tsw17.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        driver.findElement(By.xpath("span[text()='Show Actions']")).click();
        driver.findElement(By.xpath(String.format("//span[text()='%s']", option))).click();
    }


}

