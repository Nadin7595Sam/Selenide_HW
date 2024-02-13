package lesson_3_hw.task_2;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import static com.codeborne.selenide.Selenide.page;

public class LoginSecondPage {
    @FindBy(xpath = "//*[@type='text']")
    private SelenideElement loginField;

    @FindBy(xpath = "//*[@type='password']")
    private SelenideElement passwordField;

    @FindBy(xpath = "//*[@class='mdc-button__label']")
    private SelenideElement button;

    public LoginSecondPage() {
        page(this);
    }

    public void loginInSystem(String login, String password) {
        loginField.setValue(login);
        passwordField.setValue(password);
        button.click();
    }
}
