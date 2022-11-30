package org.example.Lesson6;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonePage extends BaseView{
    public PhonePage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//a[. =\"Смартфоны\"]")
    private WebElement phone;
    @Step ("Выбор подкатегории товара в категории товара")
    public void searchPhone () {
        actions.moveToElement(phone)
                .click()
                .perform();
    }
}