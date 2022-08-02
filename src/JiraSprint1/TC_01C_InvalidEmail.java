package JiraSprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_01C_InvalidEmail {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/oktaysaglam/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.get("https://campus.techno.study/user-courses");

        driver.manage().window().maximize();

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

        String value = "sdfdd@123.er";
        WebElement emailInputOption = driver.findElement(By.xpath("//*[@id='mat-input-4']"));
        emailInputOption.clear();
        emailInputOption.sendKeys(value);

        if(value.equals(userName)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed!, Entered Invalid Email");
        }

        WebElement saveButton = driver.findElement(By.cssSelector("button[color='accent']"));
        saveButton.click();



    }
}
