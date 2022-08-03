package JiraSprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_01D_First_LastNameDisabled {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/oktaysaglam/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

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

        WebElement userIconModuleClick = driver.findElement(By.xpath("//div[@fxlayoutalign='center center']"));
        userIconModuleClick.click();

        WebElement clickSettingOption = driver.findElement(By.xpath("(//button[@role='menuitem'])[4]"));
        clickSettingOption.click();

        WebElement firstName = driver.findElement(By.cssSelector("input[data-placeholder='First Name']"));

        WebElement lastName = driver.findElement(By.cssSelector("input[data-placeholder='Last Name']"));

        boolean isDisabled = firstName.isDisplayed();
        boolean isDisabled2 = lastName.isDisplayed();

        System.out.println("First name is disabled: " + isDisabled);
        System.out.println("Last Name name is disabled: " + isDisabled2);

    }
}
