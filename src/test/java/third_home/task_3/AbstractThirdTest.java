package lesson_3_hw.task_3;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public abstract class AbstractThirdTest {
    @BeforeEach
    void setUpBeforeEach() {
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080"; // Настройка размера окна браузера
        Configuration.timeout = 10000; // Установка таймаута ожидания в миллисекундах

        open("https://test-stand.gb.ru/login");
        loginInSystem("GB202212c8b3e9", "b3b37b4d9c");
    }

    @AfterEach
    void tearDownAfterEach() {
        Selenide.closeWebDriver();
    }

    protected void loginInSystem(String username, String password) {
        $("#username").val(username);
        $("#password").val(password);
        $("#login").click();
    }

    protected SelenideElement findElementByPartialLinkText(String text) {
        return $(byPartialLinkText(text));
    }
}