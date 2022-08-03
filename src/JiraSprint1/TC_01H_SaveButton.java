package JiraSprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC_01H_SaveButton {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/oktaysaglam/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


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

        WebElement userIconModuleClick = driver.findElement(By.xpath("//div[@fxlayoutalign='center center']"));
        userIconModuleClick.click();

        WebElement clickSettingOption = driver.findElement(By.xpath("(//button[@role='menuitem'])[4]"));
        clickSettingOption.click();

        WebElement saveButton = driver.findElement(By.xpath("//span[text()='Save']"));
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        saveButton.click();
        System.out.println("Successfully saved the necessary changes on profile");












    }
}