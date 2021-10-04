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
    By confirmModalButtonDemoQA = By.xpath("id('closeSmallModal-ok')");
    By firstBookRowDemoQA = By.xpath("//div[@class='rt-td']");
    By registerButtonDemoQA = By.xpath("//*[@href='/register']");
    By startButtonDemoQA = By.xpath("//*[text()='Start']");
    By resetButtonDemoQA = By.xpath("//*[text()='Reset']");
    By visibleAfter5SecondsButtonDemoQA = By.xpath("//button[@id='visibleAfter']");
    By frame1DemoQA = By.xpath("id('frame1')");
    By frameHeaderTextDemoQA = By.xpath("//h1[text()='This is a sample page']");
    By frame2DemoQA = By.xpath("id('frame2')");
    By firstNameStudentRegistrationFormDemoQA = By.xpath("id('firstName')");
    By lastNameStudentRegistrationFormDemoQA = By.xpath("id('lastName')");
    By emailStudentRegistrationFormDemoQA = By.xpath("id('userEmail')");
    By genderMaleRadioButtonDemoQA = By.xpath("//input[@name='gender']/following-sibling::label[text()='Male']");
    By phoneNumberFieldDemoQA = By.xpath("id('userNumber')");
    By dateOfBirthPickerDemoQA = By.xpath("id('dateOfBirthInput')");
    By hobbiesFirstCheckboxDemoQA = By.xpath("//label[@for='hobbies-checkbox-1']");
    By currentAddressTextFieldDemoQA = By.xpath("id('currentAddress')");
    By stateDropdownStudentRegistrationFormDemoQA = By.xpath("//div[text()='Select State']");
    By haryanaStateDropDownOptionDemoQA = By.xpath("//div[text()='Haryana']");
    By cityDropdownStudentRegistrationFormDemoQA = By.xpath("id('city')");
    By submitButtonDemoQA = By.xpath("id('submit')");
    By fullNameFieldDemoQA = By.xpath("id('userName')");
    By emailTextBoxFieldDemoQA = By.xpath("id('userEmail')");
    By currentAddressTextBoxFieldDemoQA = By.xpath("id('currentAddress')");
    By permanentAddressTextBoxFieldDemoQA = By.xpath("id('permanentAddress')");

    By userNameSauceDemo = By.xpath("id('user-name')");
    By passwordSauceDemo = By.xpath("id('password')");
    By loginButtonSauceDemo = By.xpath("id('login-button')");
    By addToCartButtonSauceDemo = By.xpath("//button[text()='Add to cart']");
    By cartIconSauceDemo = By.xpath("//a[@class='shopping_cart_link']");
    By checkoutButtonSauceDemo = By.xpath("//button[@id='checkout']");
    By firstNameFieldSauceDemo = By.xpath("//input[@id='first-name']");
    By lastNameFieldSauceDemo = By.xpath("id('last-name')");
    By zipCodeSauceDemo = By.xpath("id('postal-code')");
    By continueButtonSauceDemo = By.xpath("id('continue')");
    By finishButtonSauceDemo = By.xpath("id('finish')");
    By backToHomeButtonSauceDemo = By.xpath("id('back-to-products')");

    By newToDoFieldWebDriverUniversity = By.xpath("//input[@placeholder='Add new todo']");
    By practiceMagicTextWebDriverUniversity = By.xpath("//*[text()=' Practice magic']");
    By buyNewRobesTextWebDriverUniversity = By.xpath("//*[text()=' Buy new robes']");
    By buyNewRobesDeleteIconWebDriverUniversity = By.xpath("(//i[@class='fa fa-trash'])[2]");

    By todaysDealsButtonAmazon = By.xpath("(//a[contains(text(), 'Today')])");
    By firstProductAmazon = By.xpath("//*[@aria-label='Deals grid']//img");
    By popUpDismissButtonAmazon = By.xpath("//input[@data-action-type='DISMISS']");
    By firstSubProductButtonAmazon = By.xpath("(//*[@class='a-carousel-col a-carousel-center']//img)[1]");
    By addToCartButtonAmazon = By.xpath("id('add-to-cart-button')");
    By proceedToCheckOutButtonAmazon = By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']");
    By signInPageH1Amazon = By.xpath("//h1");

}
