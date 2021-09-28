package homework_3;

import org.openqa.selenium.By;

public interface LocatorsInterface {
    By userNameFieldDemoQA = By.xpath("id('userName')");
    By passwordFieldDemoQA = By.xpath("id('password')");
    By loginButtonDemoQA = By.xpath("id('login')");
    By goToBookStoreButtonDemoQA = By.xpath("id('gotoStore')");
    By gitPocketGuideDemoQA = By.xpath("//a[contains(text(), 'Git Pocket')]");
    By addToYourCollectionButtonDemoQA = By.xpath("//button[contains(text(), 'Add To Your')]");
    By backToBookStoreButtonDemoQA = By.xpath("//button[contains(text(), 'Back To Book')]");
    By youDontKnowJSDemoQA = By.xpath("//a[contains(text(), 'You Don')]");
    By profileButtonDemoQA = By.xpath("//li[span='Profile']");
    By deleteAllBooksButtonDemoQA = By.xpath("(//button[contains(text(), 'Delete All Books')])[1]");
    By closAdvertiseDemoQA = By.xpath("//img[@title='Ad.Plus Advertising']");
    By confirmModalButtonDemoQA = By.xpath("id('closeSmallModal-ok')");
    By firstBookRowDemoQA = By.xpath("//div[@class='rt-td']");

    By userNameSaucedemo = By.xpath("id('user-name')");
    By passwordSaucedemo = By.xpath("id('password')");
    By loginButtonSaucedemo = By.xpath("id('login-button')");
    By addToCartButtonSaucedemo = By.xpath("//button[text()='Add to cart']");
    By cartIconSaucedemo = By.xpath("//a[@class='shopping_cart_link']");
    By checkoutButtonSaucedemo = By.xpath("//button[@id='checkout']");
    By firstNameFieldSauceDemo = By.xpath("//input[@id='first-name']");
    By lastNameFieldSauceDemo = By.xpath("id('last-name')");
    By zipCodeSauceDemo = By.xpath("id('postal-code')");
    By continueButtonSauceDemo = By.xpath("id('continue')");
    By finishButtonSauceDemo = By.xpath("id('finish')");
    By backToHomeButtonSauceDemo = By.xpath("id('back-to-products')");

    By newToDoFieldWebdriveruniversity = By.xpath("//input[@placeholder='Add new todo']");
    By practiceMagicTextWebdriveruniversity = By.xpath("//*[text()=' Practice magic']");
    By buyNewRobesTextWebdriveruniversity = By.xpath("//*[text()=' Buy new robes']");
    By buyNewRobesDeleteIconWebdriveruniversity = By.xpath("(//i[@class='fa fa-trash'])[2]");

    By todaysDealsButtonAmazon = By.xpath("(//a[contains(text(), 'Today')])");
    By firstProductAmazon = By.xpath("//*[@aria-label='Deals grid']//img");
    By popUpDissmissButtonAmazon = By.xpath("//input[@data-action-type='DISMISS']");
    By firstSubProductButtonAmazon = By.xpath("(//*[@class='a-carousel-col a-carousel-center']//img)[1]");
    By addToCartButtonAmazon = By.xpath("id('add-to-cart-button')");
    By proceedToCheckOutButtonAmazon = By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']");
    By signInPageH1Amazon = By.xpath("//h1");

}
