package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Тестування завдання 1: Клас Animal
        System.out.println("=== Завдання 1: Клас Animal ===");
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        System.out.println(dog.getName() + " says: " + dog.makeSound());
        System.out.println(cat.getName() + " says: " + cat.makeSound());

        // Тестування завдання 2: Інтерфейс Movable
        System.out.println("\n=== Завдання 2: Інтерфейс Movable ===");

        Movable movablePoint = new Point(3.5, 2.8);
        System.out.println("Початкові координати: X=" + movablePoint.getX() + ", Y=" + movablePoint.getY());
        movablePoint.moveTo(15.0, 20.0);
        System.out.println("Після moveTo: X=" + movablePoint.getX() + ", Y=" + movablePoint.getY());

        // Тестування завдання 3: Клас Smartphone
        System.out.println("\n=== Завдання 3: Клас Smartphone ===");

        Smartphone phone = new Smartphone("iPhone 15", "+380951196964");
        System.out.println("Інформація про смартфон: " + phone);

        phone.setCoordinates(50.4501, 30.5234);
        double[] coordinates = phone.getCoordinates();
        System.out.println("GPS координати: [" + coordinates[0] + ", " + coordinates[1] + "]");

        System.out.println("\n--- Тестування дзвінків ---");
        phone.makeCall();
        phone.receiveCall();
        phone.endCall();
        phone.receiveCall();
        phone.endCall();

// Тестування завдання 4: Інтерфейс Comparable
        System.out.println("\n=== Завдання 4: Інтерфейс Comparable ===");

// Створення масиву автомобілів для тестування
        Car[] cars = {
                new Car(25000, 2020, 150),  // car1
                new Car(30000, 2018, 200),  // car2
                new Car(25000, 2019, 180),  // car3
                new Car(25000, 2020, 170),  // car4 - має бути вище за car1 (більше к.с.)
                new Car(20000, 2021, 120)   // car5
        };

        System.out.println("Масив автомобілів до сортування:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". " + cars[i]);
        }

// Сортування масиву (використовує compareTo)
        Arrays.sort(cars);

        System.out.println("\nМасив автомобілів після сортування (від найбільшого до найменшого):");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". " + cars[i]);
        }

// Детальні порівняння для перевірки
        System.out.println("\n--- Детальні порівняння ---");
        Car car1 = cars[0]; // car1 з початкового масиву
        Car car4 = cars[3]; // car4 з початкового масиву

        System.out.println("car4 " + car4 + " vs car1 " + car1 + ": " + car4.compareTo(car1));
        System.out.println("car1 " + car1 + " vs car4 " + car4 + ": " + car1.compareTo(car4));

// Перевірка конкретної пари з однаковою ціною та роком
        Car testCar1 = new Car(25000, 2020, 170);
        Car testCar2 = new Car(25000, 2020, 150);
        System.out.println("testCar1 " + testCar1 + " vs testCar2 " + testCar2 + ": " + testCar1.compareTo(testCar2));
        System.out.println("testCar2 " + testCar2 + " vs testCar1 " + testCar1 + ": " + testCar2.compareTo(testCar1));

    }
}
