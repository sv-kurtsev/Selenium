package homework_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPageFactory extends BasePageFactory {
    @FindBy(xpath = "//select[@name='filter_size']")
    private WebElement filterSizeDropDown;

    @FindBy(xpath = "(//img[@class='product-one-thumb'])[1]")
    private WebElement firstProductOnSearchResultPage;

    @FindBy(xpath = "//option[text()='37']")
    private WebElement size37;

    public WebElement getSize37() {
        return size37;
    }

    public WebElement getFilterSizeDropDown() {
        return filterSizeDropDown;
    }

    public WebElement getFirstProductOnSearchResultPage() {
        return firstProductOnSearchResultPage;
    }

    public SearchResultPageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setSizeOnSearchResultPage() {
        isElementPresentWithWait(getFilterSizeDropDown(), 10);
        click(getFilterSizeDropDown());
        isElementPresentWithWait(getSize37(), 10);
        click(getSize37());
    }

    public void clickOnFirstProductOnSearchResultPage() {
        isElementPresentWithWait(getFirstProductOnSearchResultPage(), 10);
        click(getFirstProductOnSearchResultPage());
    }
}
