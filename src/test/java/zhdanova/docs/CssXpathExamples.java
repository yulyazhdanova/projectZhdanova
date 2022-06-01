package zhdanova.docs;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpathExamples() {
//        <input autocomplete="off" placeholder="name@example.com" type="email" id="userEmail" class="mr-sm-2 form-control" data-testid="email">
        $("[data-testid=email]").setValue("123");
        $(by("data-testid", "email")).setValue("123");

//        <input autocomplete="off" placeholder="name@example.com" type="email" id="email" class="mr-sm-2 form-control" data-testid="email">
        $("[id=email]").setValue("123");
        $("#email").setValue("123");
        $(byId("email")).setValue("123");
        $(By.id("email")).setValue("123");
        $x("//*[@id='email']").setValue("123");
        $(byXpath("//*[@id='email']")).setValue("123");

//      Ctrl+C Ctrl+R - выделить одинаковые значения
//      Ctrl + Alt + L - красивое расположение, делать перед коммитом
//      intersepted - прерван
//      дебаг режим работает с паузами
//      все теги * кроме id(#) и классов(.)
//
//        <div class="react-datepicker__day react-datepicker__day--002" tabindex = "-1"
//        aria - label = "Choose Monday, May 2nd, 2022" role = "option" aria - disabled = "false" > 2 </div >
//         <div class="react-datepicker__day react-datepicker__day--002 react-datepicker__day--outside-month"
//        tabindex = "-1" aria - label = "Choose Thursday, June 2nd, 2022" role = "option" aria - disabled = "false" > 2 </
//        div >
    }
}
