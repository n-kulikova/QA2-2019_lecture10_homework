package lecture10_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
    public static WebDriver driver;

    public void startBrowser() {
        String driverPath = ("C:\\Users\\kulik\\JavaGuruQA2-2019\\chromedriver_win32\\");
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver(); //here driver is global, do not need to indicate type Chromedriver
    }

    public void manageCookies() {
        By cookieAlert = By.xpath("//div[@class='cc-dialog']");
        By cookieAcceptButton = By.xpath("//a[@class='cc-primary-btn']");

        driver.manage().deleteAllCookies();
        if (driver.findElement(cookieAlert).isDisplayed()) {
            driver.findElement(cookieAcceptButton).click();
        }
    }

    public void denyNotifications() {
        By notification = By.id("onesignal-popover-dialog");
        By notificationButtonNo = By.id("onesignal-popover-cancel-button");
        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(notification));
        driver.findElement(notificationButtonNo).click();
    }

    //Wait until the section is reloaded and element is available
    public void waitUntilSectionIsRefreshed(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.stalenessOf(driver.findElement(element)));
    }

    //Wait until the element is visible
    public void waitUntilElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public String getElementTextValue(By element) {
        if (!driver.findElement(element).isDisplayed()) {
            waitUntilElement(element);
        }
        String value = driver.findElement(element).getText();
        return value;
    }

    public void stopBrowser() {
        driver.quit();
    }
}
