package homework_5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCertainProductAfterSearchingToCartPageFactory extends BaseTest {
    @Test
    public void addCertainProductAfterSearchingToCart() {
        getDriver().get("http://shop.demoqa.com/");
        getDriver().manage().window().maximize();
        BasePageFactory basePageFactory = new BasePageFactory(getDriver());
        basePageFactory.getSearchIcon().click();
        basePageFactory.isElementPresentWithWait(basePageFactory.getSearchInput(), 10);
        basePageFactory.getSearchInput().sendKeys("Blue \n");
        SearchResultPageFactory searchResultPageFactory = new SearchResultPageFactory(getDriver());
        searchResultPageFactory.setSizeOnSearchResultPage();
        searchResultPageFactory.clickOnFirstProductOnSearchResultPage();
        ProductPageFactory productPageFactory = new ProductPageFactory(getDriver());
        String stringProductName = productPageFactory.getProductName().getText();
        productPageFactory.setAllProductQualities();
        productPageFactory.isAddToCartButtonClickable();
        productPageFactory.clickAddToCartButton();
        productPageFactory.clickViewCartButton();
        CartPageFactory cartPageFactory = new CartPageFactory(getDriver());
        cartPageFactory.isElementPresentWithWait(cartPageFactory.getFirstProductInCart(), 10);
        Assert.assertEquals(stringProductName + " - BLUE", cartPageFactory.getFirstProductInCart().getText());
        allureLog("Adding some product with search");
    }

}
