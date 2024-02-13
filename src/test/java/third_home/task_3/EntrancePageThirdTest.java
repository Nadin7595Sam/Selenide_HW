package lesson_3_hw.task_3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import lesson_2_hw.EntrancePage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EntrancePageThirdTest extends AbstractThirdTest {

    @Test
    void loginTest() {
        // Входим в систему без ввода логина и пароля
        EntrancePage.loginInSystem("", "");

        // Нажимаем на кнопку входа
        $(".mdc-button__label").click();

        // Проверяем, что текст ошибки "Invalid credentials" отображается на странице
        $$(".error-block.svelte-uwkxn9").first().shouldBe(Condition.visible);
    }
}
