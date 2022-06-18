package zhdanova.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import zhdanova.pages.components.CalendarComponent;
import zhdanova.pages.components.ResultTableComponent;
import zhdanova.pages.components.SubjectInputComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFormPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    SubjectInputComponent subjectInputComponent = new SubjectInputComponent();
    ResultTableComponent resultTableComponent = new ResultTableComponent();

    SelenideElement pageCheckText = $(".practice-form-wrapper");
    SelenideElement pageFirstName = $("#firstName");
    SelenideElement pageLastName = $("#lastName");
    SelenideElement pageUserEmail = $("#userEmail");
    SelenideElement pageGender = $("#genterWrapper").$(byText("Female"));
    SelenideElement pageNumber = $("#userNumber");
    SelenideElement pageDateOfBirth = $("#dateOfBirthInput");
    SelenideElement pageHobbies = $("#hobbiesWrapper").$(byText("Sports"));
    SelenideElement pagePicture = $("#uploadPicture");
    SelenideElement pageAddress = $("#currentAddress");
    SelenideElement pageState = $("#state");
    SelenideElement pageInputState = $("#react-select-3-input");
    SelenideElement pageCity = $("#city");
    SelenideElement pageInputCity = $("#react-select-4-input");
    SelenideElement pageSubmit = $("#submit");
    SelenideElement pageCheckText2 = $("#example-modal-sizes-title-lg");


    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        Selenide.zoom(0.7);
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public RegistrationFormPage checkText() {
        pageCheckText.shouldHave(text("Student Registration Form"));
        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        pageFirstName.setValue(value);
        return this;
    }

    public RegistrationFormPage setLastName(String value) {
        pageLastName.setValue(value);
        return this;
    }

    public RegistrationFormPage setEmail(String value) {
        pageUserEmail.setValue(value);
        return this;
    }

    public RegistrationFormPage setGender(String gender) {
        pageGender.click();
        return this;
    }

    public RegistrationFormPage setNumber(String value) {
        pageNumber.setValue(value);
        return this;
    }

    public RegistrationFormPage setDateOfBirth(String year, String month, String day) {
        pageDateOfBirth.click();
        calendarComponent.setDate(year, month, day);
        return this;
    }

    public RegistrationFormPage setSubjects(String someSymbols) {
        subjectInputComponent.inputSymbols(someSymbols);
        return this;
    }

    public RegistrationFormPage setHobbies(String hobbie) {
        pageHobbies.click();
        return this;
    }

    public RegistrationFormPage setPicture() {
        pagePicture.uploadFromClasspath("img/Screenshot.png");
        return this;
    }

    public RegistrationFormPage setAddress(String value) {
        pageAddress.setValue(value);
        return this;
    }

    public RegistrationFormPage setState(String value) {
        pageState.click();
        pageInputState.setValue(value).pressEnter();
        return this;
    }

    public RegistrationFormPage setCity(String value) {
        pageCity.click();
        pageInputCity.setValue(value).pressEnter();
        return this;
    }

    public RegistrationFormPage submit() {
        pageSubmit.click();
        return this;
    }

    public RegistrationFormPage checkText2() {
        pageCheckText2.shouldHave(text("Thanks for submitting the form"));
        return this;
    }

    public RegistrationFormPage checkResult(String key, String value) {
        resultTableComponent.checkResult(key, value);
        return this;
    }
}
