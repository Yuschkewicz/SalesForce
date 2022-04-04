package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextAreaForContacts {
    WebDriver driver;
    String label;

    public TextAreaForContacts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void textAreaWrite(String text) {
        driver.findElement(By.xpath(String.format("//div[contains(@class, 'modal-body')]//label[text()='%s']/..//textarea", label))).sendKeys(text);
    }


}
