package zhdanova.tests;

import org.junit.jupiter.api.Test;
import zhdanova.pages.RegistrationFormPage;

public class RegistrationFormWithFakerTest extends TestBase {
    
    @Test
    void successfulTest() {

        RegistrationFormPage registrationFormPage = new RegistrationFormPage();
        TestData testData = new TestData();

        registrationFormPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.userEmail)
                .setGender(testData.gender)
                .setNumber(testData.userNumber)
                .setDateOfBirth(testData.yearOfBirth,testData.monthOfBirth, testData.dateOfBirth)
                .setSubjects(testData.subject)
                .setHobbies(testData.hobby)
                .setPicture(testData.PICTURE)
                .setAddress(testData.currentAddress)
                .setState(testData.USERSTATE)
                .setCity(testData.USERCITY)
                .submit()
                .checkSummaryOfForm()
                .checkSummaryOfFinalForm();

        registrationFormPage.checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Student Email", testData.userEmail)
                .checkResult("Gender", testData.gender)
                .checkResult("Mobile", testData.userNumber)
                .checkResult("Date of Birth", testData.dateOfBirth + " " + testData.monthOfBirth + "," + testData.yearOfBirth)
                .checkResult("Subjects", testData.subject)
                .checkResult("Hobbies", testData.hobby)
                .checkResult("Picture", testData.PICTURE)
                .checkResult("Address", testData.currentAddress)
                .checkResult("State and City", testData.USERSTATE + " " + testData.USERCITY);
    }
}
