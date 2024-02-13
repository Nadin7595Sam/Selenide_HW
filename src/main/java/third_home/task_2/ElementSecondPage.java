package lesson_3_hw.task_2;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class ElementSecondPage {
    private final ElementsCollection elements = $$("button");

    public void deletePost() {
        elements.get(1).click();
    }
}
