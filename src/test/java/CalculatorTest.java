import org.example.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Fail.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void beforeAll() {
// Здесь могут быть глобальные операции инициализации
    }

    @AfterAll
    static void afterAll() {
// Здесь могут быть глобальные операции завершения
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    /*
       Задание 1.1 ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент
       скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки
       AssertJ. Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение
       ArithmeticException.
   */
    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 101})
    @DisplayName("Проверка процентов")
    void calculatingDiscount(int percent) {
        int purchaseAmount = 1000;
        assertThrows(ArithmeticException.class, () -> calculator.calculatingDiscount(purchaseAmount, percent));
    }

    @Test
    @DisplayName("Проверка суммы денег")
    void calculatingDiscount() {
        int purchaseAmount = -1;
        int purchasePercent = 50;
        assertThrows(ArithmeticException.class, () -> calculator.calculatingDiscount(purchaseAmount, purchasePercent));
        assertThrows(ArithmeticException.class, () -> calculator.calculatingDiscount(Integer.MAX_VALUE + 1,
                purchasePercent));
    }

    /*
      Задание 1.1 **
  */
    @Test
    @DisplayName("Проверка суммирования")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Проверка вычитания")
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    @DisplayName("Проверка умножения")
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("Проверка деления")
    void testDivide() {
        Assertions.assertEquals(2.0, calculator.divide(4, 2));
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    @Test
    @Disabled("Этот тест отключен")
    void disabledTest() {
        fail("Не будет выполнен");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("Параметризованный тест для умножения на 2")
    void testMultiplyWithParameters(int arg) {
        assertEquals(arg * 2, calculator.multiply(arg, 2));
    }
}

//public class CalculatorTest {
//    private Calculator calculator;
//
//    @BeforeAll
//    public static void initAll() {
//// Здесь можно, например, подключиться к базе данных
//    }
//
//    @AfterAll
//    public static void tearDownAll() {
//// Закрытие соединения с базой данных
//    }
//
//    @BeforeEach
//    public void init() {
//        calculator = new Calculator(); // Инициализация перед каждым тестом
//    }
//
//    @AfterEach
//    public void tearDown() {
//        calculator = null; // Очистка после каждого теста
//    }
//
//    @Test
//    @DisplayName("Проверка суммирования")
//    public void testAdd() {
//        assertEquals(5, calculator.add(2, 3));
//    }
//
//    @Test
//    @DisplayName("Проверка вычитания")
//    public void testSubtract() {
//        assertEquals(1, calculator.subtract(3, 2));
//    }
//
//    @Test
//    @Disabled
//    @DisplayName("Тест отключен")
//    public void testDisabled() {
//        fail("Этот тест не будет выполнен");
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {0, 1, 5, 100})
//    @DisplayName("Параметризованный тест для суммирования")
//    public void parameterizedTest(int arg) {
//        assertEquals(arg + 2, calculator.add(arg, 2));
//    }
//}
