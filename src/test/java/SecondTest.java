import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SecondTest {
    WebDriver webDriver;

    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://www.i.ua/");
    }

    @Test
    public void test() {
        webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        webDriver.manage().window().maximize();
        WebElement loginForm = webDriver.findElement(By.xpath("//input[@name='login']"));
        loginForm.click();
        loginForm.sendKeys("selenium");
        WebElement passwordForm = webDriver.findElement(By.xpath("//input[@name='pass']"));
        passwordForm.click();
        passwordForm.sendKeys("123456qwe");
        WebElement signInButton = webDriver.findElement(By.xpath("//*[@onsubmit='return ih_login(this)']//input[@type='submit']"));
        signInButton.submit();
        WebElement emailAddress = webDriver.findElement(By.xpath("//*[contains(text(), 'selenium')]"));
        Assert.assertEquals(emailAddress.getText(), "selenium@i.ua", "The page is incorrect");
    }

    @AfterClass
    public void afterClass() {
//        webDriver.close();
    }
}
