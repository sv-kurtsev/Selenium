package homework_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageFactory extends BasePage {
    @FindBy(xpath = "//h1[@class='page-title']")
    public WebElement productName;

    @FindBy(xpath = "//select[@id='pa_color']")
    public WebElement colorDropDown;

    @FindBy(xpath = "//select[@id='pa_size']")
    public WebElement sizeDropDown;

    @FindBy(xpath = "//button[text()='Add to cart']")
    public WebElement addToCartSubmitButton;

    @FindBy(xpath = "//option[@value='blue']")
    public WebElement blueColorDropDownOption;

    @FindBy(xpath = "//option[@value='37']")
    public WebElement size37DropDownOption;

    @FindBy(xpath = "//a[text()='View cart']")
    public WebElement viewCartButton;

    public ProductPageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
