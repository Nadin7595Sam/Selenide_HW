package lesson_3_hw.task_3;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class EntranceThirdPage {
    private static final SelenideElement button = $(".mdc-button__label");

    public static void loginInSystem(String username, String password) {
        button.click();
    }
}
