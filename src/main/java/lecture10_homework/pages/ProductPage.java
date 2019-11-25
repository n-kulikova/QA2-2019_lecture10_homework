package lecture10_homework.pages;

import lecture10_homework.Common;
import org.openqa.selenium.By;

public class ProductPage extends Common {
    private By addToShoopingCartButton = By.id("product-addtocart-button");
    private By openShoppingCart = By.xpath("//a[@class='mini-cart-heading dropdown-heading cover skip-link skip-cart']");
    private By price = By.xpath("//div[@class='price-box']//span[@class='price']");
    private By productName = By.xpath("//div[@class='product-name ']/h1");
    private Common common = new Common();

    public void addItemToShoppingCart() {
        //common.waitForElement(addToShoopingCartButton,10);
        driver.findElement(addToShoopingCartButton).click();
    }

    public void openShoppingCart() {
        waitUntilElement(openShoppingCart);
        driver.findElement(openShoppingCart).click();
    }

    public String checkProductName() {
        String value = getElementTextValue(productName);
        return value;
    }
    public String checkProductPrice() {
        String value = getElementTextValue(price);
        return value;
    }

}
