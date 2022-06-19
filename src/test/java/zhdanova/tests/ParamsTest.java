package zhdanova.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class ParamsTest {

    @ValueSource(strings = {"пуховик", "жилет"})
    @ParameterizedTest(name = "Проверка поиска по категории {0}, в результате отображается {0}")
    void testCommon(String testData) {

        Selenide.open("https://www.lamoda.ru/");
        $(by("class", "_3jotUx9G5izzdWD5DIoPVO _91HSD7tcHouxctDsMacBB")).setValue(testData);
        $(by("class", "x-button x-button_primaryFilledWeb7184 x-button_32 _1nlEyvyy1LHvJnhzmHYHEz")).click();
        SelenideElement selenideElement = $("._3eflGv4Cqx_dm_lx14PhWc").parent().find(String.valueOf(text(testData))).shouldHave(text(testData));

    }

    //    @CsvFileSource(resources = "test_data/csv_file1.csv")
    @CsvSource(value = {
            "пуховик, Товары по запросу пуховик",
            "жилет, Товары по запросу жилет"})
    @ParameterizedTest(name = "Проверка поиска по категории {0}, в результате отображается {1}")
    void testCommonComplex(String searchData, String expectedResult) {

        Selenide.open("https://www.lamoda.ru/");
        $(by("class", "_3jotUx9G5izzdWD5DIoPVO _91HSD7tcHouxctDsMacBB")).setValue(searchData);
        $(by("class", "x-button x-button_primaryFilledWeb7184 x-button_32 _1nlEyvyy1LHvJnhzmHYHEz")).click();
        SelenideElement selenideElement = $("._3eflGv4Cqx_dm_lx14PhWc").parent().find(String.valueOf(text(expectedResult))).shouldHave(text(expectedResult));

    }

    static Stream<Arguments> testCommonVeryComplexDataProvider() {
        return Stream.of(
                Arguments.of("пуховик", List.of("Товары", " по запросу")),
                Arguments.of("жилет", List.of("Товары", " по запросу"))
        );
    }

    @MethodSource(value = "testCommonVeryComplexDataProvider")
    @ParameterizedTest(name = "Проверка поиска по категории {0}, в результате отображается {1}")
    void testCommonVeryComplex(String searchData, List<String> expectedResult) {

        Selenide.open("https://www.lamoda.ru/");
        $(by("class", "_3jotUx9G5izzdWD5DIoPVO _91HSD7tcHouxctDsMacBB")).setValue(searchData);
        $(by("class", "x-button x-button_primaryFilledWeb7184 x-button_32 _1nlEyvyy1LHvJnhzmHYHEz")).click();
        SelenideElement selenideElement = $("._3eflGv4Cqx_dm_lx14PhWc").parent().shouldHave(text(String.valueOf(expectedResult)));

    }

    @EnumSource(Cloths.class)
    @ParameterizedTest(name = "Проверка поиска по категории {0}, в результате отображается {1}")
    void testCommonEnam(Cloths cloths) {

        Selenide.open("https://www.lamoda.ru/");
        $(by("class", "_3jotUx9G5izzdWD5DIoPVO _91HSD7tcHouxctDsMacBB")).setValue(cloths.desc);
        $(by("class", "x-button x-button_primaryFilledWeb7184 x-button_32 _1nlEyvyy1LHvJnhzmHYHEz")).click();
        SelenideElement selenideElement = $("._3eflGv4Cqx_dm_lx14PhWc").parent().shouldHave(text(String.valueOf(cloths.desc)));

    }
}
