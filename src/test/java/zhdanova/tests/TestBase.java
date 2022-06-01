package zhdanova.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
    }

    @BeforeAll
    static void oneMoreBeforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @BeforeAll
    static void andOneMoreBeforeAll() {
        Configuration.holdBrowserOpen = true;
    }
}
