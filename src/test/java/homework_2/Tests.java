package homework_2;

import baseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tests extends BaseTest {

    @Test
    public void deleteAllRecords() {
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        WebElement customerLoginButton = webDriver.findElement(By.xpath("//*[contains(text(), 'Customer')]"));
        customerLoginButton.click();
        WebElement nameList = webDriver.findElement(By.id("userSelect"));
        nameList.click();
        WebElement customerPotter = webDriver.findElement(By.xpath("//option[contains(text(), 'Potter')]"));
        customerPotter.click();
        WebElement loginButton = webDriver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
        loginButton.submit();
        WebElement depositButton = webDriver.findElement(By.xpath("//*[contains(text(), 'Deposit')]"));
        depositButton.click();
        WebElement amountField = webDriver.findElement(By.xpath("//*[@placeholder='amount']"));
        amountField.click();
        amountField.sendKeys("1000");
        WebElement submitDepositValue = webDriver.findElement(By.xpath("//*[contains(text(), 'Deposit') and @type = 'submit']"));
        submitDepositValue.submit();
        WebElement withdrawlButton = webDriver.findElement(By.xpath("//*[contains(text(), 'Withdrawl')]"));
        withdrawlButton.click();
        amountField.click();
        amountField.sendKeys("900");
        WebElement transactionsButton = webDriver.findElement(By.xpath("//button[contains(text(), 'Transactions')]"));
        transactionsButton.click();
        WebElement resetButton = webDriver.findElement(By.xpath("//button[contains(text(), 'Reset')]"));
        resetButton.click();
        List<WebElement> transactionsTableRowsCollection = webDriver.findElements(By.xpath("//table[@class='table table-bordered table-striped']"));
        Assert.assertTrue(transactionsTableRowsCollection.size() == 1);
    }

    @Test
    public void openAccount() {
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        WebElement managerLoginButton = webDriver.findElement(By.xpath("//*[contains(text(), 'Manager')]"));
        managerLoginButton.click();
        WebElement addCustomerButton = webDriver.findElement(By.xpath("//button[contains(text(), 'Add')]"));
        addCustomerButton.click();
        WebElement firstNameField = webDriver.findElement(By.xpath("//input[contains(@placeholder, 'First')]"));
        firstNameField.sendKeys("Serhio");
        WebElement lastNameField = webDriver.findElement(By.xpath("//input[contains(@placeholder, 'Last')]"));
        lastNameField.sendKeys("Aguero");
        WebElement postCodeField = webDriver.findElement(By.xpath("//input[contains(@placeholder, 'Code')]"));
        postCodeField.sendKeys("12345qw");
        WebElement addCustomerSubmitFormButton = webDriver.findElement(By.xpath("//button[contains(text(), 'Add Customer') and @type='submit']"));
        addCustomerSubmitFormButton.submit();
        webDriver.switchTo().alert().accept();
        WebElement openAccountButton = webDriver.findElement(By.xpath("//button[@ng-click='openAccount()']"));
        openAccountButton.click();
        WebElement processButton = webDriver.findElement(By.xpath("//button[contains(text(), 'Process')]"));
        Assert.assertEquals(processButton.getText(), "Process");
    }

    @Test
    public void createAccount() {
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        WebElement managerLoginButton = webDriver.findElement(By.xpath("//*[contains(text(), 'Manager')]"));
        managerLoginButton.click();
        WebElement openAccountButton = webDriver.findElement(By.xpath("//button[@ng-click='openAccount()']"));
        openAccountButton.click();
        WebElement customerNameField = webDriver.findElement(By.xpath("//select[@id='userSelect']"));
        customerNameField.click();
        WebElement ronWeasleyCustomer = webDriver.findElement(By.xpath("//option[contains(text(), 'Ron')]"));
        ronWeasleyCustomer.click();
        WebElement currencyField = webDriver.findElement(By.xpath("//select[@id='currency']"));
        currencyField.click();
        WebElement dollarValue = webDriver.findElement(By.xpath("//option[@value='Dollar']"));
        dollarValue.click();
        WebElement processButton = webDriver.findElement(By.xpath("//button[contains(text(), 'Process')]"));
        Assert.assertEquals(processButton.getText(), "Process");
        webDriver.switchTo().defaultContent();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/openAccount");
    }

    @Test
    public void deleteAllAccount() {
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        WebElement managerLoginButton = webDriver.findElement(By.xpath("//*[contains(text(), 'Manager')]"));
        managerLoginButton.click();
        WebElement customersButton = webDriver.findElement(By.xpath("//button[contains(text(), 'Customers')]"));
        customersButton.click();
        List<WebElement> deleteButtonForCustomerCollection = webDriver.findElements(By.xpath("//button[contains(text(), 'Delete')]"));
        for (WebElement user :
                deleteButtonForCustomerCollection) {
            user.click();
        }
        List<WebElement> customersTableRowCollection = webDriver.findElements(By.xpath("//table[@class='table table-bordered table-striped']//tr"));
        Assert.assertTrue(customersTableRowCollection.size() == 1); // Check that we have the only row for names of the columns, and there are no rows for customers
    }

}
