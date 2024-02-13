import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CredentialsThirdPage {
    private final SelenideElement loginField = $("input[type='text']");
    private final SelenideElement passwordField = $("input[type='password']");
    private final SelenideElement button = $(".mdc-button__label");
    private final SelenideElement credButton = $x("(//*[@class='material-icons mdc-icon-button mdc-icon-button--display-flex smui-icon-button--size-button mdc-icon-button--reduced-size mdc-ripple-upgraded--unbounded mdc-ripple-upgraded'])[1]");

    public void loginInSystem(String login, String password) {
        loginField.setValue(login);
        passwordField.setValue(password);
        button.click();
    }

    public void clickCredButton() {
        credButton.click();
    }
}
