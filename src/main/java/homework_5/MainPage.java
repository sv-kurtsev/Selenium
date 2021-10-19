package homework_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private final By tokyoTalkiesDemoQA = By.xpath("//a[@href='https://shop.demoqa.com/product/tokyo-talkies/']");
    private final By tokyoTalkiesAddToWishListIconDemoQA = By.xpath("//*[@data-original-product-id='704']");
    private final By myWishlistIcon = By.xpath("//a[text()='My Wishlist']");
    private final By pinkDropShoulderOversizedTShirtProductOnMainPageDemoQA = By.xpath("//a[contains(text(), 'pink drop shoulder oversized')]");
    private final By productIsAddedPopUpMessage = By.xpath("//div[text()='Product added!']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void scrollDownToTokyoTalkiesProduct() {
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(tokyoTalkiesDemoQA));
        javaScriptScrollToElement(tokyoTalkiesDemoQA);
    }

    public void isTokyoTalkiesProductPresent() {
        isElementPresentWithWait(tokyoTalkiesDemoQA, 10);
    }

    public void addToWishListTokyoTalkiesProductJS() {
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click();", driver.findElement(tokyoTalkiesAddToWishListIconDemoQA));
        javaScriptClick(tokyoTalkiesAddToWishListIconDemoQA);
    }

    public void openWishlist() {
        click(myWishlistIcon);
    }

    public void waitProductAdding() {
        isElementPresentWithWait(productIsAddedPopUpMessage, 10);
    }

    public void javaScriptScrollDownPinkDropShoulderOversizedTShirtProduct() {
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(pinkDropShoulderOversizedTShirtProductOnMainPageDemoQA));
        javaScriptScrollToElement(pinkDropShoulderOversizedTShirtProductOnMainPageDemoQA);
    }

    public void javaScriptClickPinkDropShoulderOversizedTShirtProduct() {
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click();", driver.findElement(pinkDropShoulderOversizedTShirtProductOnMainPageDemoQA));
        javaScriptClick(pinkDropShoulderOversizedTShirtProductOnMainPageDemoQA);
    }

    public void isPinkDropShoulderOversizedTShirtProductPresent() {
        isElementPresentWithWait(pinkDropShoulderOversizedTShirtProductOnMainPageDemoQA, 10);
    }

}
