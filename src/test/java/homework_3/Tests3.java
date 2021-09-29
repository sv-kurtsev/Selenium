package homework_3;

import baseTest.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tests3 extends BaseTest implements LocatorsInterface {
    @Test
    public void demoQa() {
        webDriver.get("https://demoqa.com/login");
        webDriver.manage().window().maximize();
        WebElement userNameField = webDriver.findElement(userNameFieldDemoQA);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(userNameFieldDemoQA));
        userNameField.sendKeys("userName");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(passwordFieldDemoQA));
        WebElement passwordField = webDriver.findElement(passwordFieldDemoQA);
        passwordField.sendKeys("1234qWe!");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(loginButtonDemoQA));
        WebElement loginButton = webDriver.findElement(loginButtonDemoQA);
        loginButton.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(goToBookStoreButtonDemoQA));
        WebElement goToBookStoreButton = webDriver.findElement(goToBookStoreButtonDemoQA);
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("arguments[0].click();", goToBookStoreButton);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(gitPocketGuideDemoQA));
        WebElement gitPocketGuide = webDriver.findElement(gitPocketGuideDemoQA);
        gitPocketGuide.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(addToYourCollectionButtonDemoQA));
        WebElement addToYourCollectionButton = webDriver.findElement(addToYourCollectionButtonDemoQA);
        jse.executeScript("arguments[0].click();", addToYourCollectionButton);
        try {
            webDriverWait.until(ExpectedConditions.alertIsPresent());
            webDriver.switchTo().alert().accept();
            webDriver.switchTo().defaultContent();
        } catch (Exception e) {

        }
        WebElement backToBookStoreButton = webDriver.findElement(backToBookStoreButtonDemoQA);
        webDriverWait.until(ExpectedConditions.visibilityOf(backToBookStoreButton));
        jse.executeScript("arguments[0].click();", backToBookStoreButton);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(youDontKnowJSDemoQA));
        WebElement youDontKnowJS = webDriver.findElement(youDontKnowJSDemoQA);
        jse.executeScript("arguments[0].click();", youDontKnowJS);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(addToYourCollectionButtonDemoQA));
        addToYourCollectionButton = webDriver.findElement(addToYourCollectionButtonDemoQA);
        jse.executeScript("arguments[0].click();", addToYourCollectionButton);
        try {
            webDriverWait.until(ExpectedConditions.alertIsPresent());
            webDriver.switchTo().alert().accept();
            webDriver.switchTo().defaultContent();
        } catch (Exception e) {

        }
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(profileButtonDemoQA));
        WebElement profileButton = webDriver.findElement(profileButtonDemoQA);
        jse.executeScript("arguments[0].click();", profileButton);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(deleteAllBooksButtonDemoQA));
        WebElement deleteAllBooksButton = webDriver.findElement(deleteAllBooksButtonDemoQA);
        jse.executeScript("arguments[0].click();", deleteAllBooksButton);
        WebElement confirmModalButton = webDriver.findElement(confirmModalButtonDemoQA);
        confirmModalButton.click();
        webDriverWait.until(ExpectedConditions.alertIsPresent());
        webDriver.switchTo().alert().accept();
        webDriver.switchTo().defaultContent();
        WebElement firstBookRow = webDriver.findElement(firstBookRowDemoQA);
        Assert.assertEquals(firstBookRow.getText(), " ");

    }

    @Test
    public void sauceDemo() {
        webDriver.get("https://www.saucedemo.com/");
        WebElement userName = webDriver.findElement(userNameSauceDemo);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(userNameSauceDemo));
        userName.sendKeys("standard_user");
        WebElement password = webDriver.findElement(passwordSauceDemo);
        password.sendKeys("secret_sauce");
        WebElement loginButton = webDriver.findElement(loginButtonSauceDemo);
        loginButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(addToCartButtonSauceDemo));
        int i = 1;
        while (i < 5) {
            WebElement addToCartButton = webDriver.findElement(By.xpath("(//button[text()='Add to cart'])"));
            addToCartButton.click();
            i++;
        }
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cartIconSauceDemo));
        WebElement cartIcon = webDriver.findElement(cartIconSauceDemo);
        cartIcon.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(checkoutButtonSauceDemo));
        WebElement checkoutButton = webDriver.findElement(checkoutButtonSauceDemo);
        checkoutButton.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFieldSauceDemo));
        WebElement firstNameField = webDriver.findElement(firstNameFieldSauceDemo);
        firstNameField.sendKeys("Sergey");
        WebElement lastNameField = webDriver.findElement(lastNameFieldSauceDemo);
        lastNameField.sendKeys("tester");
        WebElement zipCodeField = webDriver.findElement(zipCodeSauceDemo);
        zipCodeField.sendKeys("12345");
        WebElement continueButton = webDriver.findElement(continueButtonSauceDemo);
        continueButton.click();
        WebElement finishButton = webDriver.findElement(finishButtonSauceDemo);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(finishButton));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(finishButton);
        finishButton.click();
        WebElement backToHomeButton = webDriver.findElement(backToHomeButtonSauceDemo);
        backToHomeButton.click();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void webDriverUniversity() {
        webDriver.get("http://webdriveruniversity.com/To-Do-List/index.html");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(newToDoFieldWebDriverUniversity));
        WebElement newToDoField = webDriver.findElement(newToDoFieldWebDriverUniversity);
        newToDoField.sendKeys("MAKE HOMEWORK");
        newToDoField.sendKeys(Keys.ENTER);
        newToDoField.sendKeys("Practice Automation \n");
        WebElement practiceMagicText = webDriver.findElement(practiceMagicTextWebDriverUniversity);
        practiceMagicText.click();
        WebElement buyNewRobesText = webDriver.findElement(buyNewRobesTextWebDriverUniversity);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(buyNewRobesText);
        WebElement buyNewRobesDeleteIcon = webDriver.findElement(buyNewRobesDeleteIconWebDriverUniversity);
        actions.moveToElement(buyNewRobesDeleteIcon);
        buyNewRobesDeleteIcon.click();
        List<WebElement> toDoListItems = webDriver.findElements(By.xpath("//li"));
        for (WebElement w :
                toDoListItems) {
            Assert.assertNotEquals(w.getText(), " Buy new robes");
        }
    }

    @Test
    public void amazon() {
        webDriver.get("https://www.amazon.com/");
        webDriver.manage().window().maximize();
        try {
            webDriverWait.until(ExpectedConditions.elementToBeClickable(popUpDismissButtonAmazon));
            WebElement popUpDismissButton = webDriver.findElement(popUpDismissButtonAmazon);
            popUpDismissButton.click();
        } catch (Exception e) {

        }
        WebElement todaysDealsButton = webDriver.findElement(todaysDealsButtonAmazon);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(todaysDealsButton));
        todaysDealsButton.click();
        WebElement firstProduct = webDriver.findElement(firstProductAmazon);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(firstProduct));
        firstProduct.click();
        WebElement firstSubProductButton = webDriver.findElement(firstSubProductButtonAmazon);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(firstSubProductButtonAmazon));
        firstSubProductButton.click();
        WebElement addToCartButton = webDriver.findElement(addToCartButtonAmazon);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(proceedToCheckOutButtonAmazon));
        WebElement proceedToCheckOutButton = webDriver.findElement(proceedToCheckOutButtonAmazon);
        proceedToCheckOutButton.click();
        WebElement signInPageH1 = webDriver.findElement(signInPageH1Amazon);
        Assert.assertEquals(signInPageH1.getText(), "Sign-In");
    }
}
