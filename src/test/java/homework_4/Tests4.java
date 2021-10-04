package homework_4;

import baseTest.BaseTest;
import homework_3.LocatorsInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests4 extends BaseTest implements LocatorsInterface {
    @Test
    public void shopDemoQA() {
        webDriver.get("http://shop.demoqa.com");
        String pageTitle = webDriver.getTitle();
        int titleLength = pageTitle.length();
        System.out.println(pageTitle);
        System.out.println(titleLength);
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://shop.demoqa.com/");
        String pageSource = webDriver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println(pageSourceLength);
    }

    @Test
    public void demoQA() {
        webDriver.get("https://demoqa.com/profile");
        WebElement registerButton = webDriver.findElement(registerButtonDemoQA);
        registerButton.click();
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().to("https://demoqa.com/");
        webDriver.navigate().refresh();
    }

    @Test
    public void demoQAProgressBar() {
        webDriver.get("https://demoqa.com/progress-bar");
        WebElement startButton = webDriver.findElement(startButtonDemoQA);
        startButton.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(resetButtonDemoQA));
        WebElement resetButton = webDriver.findElement(resetButtonDemoQA);
        resetButton.click();
        startButton = webDriver.findElement(startButtonDemoQA);
        webDriverWait.until(ExpectedConditions.visibilityOf(startButton));
    }

    @Test
    public void demoQADynamicProperties() {
        webDriver.get("https://demoqa.com/dynamic-properties");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(visibleAfter5SecondsButtonDemoQA));
    }

    @Test
    public void demoQAFrames() {
        webDriver.get("https://demoqa.com/frames");
        WebElement frame1 = webDriver.findElement(frame1DemoQA);
        webDriver.switchTo().frame(frame1);
        WebElement frameHeaderText = webDriver.findElement(frameHeaderTextDemoQA);
        System.out.println(frameHeaderText.getText());
        webDriver.switchTo().defaultContent();
        WebElement frame2 = webDriver.findElement(frame2DemoQA);
        webDriver.switchTo().frame(frame2);
        frameHeaderText = webDriver.findElement(frameHeaderTextDemoQA);
        System.out.println(frameHeaderText.getText());
    }

    @Test
    public void demoQAPracticeForm() {
        webDriver.get("https://demoqa.com/automation-practice-form");
        webDriver.manage().window().maximize();
        WebElement firstNameStudentRegistrationForm = webDriver.findElement(firstNameStudentRegistrationFormDemoQA);
        firstNameStudentRegistrationForm.sendKeys("Sergey");
        WebElement lastNameStudentRegistrationForm = webDriver.findElement(lastNameStudentRegistrationFormDemoQA);
        lastNameStudentRegistrationForm.sendKeys("Petrov");
        WebElement emailStudentRegistrationForm = webDriver.findElement(emailStudentRegistrationFormDemoQA);
        emailStudentRegistrationForm.sendKeys("test@gmail.com");
        WebElement genderMaleRadioButton = webDriver.findElement(genderMaleRadioButtonDemoQA);
        genderMaleRadioButton.click();
        WebElement phoneNumberField = webDriver.findElement(phoneNumberFieldDemoQA);
        phoneNumberField.sendKeys("0975647055");
        WebElement dateOfBirthPicker = webDriver.findElement(dateOfBirthPickerDemoQA);
        dateOfBirthPicker.click();
        WebElement octoberThe10thIcon = webDriver.findElement(By.xpath("(//div[@class='react-datepicker__week']/div[text()='10'])[1]"));
        octoberThe10thIcon.click();
        WebElement hobbiesFirstCheckbox = webDriver.findElement(hobbiesFirstCheckboxDemoQA);
        hobbiesFirstCheckbox.click();
        WebElement currentAddressTextField = webDriver.findElement(currentAddressTextFieldDemoQA);
        currentAddressTextField.sendKeys("Test city, New street 123");
        WebElement stateDropdownStudentRegistrationForm = webDriver.findElement(stateDropdownStudentRegistrationFormDemoQA);
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        stateDropdownStudentRegistrationForm.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(haryanaStateDropDownOptionDemoQA));
        WebElement haryanaStateDropDownOption = webDriver.findElement(haryanaStateDropDownOptionDemoQA);
        haryanaStateDropDownOption.click();
        WebElement cityDropdownStudentRegistrationForm = webDriver.findElement(cityDropdownStudentRegistrationFormDemoQA);
        cityDropdownStudentRegistrationForm.click();
        WebElement karnalCityDropDownOption = webDriver.findElement(By.xpath("//div[text()='Karnal']"));
        webDriverWait.until(ExpectedConditions.visibilityOf(karnalCityDropDownOption));
        karnalCityDropDownOption.click();
        WebElement submitButton = webDriver.findElement(submitButtonDemoQA);
        submitButton.click();
    }

    @Test
    public void demoQATextBox() {
        webDriver.get("https://demoqa.com/text-box");
        WebElement fullNameField = webDriver.findElement(fullNameFieldDemoQA);
        fullNameField.sendKeys("Serhio Aguero");
        WebElement emailField = webDriver.findElement(emailTextBoxFieldDemoQA);
        emailField.sendKeys("test@gmail.com");
        WebElement currentAddress = webDriver.findElement(currentAddressTextBoxFieldDemoQA);
        currentAddress.sendKeys("Test city, New street 123");
        WebElement permanentAddress = webDriver.findElement(permanentAddressTextBoxFieldDemoQA);
        permanentAddress.sendKeys("Dallas, Main avenue 10");
        WebElement submitButton = webDriver.findElement(submitButtonDemoQA);
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("arguments[0].click();", submitButton);
    }
}

