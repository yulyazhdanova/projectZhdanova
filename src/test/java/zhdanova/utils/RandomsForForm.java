package zhdanova.utils;

import java.util.Random;

public class RandomsForForm {

    public static String randomGender() {

        String[] gender = new String[]{"Male", "Female", "Other"};
        String random = (gender[new Random().nextInt(gender.length)]);
        return random;
    }

    public static String randomSubjects() {

        String[] subject = new String[]{"English", "German", "Biology", "Hindi", "Chemistry", "Maths"};
        String random = (subject[new Random().nextInt(subject.length)]);
        return random;
    }

    public static String randomHobbie() {

        String[] hobby = new String[]{"Sports", "Reading", "Music"};
        String random = (hobby[new Random().nextInt(hobby.length)]);
        return random;
    }

    public static String randomMonth() {
        String[] month = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        String random = (month[new Random().nextInt(month.length)]);
        return random;
    }

}
