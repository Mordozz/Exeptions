package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task1
        float value = task1();
        System.out.println("Введено: " + value);
        //Task2
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        task2(array);
        //Task3
        task3();
        //Task4
        task4();
    }

    public static float task1() {
        Scanner scanner = new Scanner(System.in);
        float a = 0.0f;
        boolean isLegit = false;

        while (!isLegit) {
            System.out.println("Введите дробное число:");
            try {
                a = scanner.nextFloat();
                isLegit = true;
            } catch (InputMismatchException e) {
                System.out.println("Было введено не дробное число");
                scanner.next();
            }
        }
        return a;
    }

    public static void task2(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");

        String userInput = scanner.nextLine();
        try {
            checkInput(userInput);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            scanner.next();
        }

    }

    public static void checkInput(String input) throws Exception {

        if (input.trim().isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя!");
        }
        System.out.println("Вы ввели: " + input);
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
