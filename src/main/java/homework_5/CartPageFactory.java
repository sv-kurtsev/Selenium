package homework_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageFactory extends BasePageFactory {
    @FindBy(xpath = "(//td[@class='product-name']/a)[1]")
    private WebElement firstProductInCart;

    public CartPageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getFirstProductInCart() {
        return firstProductInCart;
    }
}
