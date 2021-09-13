import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver webDriver;
    String pathToProject = "D:/Selenium";
    String pathToDriver = pathToProject + "/chromedriver.exe";

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                pathToDriver);
        webDriver = new ChromeDriver();
        webDriver.get("https://www.i.ua/");
    }

    @Test
    public void test() {
        WebElement loginForm = webDriver.findElement(By.xpath("//input[@name='login']"));
        loginForm.click();
        loginForm.sendKeys("selenium");
        WebElement passwordForm = webDriver.findElement(By.xpath("//input[@name='pass']"));
        passwordForm.click();
        passwordForm.sendKeys("123456qwe");
        WebElement signInButton = webDriver.findElement(By.xpath("//*[@onsubmit='return ih_login(this)']//input[@type='submit']"));
        signInButton.submit();
        WebElement emailAddress = webDriver.findElement(By.xpath("//span[contains(text(), 'selenium@i.ua')]"));
        Assert.assertEquals(emailAddress.getText(), "selenium@i.ua", "The page is incorrect");
    }

    @AfterClass
    public void afterClass() {
        webDriver.close();
    }
}
