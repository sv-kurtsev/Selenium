package homework_5;

import org.testng.annotations.Test;

public class AddingToWishListDemoQAPageObject extends BaseTest {
    @Test
    public void addToWishListDemoQA() {
        getDriver().get("http://shop.demoqa.com/");
        getDriver().manage().window().maximize();
        MainPage mainPage = new MainPage(getDriver());
        mainPage.scrollDownToTokyoTalkiesProduct();
        mainPage.isTokyoTalkiesProductPresent();
        mainPage.addToWishListTokyoTalkiesProductJS();
        mainPage.waitProductAdding();
        mainPage.openWishlist();
        mainPage.scrollDownToTokyoTalkiesProduct();
        mainPage.isTokyoTalkiesProductPresent();
    }
}
