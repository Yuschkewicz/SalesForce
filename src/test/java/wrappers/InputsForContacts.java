package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputsForContacts {

    WebDriver driver;
    String label;

    public InputsForContacts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format
                ("//label[text()='%s']/..//input", label))).sendKeys(text);


    }

    public void writeAndChoose(String text) {
        driver.findElement
                (By.xpath(String.format("//label[text()='%s']/..//input", label)))
                .sendKeys(text);
        driver.findElement(By.xpath(String.format("//span//strong[text()='%s']", text))).click();

    }

}
