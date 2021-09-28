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
    public void demoqa() {
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
        Actions actions = new Actions(webDriver);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(goToBookStoreButtonDemoQA));

        WebElement goToBookStoreButton = webDriver.findElement(goToBookStoreButtonDemoQA);
        actions.moveToElement(goToBookStoreButton).build().perform();

        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("window.scrollBy(0, 1000)", "");

        WebElement closAdvertise = webDriver.findElement(closAdvertiseDemoQA);
        closAdvertise.click();

        goToBookStoreButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(gitPocketGuideDemoQA));
        WebElement gitPocketGuide = webDriver.findElement(gitPocketGuideDemoQA);
        gitPocketGuide.click();
        jse.executeScript("window.scrollBy(0, 1000)", "");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(addToYourCollectionButtonDemoQA));
        WebElement addToYourCollectionButton = webDriver.findElement(addToYourCollectionButtonDemoQA);
        addToYourCollectionButton.click();
        webDriverWait.until(ExpectedConditions.alertIsPresent());
        webDriver.switchTo().alert().accept();

        jse.executeScript("window.scrollBy(0, 1000)", "");
        WebElement backToBookStoreButton = webDriver.findElement(backToBookStoreButtonDemoQA);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(backToBookStoreButton));
        actions.moveToElement(backToBookStoreButton);
        backToBookStoreButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(youDontKnowJSDemoQA));
        WebElement youDontKnowJS = webDriver.findElement(youDontKnowJSDemoQA);
        jse.executeScript("window.scrollBy(0, 1000)", "");
        youDontKnowJS.click();
        jse.executeScript("window.scrollBy(0, 1000)", "");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(addToYourCollectionButtonDemoQA));
        addToYourCollectionButton = webDriver.findElement(addToYourCollectionButtonDemoQA);
        addToYourCollectionButton.click();
        webDriverWait.until(ExpectedConditions.alertIsPresent());
        webDriver.switchTo().alert().accept();
        jse.executeScript("window.scrollBy(0, 1000)", "");
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(profileButtonDemoQA));
        WebElement profileButton = webDriver.findElement(profileButtonDemoQA);
        profileButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(deleteAllBooksButtonDemoQA));
        WebElement deleteAllBooksButton = webDriver.findElement(deleteAllBooksButtonDemoQA);
        closAdvertise = webDriver.findElement(closAdvertiseDemoQA);
        closAdvertise.click();
        jse.executeScript("window.scrollBy(0, 2000)", "");
        actions.moveToElement(deleteAllBooksButton);
        deleteAllBooksButton.click();
        WebElement confirmModalButton = webDriver.findElement(confirmModalButtonDemoQA);
        confirmModalButton.click();
        webDriverWait.until(ExpectedConditions.alertIsPresent());
        webDriver.switchTo().alert().accept();
        WebElement firstBookRow = webDriver.findElement(firstBookRowDemoQA);
        Assert.assertTrue(firstBookRow.getText().equals(" "));

    }

    @Test
    public void saucedemo() {
        webDriver.get("https://www.saucedemo.com/");
        WebElement userName = webDriver.findElement(userNameSaucedemo);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(userNameSaucedemo));
        userName.sendKeys("standard_user");
        WebElement password = webDriver.findElement(passwordSaucedemo);
        password.sendKeys("secret_sauce");
        WebElement loginButton = webDriver.findElement(loginButtonSaucedemo);
        loginButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(addToCartButtonSaucedemo));
        int i = 1;
        while (i < 5) {
            WebElement addToCartButton = webDriver.findElement(By.xpath("(//button[text()='Add to cart'])"));
            addToCartButton.click();
            i++;
        }
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cartIconSaucedemo));
        WebElement cartIcon = webDriver.findElement(cartIconSaucedemo);
        cartIcon.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(checkoutButtonSaucedemo));
        WebElement checkoutButton = webDriver.findElement(checkoutButtonSaucedemo);
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
    public void webdriveruniversity() {
        webDriver.get("http://webdriveruniversity.com/To-Do-List/index.html");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(newToDoFieldWebdriveruniversity));
        WebElement newToDoField = webDriver.findElement(newToDoFieldWebdriveruniversity);
        newToDoField.sendKeys("MAKE HOMEWORK");
        newToDoField.sendKeys(Keys.ENTER);
        newToDoField.sendKeys("Practice Automation \n");
        WebElement practiceMagicText = webDriver.findElement(practiceMagicTextWebdriveruniversity);
        practiceMagicText.click();
        WebElement buyNewRobesText = webDriver.findElement(buyNewRobesTextWebdriveruniversity);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(buyNewRobesText);
        WebElement buyNewRobesDeleteIcon = webDriver.findElement(buyNewRobesDeleteIconWebdriveruniversity);
        actions.moveToElement(buyNewRobesDeleteIcon);
        buyNewRobesDeleteIcon.click();
        List<WebElement> toDoListItems = webDriver.findElements(By.xpath("//li"));
        for (WebElement w :
                toDoListItems) {
            Assert.assertFalse(w.getText().equals(" Buy new robes"));
        }


    }

    @Test
    public void amazon() {
        webDriver.get("https://www.amazon.com/");
        webDriver.manage().window().maximize();
//        WebElement popUpDissmissButton = null;
        try {
            webDriverWait.until(ExpectedConditions.elementToBeClickable(popUpDissmissButtonAmazon));

            WebElement popUpDissmissButton = webDriver.findElement(popUpDissmissButtonAmazon);
            popUpDissmissButton.click();

        } catch (NoSuchElementException e) {

        } catch (TimeoutException e) {

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
