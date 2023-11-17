package lesson3;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
//ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
public class CalculatorViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private CalculatorView calculatorView;

    @Before
    public void setUpStreams() {
// Перехватываем стандартный вывод (System.out)
        System.setOut(new PrintStream(outContent));

// Создаем объект CalculatorView перед каждым тестом
        calculatorView = new CalculatorView();
    }

    @After
    public void restoreStreams() {
// Восстанавливаем оригинальный стандартный вывод
        System.setOut(originalOut);
    }

    @Test
    public void testDisplayResult() {
// Вызываем метод displayResult с аргументом 10.0
        calculatorView.displayResult(10.0);

// Проверяем, что вывод соответствует ожидаемому результату
        assertEquals("Результат: 10.0\n", outContent.toString().trim());
    }
}