package zhdanova.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import zhdanova.pages.RegistrationFormPage;

public class TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();


    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }
}
