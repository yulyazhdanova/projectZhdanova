package zhdanova.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormCommentsTest extends TestBase {


    @Test
    void successfulTest() {

        String firstName = "Julia";
        String lastName = "Zhdanova";
        String userEmail = "zhdanova@mail.ru";
        String userNumber = "9165655656";
        String currentAddress = "London";

        open("/automation-practice-form");
        Selenide.zoom(0.7);
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(userEmail);


        $("*[for=gender-radio-2]").click();
//        $("#gender-radio-2").parent().click();
//        $("#genterWrapper").$(byText("Other")).click();

        $("#userNumber").setValue(userNumber);

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1992");
        $("[aria-label='Choose Wednesday, July 22nd, 1992']").click(); // wrong
//        $(".react-datepicker__day--outside-month").click();
//        $(".react-datepicker__day react-datepicker__day--002:not(.react-datepicker__day--outside-month)").click();

        $("#subjectsInput").sendKeys("emist");
        $("#subjectsInput").pressEnter();

        $("*[for=hobbies-checkbox-1]").click();

        $("#uploadPicture").uploadFromClasspath("img/Screenshot.png");
//        $("uploadPicture").uploadFile(new File("src/test/resources/Screenshot.png"));

        $("#currentAddress").setValue(currentAddress);

        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Gurgaon")).click();

        $("#submit").scrollIntoView(false);
        $("#submit").click();

        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName), text(lastName),
                text(userEmail),
                text(userNumber),
                text(currentAddress),
                text("22 July,1992"),
                text("NCR"),
                text("Gurgaon"),
                text("Female"),
                text("Chemistry"),
                text("Sports"),
                text("Screenshot.png"));
//        $("title").shouldHave(text("title text"));

        checkTable("Date of Birth", "22 July,1992");

    }

    void checkTable(String key, String value) {
        $(".table-responsive").$(byText(key))
                .parent().shouldHave(text(value));
    }

}