package zhdanova.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormWithPageObjectsTest extends TestBase {

    @Test
    void successfulTest() {

        String firstName = "Julia";
        String lastName = "Zhdanova";
        String userEmail = "zhdanova@mail.ru";
        String Gender = "Female";
        String userNumber = "9165655656";
        String dateOfBirth = "13 July,2001";
        String subject = "Chemistry";
        String hobby = "Sports";
        String address = "Screenshot.png";
        String currentAddress = "London";
        String userState = "NCR";
        String userCity = "Gurgaon";


        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender()
                .setNumber(userNumber)
                .setDateOfBirth("2001", "July", "13")
                .setHobbies()
                .setSubjects(subject)
                .setPicture()
                .setAddress(currentAddress)
                .setState(userState)
                .setCity(userCity)
                .submit()
                .checkText()
                .checkText2();

        registrationFormPage.checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", userEmail)
                .checkResult("Gender", Gender)
                .checkResult("Mobile", userNumber)
                .checkResult("Date of Birth", dateOfBirth)
                .checkResult("Subjects", subject)
                .checkResult("Hobbies", hobby)
                .checkResult("Picture", address)
                .checkResult("Address", currentAddress)
                .checkResult("State and City", userState + " " + userCity);
    }

    void checkTable(String key, String value) {
        $(".table-responsive").$(byText(key))
                .parent().shouldHave(text(value));
    }
}