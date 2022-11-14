package org.example.Lesson6;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonePage extends BaseView{

    public PhonePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//a[. =\"Смартфоны\"]")
    private WebElement Phone;

    public void searchPhone () {
        actions.moveToElement(Phone)
                .click()
                .perform();
    }
}