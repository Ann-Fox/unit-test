package second;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
public class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        this.car = new Car("Audi", "q3", 2019);
    }

    @AfterEach
    void tearDown() {
        this.car = null;
    }

    /**
     * Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор
     * instanceof).
     */
//    @Test
//    @DisplayName("Принадлежность Car к Vehicle")
//    void carVehicleTest(){
//        assertInstanceOf(Vahicle.class, car);
//    }

    //    - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    @DisplayName("Проверка количества колес")
        void numberWheels() {
            assertEquals(4, car.getNumWheels());
        }

    //     - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    @DisplayName("Проверка скорости 60")
        void speedCarTest () {
            car.testDrive();
            assertEquals(60, car.getSpeed());
        }

    //     - Проверить, что в режиме парковки (сначала testDrive, потом park,
//     т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    @DisplayName("Эмуляция движения транспорта")
            void parkCarTest () {
            car.testDrive();
            car.park();
            assertEquals(0, car.getSpeed());
        }
}