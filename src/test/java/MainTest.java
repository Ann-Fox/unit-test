import org.junit.jupiter.api.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test //аннотация Test (=> изолировать, не принимать никаких аргументов)
    public void testMethod1() {
        assertEquals(5, 2 + 3);
    }
    @BeforeEach
    public void setup() {
// Инициализация ресурсов
    }

    @AfterEach
    public void teardown() {
// Очистка ресурсов
        }

    @BeforeAll
    public static void globalSetup() {
// Инициализация выполняется 1 раз перед всеми тестами
    }

    @AfterAll
    public static void globalTeardown() {
// Очистка
    }

    @Test
    @DisplayName("Тест суммирования") //добавляет человекочитаемое имя
    public void testSum() {
        assertEquals(5, 2 + 3);
    }
/*
    @Test
    @Disabled
    public void testMethod() {
// этот тест не будет запущен
    }

 */
}
