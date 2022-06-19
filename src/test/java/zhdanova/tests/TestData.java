package zhdanova.tests;

import com.github.javafaker.Faker;
import zhdanova.utils.RandomsForForm;

import static zhdanova.utils.RandomUtils.getRandomNumber;


public class TestData {

    static Faker faker = new Faker();

    final String firstName = faker.name().firstName();
    final String lastName = faker.name().lastName();
    final String userEmail = faker.internet().emailAddress();
    final String gender = RandomsForForm.randomGender();
    final String userNumber = getRandomNumber(10);
    final String dateOfBirth = String.valueOf(faker.number().numberBetween(5,25));
    final String monthOfBirth = RandomsForForm.randomMonth();
    final String yearOfBirth = String.valueOf(faker.number().numberBetween(1990,2000));
    final String subject = RandomsForForm.randomSubjects();
    final String hobby = RandomsForForm.randomHobbie();
    final String PICTURE = "img/Screenshot.png";
    final String currentAddress = faker.address().fullAddress();
    final String USERSTATE = "NCR";
    final String USERCITY = "Gurgaon";

}
