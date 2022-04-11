package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Input {
    WebDriver driver;
    String label;
    Logger logger= LoggerFactory.getLogger(Input.class);

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        logger.info("write smth  ");
        driver.findElement(By.xpath(String.format
                ("//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//input", label))).sendKeys(text);


    }


}

