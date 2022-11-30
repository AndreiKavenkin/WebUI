package org.example.Lesson6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessBlock extends BaseView {
    public SuccessBlock(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h1[contains(text(), 'Смартфоны')] ")
    private WebElement rightSelection;
    @Step ("Проверка успешного поиска")
    public void verificationSuccessSelection() {
        String expected = "Смартфоны";
        assertEquals(expected,rightSelection.getText());
    }
    private void assertEquals(String expected, String rightSelection) {
    }
}
