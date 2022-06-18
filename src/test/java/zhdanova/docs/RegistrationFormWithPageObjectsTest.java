//package zhdanova.docs;
//
//import org.junit.jupiter.api.Test;
//import zhdanova.tests.TestBase;
//import zhdanova.tests.TestData;
//
//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Selectors.byText;
//import static com.codeborne.selenide.Selenide.$;
//import static zhdanova.tests.TestData.*;
//
//public class RegistrationFormWithPageObjectsTest extends TestBase {
//
//    @Test
//    void successfulTest() {
//
//        registrationFormPage.openPage()
//                .setFirstName(FIRSTNAME)
//                .setLastName(LASTNAME)
//                .setEmail(USEREMAIL)
//                .setGender(TestData.gender)
//                .setNumber(USERNUMBER)
//                .setDateOfBirth("2001", "July", "13")
//                .setHobbies(TestData.hobbie)
//                .setSubjects(SUBJECT)
//                .setPicture()
//                .setAddress(CURRENTADDRESS)
//                .setState(USERSTATE)
//                .setCity(USERCITY)
//                .submit()
//                .checkText()
//                .checkText2();
//
//        registrationFormPage.checkResult("Student Name", FIRSTNAME + " " + LASTNAME)
//                .checkResult("Student Email", USEREMAIL)
//                .checkResult("Gender", GENDER)
//                .checkResult("Mobile", USERNUMBER)
//                .checkResult("Date of Birth", DATEOFBIRTH)
//                .checkResult("Subjects", SUBJECT)
//                .checkResult("Hobbies", HOBBY)
//                .checkResult("Picture", PICTURE)
//                .checkResult("Address", CURRENTADDRESS)
//                .checkResult("State and City", USERSTATE + " " + USERCITY);
//    }
//
//    void checkTable(String key, String value) {
//        $(".table-responsive").$(byText(key))
//                .parent().shouldHave(text(value));
//    }
//}