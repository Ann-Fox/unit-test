package lesson3;

import java.util.Scanner;

public class CalculatorView {
    public double getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextDouble();
    }

    public void displayResult(double result) {
        System.out.print("Результат: " + result);
    }
}
