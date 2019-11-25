package lecture10_homework.pages;

import lecture10_homework.Common;
import org.openqa.selenium.By;

public class Homepage extends Common {
    private By searchCriteria = By.id("search");
    private By searchButton=By.xpath("//button[@type='submit']");
    private By searchResult=By.xpath("//li[@class='item']");
    private Common common = new Common();

    public void findAndSelectProduct(String productName) {
        driver.get("https://www.janisroze.lv/lv//");
        driver.manage().window().maximize();
        common.manageCookies();
        common.denyNotifications();
        driver.findElement(searchCriteria).sendKeys(productName);
        driver.findElement(searchButton).click();
        driver.findElement(searchResult).click();
    }
}
