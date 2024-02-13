package lesson_3_hw.task_2;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class LoginBaseTest {

    @BeforeAll
    static void setUp() {
        Selenide.open("https://test-stand.gb.ru/login");
    }

    @AfterAll
    static void tearDown() {
        Selenide.closeWebDriver();
    }
}
