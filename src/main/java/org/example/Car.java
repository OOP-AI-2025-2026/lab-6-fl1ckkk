package org.example;

public class Car implements Comparable {
    private int price;
    private int year; // рік виготовлення
    private int horsePower;

    // Конструктор з трьома аргументами
    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    // Гетери та сетери
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    // Реалізація методу compareTo() з інтерфейсу Comparable
    @Override
    public int compareTo(Object obj) {
        if (obj == null) {
            return 1;
        }

        if (!(obj instanceof Car)) {
            throw new ClassCastException("Об'єкт не є екземпляром класу Car");
        }

        Car otherCar = (Car) obj;

        // 1. Менша ціна = краще (раніше в масиві)
        if (this.price != otherCar.price) {
            return (this.price < otherCar.price) ? -1 : 1;
        }

        // 2. Менший рік (старіший) = ГІРШЕ (пізніше в масиві), більший рік (новіший) = КРАЩЕ (раніше в масиві)
        if (this.year != otherCar.year) {
            return (this.year > otherCar.year) ? -1 : 1;
        }

        // 3. Більше к.с. = краще (раніше в масиві)
        if (this.horsePower != otherCar.horsePower) {
            return (this.horsePower > otherCar.horsePower) ? -1 : 1;
        }

        return 0;
    }

    // Метод для зручного виведення інформації
    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", year=" + year +
                ", horsePower=" + horsePower +
                '}';
    }
}
