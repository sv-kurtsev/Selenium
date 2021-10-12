package homework_5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCertainProductAfterSearchingToCartPageFactory extends BaseTest {
    @Test
    public void addCertainProductAfterSearchingToCart() {
        getDriver().get("http://shop.demoqa.com/");
        getDriver().manage().window().maximize();
        BasePageFactory basePageFactory = new BasePageFactory(getDriver());
        basePageFactory.searchIcon.click();
        basePageFactory.isElementPresentWithWait(basePageFactory.searchInput, 10);
        basePageFactory.searchInput.sendKeys("Blue \n");
        SearchResultPageFactory searchResultPageFactory = new SearchResultPageFactory(getDriver());
        searchResultPageFactory.isElementPresentWithWait(searchResultPageFactory.filterSizeDropDown, 10);
        searchResultPageFactory.filterSizeDropDown.click();
        searchResultPageFactory.isElementPresentWithWait(searchResultPageFactory.size37, 10);
        searchResultPageFactory.size37.click();
        searchResultPageFactory.isElementPresentWithWait(searchResultPageFactory.firstProductOnSearchResultPage, 10);
        searchResultPageFactory.firstProductOnSearchResultPage.click();
        ProductPageFactory productPageFactory = new ProductPageFactory(getDriver());
        String stringProductName = productPageFactory.productName.getText();
        productPageFactory.colorDropDown.click();
        productPageFactory.blueColorDropDownOption.click();
        productPageFactory.sizeDropDown.click();
        productPageFactory.size37DropDownOption.click();
        productPageFactory.addToCartSubmitButton.click();
        productPageFactory.viewCartButton.click();
        CartPageFactory cartPageFactory = new CartPageFactory(getDriver());
        cartPageFactory.isElementPresentWithWait(cartPageFactory.firstProductInCart, 10);
        Assert.assertEquals(stringProductName + " - BLUE", cartPageFactory.firstProductInCart.getText());

    }

}
