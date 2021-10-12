package homework_5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertainArticlePageFactory extends BasePageFactory {

    @FindBy(xpath = "//*[@id='respond']")
    public WebElement commentForm;

    @FindBy(xpath = "//*[@id='author']")
    public WebElement nameInput;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@id='url']")
    public WebElement websiteInput;

    @FindBy(xpath = "//*[@id='comment']")
    public WebElement yourCommentInput;

    @FindBy(xpath = "//*[@id='submit']")
    public WebElement postCommentButton;

    public CertainArticlePageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void scrollToCommentForm() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", commentForm);
    }

    public void fillCommentField(String name, String email, String website, String yourComment) {
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
        websiteInput.sendKeys(website);
        yourCommentInput.sendKeys(yourComment);
    }

    public void submitCommentForm() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", postCommentButton);
    }
}
