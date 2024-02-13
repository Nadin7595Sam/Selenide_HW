package lesson_3_hw.task_3;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class CredentialsPageThirdTest extends AbstractThirdTest {

    @Test
    void loginTest() {
        // Находим и кликаем на кнопку с dummy credentials
        $("[aria-label='Login with Dummy Credentials']").click();

        // Проверяем, что заголовок "Dummy credentials" отображается на странице
        $("#simple-title").shouldBe(Condition.visible);

        // Проверяем, что текст "Login: user_QeVARxK6" отображается на странице
        $("#simple-content").shouldHave(Condition.text("Login: user_QeVARxK6"));

        // Проверяем, что текст "PW: a0a26b269d" отображается на странице
        $("#simple-content").shouldHave(Condition.text("PW: a0a26b269d"));

        // Проверяем наличие кнопки Close
        $("button:has(.mdc-button__label:contains(Close))").shouldBe(Condition.visible);
    }
}
