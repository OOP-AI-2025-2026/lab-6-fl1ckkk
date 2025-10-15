package org.example;

public class Point implements Movable {
    private double x;
    private double y;

    // Конструктор за замовчуванням
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Конструктор з параметрами
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Реалізація методів інтерфейсу Movable
    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Додатковий метод для виведення інформації про точку
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
