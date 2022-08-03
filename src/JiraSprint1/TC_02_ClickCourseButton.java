package JiraSprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC_02_ClickCourseButton {

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

        WebElement courseIcon = driver.findElement(By.cssSelector("button[style='margin-right: 4px;']"));
        courseIcon.click();

        WebElement detailsIcon = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[17]"));
        System.out.println(detailsIcon.isDisplayed()+ "" + " : able to see details option successfully");


        WebElement syllabus = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[18]"));
        System.out.println(syllabus.isDisplayed()+ "" + " : able to see syllabus option successfully");

        WebElement detailsOption = driver.findElement(By.xpath("//*[@id='container-3']/courses/ms-browse/div/mat-grid-list/div/mat-grid-tile[4]/div/mat-card/mat-card-footer/div[1]/button"));
        detailsOption.click();

        WebElement assignmentButton = driver.findElement(By.xpath("//*[@id='mat-tab-label-0-1']/div/span"));
        wait.until(ExpectedConditions.elementToBeClickable(assignmentButton));
        assignmentButton.click();
        System.out.println(assignmentButton.isDisplayed()+ "" + " : able to see course assignments page successfully");











    }
}
