package lesson_3_hw.task_2;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CreatePostSecondPage {
    private final SelenideElement title = $("[type='text']");
    private final SelenideElement description = $(".mdc-text-field__input");
    private final SelenideElement buttonSave = $("[type='submit']");

    public void savePost(String titleText, String descriptionText) {
        title.setValue(titleText);
        description.setValue(descriptionText);
        buttonSave.click();
    }
}
