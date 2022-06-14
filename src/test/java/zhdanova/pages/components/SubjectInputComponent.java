package zhdanova.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class SubjectInputComponent {
    public void inputSymbols(String someSymbols) {
        $("#subjectsInput").sendKeys(someSymbols);
        $("#subjectsInput").pressEnter();
    }
}
