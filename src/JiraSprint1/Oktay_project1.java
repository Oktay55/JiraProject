package JiraSprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Oktay_project1 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/oktaysaglam/Downloads/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://campus.techno.study/user-courses");
        driver.manage().window().maximize();

        WebElement acceptCookies = driver.findElement(By.xpath("(//button[text()='Accept all cookies'])[1]"));
        acceptCookies.click();

        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userName.sendKeys("oktaysaglam55@gmail.com");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordInput.sendKeys("#Samsunspor55");

        WebElement loginInput = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]"));
        loginInput.click();
    }

    @Test
    public void defaultLanguage() {

        String expected1 = "English";
        String expected2 = "Turkish";

        WebElement userIconModuleClick = driver.findElement(By.xpath("//div[@fxlayoutalign='center center']"));
        userIconModuleClick.click();

        WebElement clickSettingOption = driver.findElement(By.xpath("(//button[@role='menuitem'])[4]"));
        clickSettingOption.click();


        WebElement englishLanguage = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));
        String actual = englishLanguage.getText();
        englishLanguage.click();

        boolean isEnglishOptionAppears = englishLanguage.isDisplayed();

        Assert.assertTrue(isEnglishOptionAppears);
        Assert.assertEquals(actual, expected1);

        WebElement turkishLanguage = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]"));
        String actual2 = turkishLanguage.getText();
        turkishLanguage.click();

        boolean isTurkishOptionAppears = turkishLanguage.isDisplayed();

        Assert.assertTrue(isTurkishOptionAppears);
        Assert.assertEquals(actual2, expected2);



    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
