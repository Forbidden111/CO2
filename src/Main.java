public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("задание 1");

        int clientOS = 10;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //задание 2
        System.out.println("задание 2");
        int deveceYear = 2021;
        if (clientOS == 0) {
            if (deveceYear < 2015) {
                System.out.println("iOS облегченная ");
            } else {
                System.out.println("iOS обычная ");
            }
        } else if (clientOS == 1) {
            if (deveceYear < 2015) {
                System.out.println("Android облегченная ");
            } else {
                System.out.println("Android обычная ");
            }
        }
        //задание 3
        System.out.println("задание 3");
        int year = 2023;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год высокосный");
        } else {
            System.out.println(" Год не высокосный ");

        }
        //задание 4
        System.out.println("задание 4");
        int distance = 70;
        int day = 1;

        if (distance <= 20) {
            day = 1;

        } else if (distance > 20 && distance <= 60) {
            day = 2;
        } else if (distance > 60 && distance <= 100) {
            day = 3;

        } else {
            day = -1;
        }
        if (day == -1) {
            System.out.println("Не можем доставить");
        } else {
            System.out.println("Срок доставки" + day + "дней");
        }


        //задание 5
        System.out.println("задание 5");
        int monthNumber = 13;

        switch (monthNumber) {
            case 1:
            case 2:
            case 3:

                System.out.println("1-й 3 месяця зима ");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("3/4/5 весна");
                break;
            case 7:
            case 8:
            case 9:

                System.out.println("7-9-й 3 месяця лето ");
                break;
            case 10:
            case 11:
            case 12:

                System.out.println("10-12-й 3 месяця осень ");
                break;
            default:
                System.out.println("Такого месяца не существует");


        }


    }
}