package homework_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPageFactory extends BasePageFactory {
    @FindBy(xpath = "//select[@name='filter_size']")
    public WebElement filterSizeDropDown;

    @FindBy(xpath = "(//img[@class='product-one-thumb'])[1]")
    public WebElement firstProductOnSearchResultPage;

    public SearchResultPageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


}
