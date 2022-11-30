package org.example.Lesson6;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BaseView {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@placeholder='Поиск товаров']")
    private WebElement productSearchWindow;
    @Step ("Ввод слова в строку поиска")
    public void inputSearch() {
        productSearchWindow.sendKeys("телефон");
    }
    @FindBy(xpath = "a[href = \"/phone/\"]")
    private WebElement phone;
    @Step ("Выбор категории товара из списка")
    public void searchList() {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated((By) phone));
        actions.moveToElement(phone)
                .click()
                .perform();
    }
}