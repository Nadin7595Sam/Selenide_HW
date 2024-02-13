package lesson_3_hw.task_2;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSecondPageTest extends LoginBaseTest {

    @Test
    void loginTest() {
        open("https://test-stand.gb.ru/login");

        LoginSecondPage loginPage = new LoginSecondPage();
        loginPage.loginInSystem("annucka4", "6ec1fae7f2");

        MainSecondPage mainSecondPage = new MainSecondPage();
        mainSecondPage.createPost();

        $$("[type='text']").shouldHave();

        CreatePostSecondPage createPostSecondPage = new CreatePostSecondPage();
        createPostSecondPage.savePost("Пишем книгу", "Делюсь секретными техниками");

        sleep(5000);

        ElementSecondPage elementSecondPage = new ElementSecondPage();
        elementSecondPage.deletePost();
    }
}
