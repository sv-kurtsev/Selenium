package homework_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageFactory {
    public WebDriver driver;

    @FindBy(xpath = "//a[@class='noo-search']")
    private WebElement searchIcon;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchInput;

    public WebElement getSearchIcon() {
        return searchIcon;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public BasePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void isElementPresentWithWait(WebElement element, int timeWait) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeWait);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click(WebElement element) {
        element.click();
    }

    public void javaScriptClick(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", element);
    }

    public void javaScriptScrollToElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void fillInput(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void isElementClickableWithWait(WebElement element, int timeWait) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeWait);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
