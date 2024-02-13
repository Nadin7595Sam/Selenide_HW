package lesson_3_hw.task_2;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainSecondPage {
    private final SelenideElement createNewPost = $("#create-btn");

    public void createPost() {
        createNewPost.click();
    }
}
