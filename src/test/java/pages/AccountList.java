package pages;

import org.openqa.selenium.WebDriver;
import test.BaseTest;

public class AccountList extends BasePage{


    public AccountList(WebDriver driver){
        super(driver);
    }

    public void open(){
        driver.get("https://tsw17.lightning.force.com/lightning/o/Account/list?filterName=Recent");
    }
}
