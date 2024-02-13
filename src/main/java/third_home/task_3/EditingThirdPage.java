package lesson_3_hw.task_3;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.*;

public class EditingThirdPage {
    private final SelenideElement editButton = $(byCssSelector(".material-icons.mdc-icon-button"));
    private final SelenideElement nameInput = $(byCssSelector(".mdc-text-field__input"));
    private final SelenideElement saveButton = $(byCssSelector(".button.mdc-button"));

    // Локатор для ячеек с ID
    private final ElementsCollection idCells = $$(byCssSelector(".mdc-data-table__cell.mdc-data-table__cell--numeric"));

    public void clickEditButton() {
        editButton.click();
    }

    public void enterName(String name) {
        nameInput.sendKeys(name);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    // Метод для поиска ID dummy по имени
    public String getDummyIdByName(String dummyName) {
        for (SelenideElement cell : idCells) {
            if (cell.getText().contains(dummyName)) {
                // Извлекаем текст из ячейки, содержащей ID dummy
                return cell.getText();
            }
        }
        // Если не найдено совпадений, возвращаем null
        return null;
    }
}
