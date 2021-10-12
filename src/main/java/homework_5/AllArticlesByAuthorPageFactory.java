package homework_5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllArticlesByAuthorPageFactory {
    private WebDriver driver;

    @FindBy(xpath = "(//*[@class='read-more'])[1]")
    public WebElement readMoreButton;

    public AllArticlesByAuthorPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void scrollToReadMoreButton() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", readMoreButton);
    }

    public void clickReadMoreButton() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", readMoreButton);
    }
}
