package org.example;

public class Calculator {
    /**
     * Задание 1. ** В классе Calculator создайте метод calculateDiscount,
     * который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
     * Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
     * Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
     * Не забудьте написать тесты для проверки этого поведения.
     */
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (discountAmount < 1 || discountAmount > 100) {
            throw new ArithmeticException("Процент скидки должен быть в пределах от 1 до 100");
        } else if (purchaseAmount < 0 || purchaseAmount > Integer.MAX_VALUE) {
            throw new ArithmeticException("Некорректная сумма");
        }
        return purchaseAmount - (purchaseAmount * discountAmount) / 100;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int i, int i1) {
        return i * i1;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
        return dividend / divisor;
    }

// Допустим, у вас есть и другие методы калькулятора
}
