import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while ( total < 2_459_000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;
        while (i <10 ){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (i = 10; i > 0; i= i-1) {

            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void task3 () {
        System.out.println("Задача 3");
        int gY = 12_000_000;
        int R = 17;
        int S = 8;
        int years = 10;
        int year = 1;
        while (year < years ) {
            year = year + 1;
            gY = gY + gY * R / 1000 - gY * S/1000;
            System.out.println(" Год " + year + ", численность населения составляет " + gY);
        }
        }

    public static void task4 () {
        System.out.println("Задача 4");
        int wanted = 12_000_000;
        double total = 15000;
        int i = 1;
        double iPercent = 0.07;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        while ( total <= wanted) {
            i++;
            total = total * (1 + iPercent);
            System.out.println("Месяц " + i + " Сумма накоплений равна " + numberFormat.format(total) + " рублей");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int wanted = 12_000_000;
        double total = 15000;
        int i = 1;
        double iPercent = 0.07;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        while ( total <= wanted) {
            i++;
            total = total * (1 + iPercent);
            if (i % 6 == 0){
            System.out.println("Месяц " + i + " Сумма накоплений равна " + numberFormat.format(total) + " рублей");
        }
        }

    }

    public static void task6 () {
        System.out.println("Задача 6");
        double sum = 15000;
        int i9 = 12*9;
        double iPercent = 0.07;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        for (int i = 1; i <= i9; i++) {
            sum = sum * (1 + iPercent);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Сумма накоплений равна " + numberFormat.format(sum) + " рублей");
            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int friday =3;
        for (int month = 1; month <= 31; month++ ){
            if (month% 7 ==0){
                System.out.println("Сегодня пятница, " + month + " -е число. необходимо подготовить отчет");
            }}
        }

    public static void task8 () {
        System.out.println("Задача 8");
        int startYear = 0 ;
        int period = 79;
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year =startYear; year <= end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
        }



}