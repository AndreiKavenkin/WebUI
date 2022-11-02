package lesson3;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class LiveJournal {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://livejournal.com");
        WebElement webElement1 = driver.findElement(By.cssSelector(".categories__item--popup-open > .categories__link"));
        WebElement webElement2 = driver.findElement(By.cssSelector(".s-header-item__link--login"));
        WebElement webElement3 = driver.findElement(By.xpath("//input[@id='user']"));
        WebElement webElement4 = driver.findElement(By.id("lj_loginwidget_password"));
        WebElement webElement5 = driver.findElement(By.className("b-loginform-checkbox__input b-ljform-checkbox ng-valid ng-dirty ng-valid-parse ng-touched ng-empty"));
        WebElement webElement6 = driver.findElement(By.cssSelector(".categories__item--popup-open:nth-child(6) > .categories__link"));
        WebElement webElement7 = driver.findElement(By.cssSelector(".cat-widget__card-wrap--horizontal .post-card-- > .post-card__link"));
        WebElement webElement8 = driver.findElement(By.cssSelector(".aentry-post__socials:nth-child(2) .\\_wo path"));
        WebElement webElement9 = driver.findElement(By.xpath("//a[contains(text(),'Пользовательское соглашение')]"));
        webElement1.click();
        webElement2.click();
        webElement3.click();
        webElement3.sendKeys("AndyBulbash");
        webElement4.click();
        webElement4.sendKeys("Qwerty123");
        webElement5.click();
        webElement6.click();
        webElement7.click();
        webElement8.click();
        webElement9.click();
        driver.navigate().to("https://livejournal.com");
        try {
            webElement3.sendKeys("AndyBulbash");
        } catch (StaleElementReferenceException e){
            System.out.println(e.getSupportUrl());
        }
        try {
            webElement4.sendKeys("Qwerty123");
        } catch (StaleElementReferenceException e){
            System.out.println(e.getSupportUrl());
        }
        driver.quit();
    }
}
