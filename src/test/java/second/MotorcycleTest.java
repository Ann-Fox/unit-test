package second;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        this.motorcycle = new Motorcycle("Harley Davidson", "Street Bob", 2019);
    }

    @AfterEach
    void tearDown() {
        this.motorcycle = null;
    }


//- Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    @DisplayName("Проверка количества колес")
    void numberWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    //     - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    @DisplayName("Проверка скорости 75")
    void speedMotoTest () {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    //     - Проверить, что в режиме парковки (сначала testDrive, потом park,
//     т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    @DisplayName("Эмуляция движения транспорта")
    void parkTest () {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}