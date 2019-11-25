package lecture10_homework;

import lecture10_homework.model.Order;
import lecture10_homework.pages.Homepage;
import lecture10_homework.pages.ProductPage;
import org.assertj.core.api.Assertions;
import org.junit.Test;


public class TestOrderingOnJanaRoze {
    private Common common = new Common();
    private Homepage homepage = new Homepage();
    private ProductPage productPage = new ProductPage();
    private Order order = new Order();

    @Test
    // Open Jana Rozes site; find a product; add it to shopping cart; fill in order cart and validate product price and name there
    public void OrderMyItem() {
        common.startBrowser();
        homepage.findAndSelectProduct("Figūra POP! DC: Superman: Flying Superman (80th Anniversary)");
        String expectedName = productPage.checkProductName();
        String expectedPrice = productPage.checkProductPrice();
        productPage.addItemToShoppingCart();
        productPage.openShoppingCart();
        order.fillInOrder();
        Assertions.assertThat(order.checkProductName()).isEqualToIgnoringCase(expectedName);
        Assertions.assertThat(order.checkProductPrice()).isEqualTo(expectedPrice);
        common.stopBrowser();
    }
}
