package zhdanova.tests;

import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static zhdanova.tests.TestData.*;

public class RegistrationFormWithFakerTest extends TestBase {
    
    @Test
    void successfulTest() {

        TestData testData = new TestData();

        registrationFormPage.openPage()
                .setFirstName(TestData.firstName)
                .setLastName(TestData.lastName)
                .setEmail(TestData.userEmail)
                .setGender(TestData.gender)
                .setNumber(TestData.userNumber)
                .setDateOfBirth(TestData.yearOfBirth,TestData.monthOfBirth, TestData.dateOfBirth)
                .setSubjects(TestData.subject)
                .setHobbies(TestData.hobbie)
                .setPicture()
                .setAddress(TestData.currentAddress)
                .setState(USERSTATE)
                .setCity(USERCITY)
                .submit()
                .checkText()
                .checkText2();

        registrationFormPage.checkResult("Student Name", TestData.firstName + " " + TestData.lastName)
                .checkResult("Student Email", TestData.userEmail)
                .checkResult("Gender", TestData.gender)
                .checkResult("Mobile", TestData.userNumber)
                .checkResult("Date of Birth", dateOfBirth + " " + TestData.monthOfBirth + "," + yearOfBirth)
                .checkResult("Subjects", TestData.subject)
                .checkResult("Hobbies", TestData.hobbie)
                .checkResult("Picture", PICTURE)
                .checkResult("Address", TestData.currentAddress)
                .checkResult("State and City", USERSTATE + " " + USERCITY);
    }

    void checkTable(String key, String value) {
        $(".table-responsive").$(byText(key))
                .parent().shouldHave(text(value));
    }


}
