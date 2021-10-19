package ru.skypro;


public class Main {

    public static void main(String[] args) {
        // Задание 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию Android по ссылке");
        } else {
            System.out.println("Установите версию iOS по ссылке");
        }

        // Задание 2
        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите lite-версию iOS по ссылке");
            } else {
                System.out.println("Установите версию iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите lite-версию Android по ссылке");
            } else {
                System.out.println("Установите версию Android по ссылке");
            }
        }


        // Задание 3
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " является невисокосным");
        }

        // Задание 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            deliveryDistance = deliveryDays;
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryDays++;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays=deliveryDays ++ + deliveryDays;
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        // Задание 5
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
        // Задание 6
        int age = 19;
        int salary = 81_000;
        double limit;
        if (age <23) {
            limit = salary * 2;
        } else {
            limit = salary * 3;
        }
        if (salary >=50_000) {
            limit = limit * 1.2;
        } else if (salary>=80_000) {
            limit = limit * 1.5;
        }
        System.out.println("Банк готов выдать вам кредитную карут с лимитом " + limit + " рублей");


        }
    }
