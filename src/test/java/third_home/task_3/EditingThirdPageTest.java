package lesson_3_hw.task_3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import lesson_3_hw.task_3.EditingThirdPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class EditingThirdPageTest extends AbstractThirdTest {

    @Test
    void loginTest() {
        // Находим и кликаем на кнопку редактирования
        $x("(//*[@class='material-icons mdc-icon-button mdc-icon-button--display-flex smui-icon-button--size-button mdc-icon-button--reduced-size mdc-ripple-upgraded--unbounded mdc-ripple-upgraded'])[2]").shouldBe(Condition.visible).click();

        // Вводим новое имя в поле ввода
        String dummyNameEdit = "Коля";
        $x("(//*[@class='mdc-text-field__input'])[1]").shouldBe(Condition.visible).setValue(dummyNameEdit);

        // Кликаем на кнопку сохранения
        $x("//*[@class='button mdc-button mdc-button--raised mdc-ripple-upgraded']").shouldBe(Condition.visible).click();

        // После сохранения можно получить ID dummy по имени
        EditingThirdPage editingPage = Selenide.page(EditingThirdPage.class);
        String dummyId = editingPage.getDummyIdByName(dummyNameEdit);

        // Проверяем, что ID dummy был найден и не равен null
        Assertions.assertNotNull(dummyId, "ID для dummy 'Коля' не найден на странице Dummies");
    }
}
