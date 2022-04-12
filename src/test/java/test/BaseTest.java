package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import steps.AccountSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {

    WebDriver driver;
    AccountsPage accountsPage;
    ContactsPage contactsPage;
    NewAccountModal newAccountModal;
    NewContactsModal newContactsModal;
    LoginPage loginPage;
    LoginPageFactory loginPageFactory;
    AccountList accountList;
    AccountSteps accountSteps;
public static final String USER="13and.jei-kd2q@force.com";
public static final String PASSWORD="minsk1985";

    @Parameters({"browser"})
    @BeforeMethod
    public void setup(@Optional("chrome") String browser, ITestContext testContext) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("EDGE")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("Opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
            driver.manage().window().maximize();
        }
        testContext.setAttribute("driver", driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        accountsPage = new AccountsPage(driver);
        contactsPage = new ContactsPage(driver);
        newAccountModal = new NewAccountModal(driver);
        newContactsModal = new NewContactsModal(driver);
        loginPage = new LoginPage(driver);
        loginPageFactory = new LoginPageFactory(driver);
        accountList = new AccountList(driver);
        accountSteps = new AccountSteps(driver);

    }


    @AfterMethod(alwaysRun = true)
    public void close() {
        driver.quit();

    }
}