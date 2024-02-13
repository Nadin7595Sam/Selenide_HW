package lesson_3_hw.task_1;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public abstract class AbstractTest {

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
    }

    @AfterAll
    static void tearDown() {
        closeWebDriver();
    }
}
