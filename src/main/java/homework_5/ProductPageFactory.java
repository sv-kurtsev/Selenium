package homework_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageFactory extends BasePageFactory {
    @FindBy(xpath = "//h1[@class='page-title']")
    private WebElement productName;

    @FindBy(xpath = "//select[@id='pa_color']")
    private WebElement colorDropDown;

    @FindBy(xpath = "//select[@id='pa_size']")
    private WebElement sizeDropDown;

    @FindBy(xpath = "//button[text()='Add to cart']")
    private WebElement addToCartSubmitButton;

    @FindBy(xpath = "//option[@value='blue']")
    private WebElement blueColorDropDownOption;

    @FindBy(xpath = "//option[@value='37']")
    private WebElement size37DropDownOption;

    @FindBy(xpath = "//a[text()='View cart']")
    private WebElement viewCartButton;

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getColorDropDown() {
        return colorDropDown;
    }

    public WebElement getSizeDropDown() {
        return sizeDropDown;
    }

    public WebElement getAddToCartSubmitButton() {
        return addToCartSubmitButton;
    }

    public WebElement getBlueColorDropDownOption() {
        return blueColorDropDownOption;
    }

    public WebElement getSize37DropDownOption() {
        return size37DropDownOption;
    }

    public WebElement getViewCartButton() {
        return viewCartButton;
    }

    public ProductPageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setAllProductQualities() {
    click(getColorDropDown());
    click(getBlueColorDropDownOption());
    click(getSizeDropDown());
    click(getSize37DropDownOption());
    }

   public void isAddToCartButtonClickable() {
        isElementClickableWithWait(getAddToCartSubmitButton(), 10);
   }
   public void clickAddToCartButton() {
        click(getAddToCartSubmitButton());
   }

   public void clickViewCartButton() {
        click(getViewCartButton());
   }
}
