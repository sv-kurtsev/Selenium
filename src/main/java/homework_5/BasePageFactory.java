package homework_5;

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
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchInput;

    @FindBy(xpath = "//option[text()='37']")
    public WebElement size37;

    public BasePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void isElementPresentWithWait(WebElement element, int timeWait) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeWait);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

}
