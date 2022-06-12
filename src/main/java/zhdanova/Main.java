package zhdanova;

public class Main {
    public static void main(String[] args) {

        exersise1();
        exersise2();
        exersise3();
        exersise4();
        exersise5();
    }

    public static void exersise1() {
        int a = 100;
        int b = 20;
        int c = (b / a);
        int d = (b + a);
        System.out.println("c = " + c); //результат с переполнением
        System.out.println("d = " + d);
    }

    public static void exersise2() {
        int a = 5;
        double b = 5.5;
        System.out.println("c = " + (a + b)); //вычисления комбинаций типов данных
        System.out.println("d = " + (a - b)); //вычисления комбинаций типов данных
        System.out.println("e = " + (a * b)); //вычисления комбинаций типов данных
        System.out.println("f = " + (a / b)); //вычисления комбинаций типов данных
        System.out.println("g = " + (++b));
        System.out.println("h = " + (--a));

    }

    public static void exersise3() {
        int a = -30;
        int b = 30;
        int c = (a + b);
        String string = "Сумма положительная";
        if (c > 0) {
            System.out.println(string);
        } else if (c == 0) {
            System.out.println("c равно 0");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void exersise4() {
        int value = 15;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value < 100) {
            System.out.println("Желтый");
        } else if (value <= 100) {
            System.out.println("Зеленый");
        }
    }

    public static void exersise5() {
        int a = 5;
        long b = 8000000000000000L;
        long c = (a + b);
        long d = (c - b); // типом int d уже не инициализировать
        long e = (d - a);  // типом int е уже не инициализировать
        System.out.println("c = " + c); // операция над разными типами данных
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
