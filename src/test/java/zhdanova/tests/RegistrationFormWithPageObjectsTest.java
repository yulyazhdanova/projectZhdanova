package zhdanova.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import zhdanova.pages.RegistrationFormPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormWithPageObjectsTest extends TestBase {

    @Test
    void successfulTest() {

        String firstName = "Julia";
        String lastName = "Zhdanova";
        String userEmail = "zhdanova@mail.ru";
        String userNumber = "9165655656";
        String currentAddress = "London";
        String userState = "NCR";
        String userCity = "Gurgaon";


        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender()
                .setNumber(userNumber)
                .setDateOfBirth("2001","July","13")
                .setHobbies()
                .setSubjects("emist")
                .setPicture()
                .setAddress(currentAddress)
                .setState(userState)
                .setCity(userCity)
                .submit()
                .checkText()
                .checkText2();

        registrationFormPage.checkResult("Student Name", firstName + " " + lastName)
        .checkResult("Student Email", userEmail)
        .checkResult("Gender", "Female")
        .checkResult("Mobile", userNumber)
        .checkResult("Date of Birth", "13 July,2001")
        .checkResult("Subjects", "Chemistry")
        .checkResult("Hobbies", "Sports")
        .checkResult("Picture", "Screenshot.png")
        .checkResult("Address", currentAddress)
        .checkResult("State and City", "NCR" + " " + "Gurgaon" );
    }

}