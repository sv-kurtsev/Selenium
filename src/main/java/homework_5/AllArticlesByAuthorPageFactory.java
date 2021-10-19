package homework_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllArticlesByAuthorPageFactory extends BasePageFactory{

    @FindBy(xpath = "(//*[@class='read-more'])[1]")
    private WebElement readMoreButton;

    public AllArticlesByAuthorPageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getReadMoreButton() {
        return readMoreButton;
    }

    public void scrollToReadMoreButton() {
    javaScriptScrollToElement(getReadMoreButton());
    }

    public void clickReadMoreButton() {
        javaScriptClick(getReadMoreButton());
    }
}
