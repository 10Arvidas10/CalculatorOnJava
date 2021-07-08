package com.company;

import java.util.Scanner;

public class MyFirstCalculator {

    public static void main(String[] args) {

        int a = inputNum();
        int b = inputNum();
        char operation = inputOperation();
        int result = calc(a, b, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int inputNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввести число:");
        if (scan.hasNextInt()) {
            return scan.nextInt();
        } else {
            System.out.println("Ошибка, введите целое число");
            return inputNum();
        }}

    public static char inputOperation(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите операцию:");
        char operation;
        if(scan.hasNext()){
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Ошибка");
            operation = inputOperation();
        }
        return operation;
    }
    public static int calc(int a, int b, char operation){
        int result;
        switch (operation) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            default -> {
                System.out.println("Ошибка, можно ввести только +,-,/,*");
                result = calc(a, b, inputOperation());
            }
        }
        return result;
    }
}

