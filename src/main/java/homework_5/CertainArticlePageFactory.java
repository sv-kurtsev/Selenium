package homework_5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertainArticlePageFactory extends BasePageFactory {

    @FindBy(xpath = "//*[@id='respond']")
    private WebElement commentForm;

    @FindBy(xpath = "//*[@id='author']")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id='url']")
    private WebElement websiteInput;

    @FindBy(xpath = "//*[@id='comment']")
    private WebElement yourCommentInput;

    @FindBy(xpath = "//*[@id='submit']")
    private WebElement postCommentButton;

    public WebElement getCommentForm() {
        return commentForm;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getWebsiteInput() {
        return websiteInput;
    }

    public WebElement getYourCommentInput() {
        return yourCommentInput;
    }

    public WebElement getPostCommentButton() {
        return postCommentButton;
    }

    public CertainArticlePageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void scrollToCommentForm() {
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].scrollIntoView(true);", commentForm);
        javaScriptScrollToElement(getCommentForm());
    }

    public void fillCommentField(String name, String email, String website, String yourComment) {
//        nameInput.sendKeys(name);
        fillInput(getNameInput(), name);
//        emailInput.sendKeys(email);
        fillInput(getEmailInput(), email);
//        websiteInput.sendKeys(website);
        fillInput(getWebsiteInput(), website);
//        yourCommentInput.sendKeys(yourComment);
        fillInput(getYourCommentInput(), yourComment);
    }

//    public void submitCommentForm() {
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click();", postCommentButton);
//    }
    public void submitCommentForm() {
        javaScriptClick(getPostCommentButton());
    }
}
