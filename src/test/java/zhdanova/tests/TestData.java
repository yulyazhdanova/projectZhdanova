package zhdanova.tests;

import com.github.javafaker.Faker;
import zhdanova.utils.RandomsForForm;

import static zhdanova.utils.RandomUtils.getRandomNumber;


public class TestData {

    static Faker faker = new Faker();

    static String firstName = faker.name().firstName();
    static String lastName = faker.name().lastName();
    static String userEmail = faker.internet().emailAddress();
    static String gender = RandomsForForm.randomGender();
    static String userNumber = getRandomNumber(10);
    static String dateOfBirth = String.valueOf(faker.number().numberBetween(1,25));
    static String monthOfBirth = RandomsForForm.randomMonth();
    static String yearOfBirth = String.valueOf(faker.number().numberBetween(1990,2000));
    static String subject = RandomsForForm.randomSubjects();
    static String hobbie = RandomsForForm.randomHobbie();
    public static  final String PICTURE = "Screenshot.png";
    static String currentAddress = faker.address().fullAddress();
    public final static String USERSTATE = "NCR";
    public final static String USERCITY = "Gurgaon";

}
