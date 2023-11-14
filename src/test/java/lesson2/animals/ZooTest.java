package lesson2.animals;

import org.assertj.core.api.Assertions;
import org.junit.contrib.java.lang.system.Assertion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
//    @Test
//    @DisplayName("Проверяем Zoo")
//    void testZoo(){
//        //Создаем новый поток вывода
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//
//       // Создаем список животных
//        List<Animal> animals = new ArrayList<>();
//
//        animals.add(new Mammal("Lion", 5));
//        animals.add(new Bird("Eagle", 3));
//        animals.add(new Mammal("Elephant", 10));
//
//        // Перебираем животных и вызываем их методы
//        for (Animal animal : animals) {
//            animal.eat();
//            animal.makeSound();
//            animal.sleep();
//            if (animal instanceof Mammal) {
//                ((Mammal) animal).giveBirth();
//            } else if (animal instanceof Bird) {
//                ((Bird) animal).layEggs();
//            }
//            System.out.println(); // Добавляем пустую строку для разделения вывода
//        }
//        // Ожидаемый вывод в консоль
//        String expectedOutput = "Lion is eating.\n" +
//                "Lion makes a sound.\n" +
//                "Lion is sleeping.\n" +
//                "Lion gives birth to live young.\n\n" +
//                "Eagle is eating.\n" +
//                "Eagle makes a sound.\n" +
//                "Eagle is sleeping.\n" +
//                "Eagle lays eggs.\n\n" +
//                "Elephant is eating.\n" +
//                "Elephant makes a sound.\n" +
//                "Elephant is sleeping.\n" +
//                "Elephant gives birth to live young.\n\n";
//
//// Сравниваем фактический вывод с ожидаемым
//        assertEquals(expectedOutput, outputStream.toString());
//
//// Восстанавливаем стандартный вывод
//        System.setOut(System.out);
//    }

    @Test
    void testAnimalAges() {
// Создаем список животных
        List<Animal> animals = new ArrayList<>();
        animals.add(new Mammal("Lion", 5));
        animals.add(new Bird("Eagle", 3));
        animals.add(new Mammal("Elephant", 10));

// Проверяем, что возраст каждого животного равен ожидаемому
        assertEquals(5, animals.get(0).getAge());
        assertEquals(3, animals.get(1).getAge());
        assertEquals(10, animals.get(2).getAge());
    }
}