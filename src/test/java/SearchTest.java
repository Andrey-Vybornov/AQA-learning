import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    @Test
    void saccessfulSearchTest() {
        Configuration.holdBrowserOpen = true;

    //открыть https://google.com
    open("https://google.com");

    //Ввести "Selenide" в строку поиска
    $("[name=q]").setValue("Selenide").pressEnter();

    //Проверить что "Selenide.org" появился в результатах поиска
    $("[id=search]").shouldHave(text("Selenide.org"));


    }
}

