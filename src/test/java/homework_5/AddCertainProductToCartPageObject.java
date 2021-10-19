package homework_5;

import org.testng.annotations.Test;

public class AddCertainProductToCartPageObject extends BaseTest {
    @Test
    public void addToCart() {
        getDriver().get("http://shop.demoqa.com/");
        getDriver().manage().window().maximize();
        MainPage mainPage = new MainPage(getDriver());
        mainPage.javaScriptScrollDownPinkDropShoulderOversizedTShirtProduct();
        mainPage.isPinkDropShoulderOversizedTShirtProductPresent();
        mainPage.javaScriptClickPinkDropShoulderOversizedTShirtProduct();
        PinkDropShoulderOversizedTShirtProduct pinkDropShoulderOversizedTShirtProduct = new PinkDropShoulderOversizedTShirtProduct(getDriver());
        pinkDropShoulderOversizedTShirtProduct.setAllProductSettings("Pink", "37", "3");
        pinkDropShoulderOversizedTShirtProduct.isAddToCartButtonIsClickable();
        pinkDropShoulderOversizedTShirtProduct.addProductToCart();
        pinkDropShoulderOversizedTShirtProduct.scrollToCartIcon();
        pinkDropShoulderOversizedTShirtProduct.isCartIconPresent();
        pinkDropShoulderOversizedTShirtProduct.openCartPage();
        pinkDropShoulderOversizedTShirtProduct.scrollToPinkDropShoulderOversizedTShirtProduct();
        pinkDropShoulderOversizedTShirtProduct.isPinkDropShoulderOversizedTShirtProductPresent();
        allureLog("Adding of certain product to the cart");
    }

}
