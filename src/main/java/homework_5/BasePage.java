package homework_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void setKeys(By locator, String input) {
        driver.findElement(locator).sendKeys(input);
    }

    public void selectDropDownOption(By locator, String value) {
        Select dropDown = new Select(driver.findElement(locator));
        dropDown.selectByVisibleText(value);
    }

    public void isElementPresentWithWait(By locator, int timeWait) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeWait);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void isElementClickableWithWait(By locator, int timeWait) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeWait);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
