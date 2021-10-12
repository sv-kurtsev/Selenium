package homework_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PinkDropShoulderOversizedTShirtProduct extends BasePage {

    private final By pinkDropShoulderOversizedTShirtProduct = By.xpath("//a[contains(text(), 'pink drop shoulder oversized')]");
    private final By productColorDropDown = By.xpath("//select[@id='pa_color']");
    private final By productSizeDropDown = By.xpath("//select[@id='pa_size']");
    private final By productQuantityInputField = By.xpath("//input[@name='quantity']");
    private final By addToCartButtonDemoQA = By.xpath("//button[text()='Add to cart']");
    private final By cartIconDemoQA = By.xpath("//*[@class='cart-name-and-total']");

    public PinkDropShoulderOversizedTShirtProduct(WebDriver driver) {
        super(driver);
    }

    private void setColorInDropDown(By locator, String color) {
        selectDropDownOption(locator, color);
    }

    private void setSizeInDropDown(By locator, String size) {
        selectDropDownOption(locator, size);
    }

    private void setProductQuantityInputField(String quantity) {
        driver.findElement(productQuantityInputField).clear();
        setKeys(productQuantityInputField, quantity);
    }

    public void setAllProductSettings(String color, String size, String quantity) {
        setColorInDropDown(productColorDropDown, color);
        setSizeInDropDown(productSizeDropDown, size);
        setProductQuantityInputField(quantity);
    }

    public void isAddToCartButtonIsClickable() {
        isElementClickableWithWait(addToCartButtonDemoQA, 10);
    }

    public void addProductToCart() {
        click(addToCartButtonDemoQA);
    }

    public void scrollToCartIcon() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(cartIconDemoQA));
    }

    public void isCartIconPresent() {
        isElementPresentWithWait(cartIconDemoQA, 10);
    }

    public void openCartPage() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", driver.findElement(cartIconDemoQA));
    }

    public void scrollToPinkDropShoulderOversizedTShirtProduct() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(pinkDropShoulderOversizedTShirtProduct));
    }

    public void isPinkDropShoulderOversizedTShirtProductPresent() {
        isElementPresentWithWait(pinkDropShoulderOversizedTShirtProduct, 10);
    }

}
