package zhdanova.pages;

import com.codeborne.selenide.Selenide;
import zhdanova.pages.components.CalendarComponent;
import zhdanova.pages.components.ResultTableComponent;
import zhdanova.pages.components.SubjectInputComponent;
import zhdanova.tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFormPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    SubjectInputComponent subjectInputComponent = new SubjectInputComponent();
    ResultTableComponent resultTableComponent = new ResultTableComponent();

    public RegistrationFormPage openPage(){
        open("/automation-practice-form");
        Selenide.zoom(0.7);
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }
    public RegistrationFormPage checkText() {
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        $("#firstName").setValue(value);
        return this;
    }
    public RegistrationFormPage setLastName(String value) {
        $("#lastName").setValue(value);
        return this;
    }
    public RegistrationFormPage setEmail(String value) {
        $("#userEmail").setValue(value);
        return this;
    }
    public RegistrationFormPage setGender(){
        $("*[for=gender-radio-2]").click();
        return this;
    }
    public RegistrationFormPage setNumber(String value) {
        $("#userNumber").setValue(value);
        return this;
    }
    public RegistrationFormPage setDateOfBirth(String year, String month, String day) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(year, month, day);
        return this;
    }
    public RegistrationFormPage setSubjects (String someSymbols) {
        subjectInputComponent.inputSymbols(someSymbols);
        $("#subjectsInput").sendKeys(someSymbols);
        $("#subjectsInput").pressEnter();
        return this;
    }
    public RegistrationFormPage setHobbies () {
        $("*[for=hobbies-checkbox-1]").click();
        return this;
    }
    public RegistrationFormPage setPicture () {
        $("#uploadPicture").uploadFromClasspath("img/Screenshot.png");
        return this;
    }
    public RegistrationFormPage setAddress (String value) {
        $("#currentAddress").setValue(value);
        return this;
    }
    public RegistrationFormPage setState(String value) {
        $("#state").click();
        $("#react-select-3-input").setValue(value).pressEnter();
        return this;
    }
    public RegistrationFormPage setCity(String value) {
        $("#city").click();
        $("#react-select-4-input").setValue(value).pressEnter();
        return this;
    }
    public RegistrationFormPage submit() {
        $("#submit").click();
        return this;
    }

    public RegistrationFormPage checkText2() {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        return this;
    }
    public RegistrationFormPage checkResult(String key, String value) {
        resultTableComponent.checkResult(key, value);
        return this;
    }
}
