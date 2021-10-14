package ru.skypro;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите lite-версию iOS по ссылке");
        }   if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите lite-версию Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию iOS по ссылке");}


        // Задание 3
        int year = 2021;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else if (year % 100 == 0) {
        System.out.println(year + " является невисокосным");}
        else {
            System.out.println(year + " является невисокосным");
        }

        // Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + "1");
        }   if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + "2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + "3");
        }

        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
        // Задание 6
        int age = 19;
        int salary = 81_000;
        if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("limit: " + (salary*3)*1.2);}
        if (age < 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("limet: " + (salary*2)*1.2);}
        else if (age >= 23 && salary >= 80_000) {
            System.out.println("limet: " + (salary*3)*1.5);}
        if (age < 23 && salary >= 80_000) {
            System.out.println("limit: " + (salary*2)*1.5);}
    }
}
