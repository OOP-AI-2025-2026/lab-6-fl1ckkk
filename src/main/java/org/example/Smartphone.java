package org.example;

public class Smartphone implements GPS, Cellular {
    private String model;
    private String phoneNumber;
    private double latitude;
    private double longitude;
    private boolean isOnCall;

    // Конструктор
    public Smartphone(String model, String phoneNumber) {
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.latitude = 0.0;
        this.longitude = 0.0;
        this.isOnCall = false;
    }

    // Реалізація методів інтерфейсу GPS
    @Override
    public double[] getCoordinates() {
        return new double[]{latitude, longitude};
    }

    // Метод для встановлення координат
    public void setCoordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Реалізація методів інтерфейсу Cellular
    @Override
    public void makeCall() {
        if (!isOnCall) {
            isOnCall = true;
            System.out.println(model + " здійснює дзвінок...");
        } else {
            System.out.println(model + " вже здійснює дзвінок!");
        }
    }

    @Override
    public void receiveCall() {
        if (!isOnCall) {
            isOnCall = true;
            System.out.println(model + " приймає вхідний дзвінок...");
        } else {
            System.out.println(model + " зайнятий, не може прийняти дзвінок!");
        }
    }

    // Метод для завершення дзвінка
    public void endCall() {
        if (isOnCall) {
            isOnCall = false;
            System.out.println("Дзвінок завершено.");
        } else {
            System.out.println("Немає активного дзвінка.");
        }
    }

    // Геттери та сеттери
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isOnCall() {
        return isOnCall;
    }

    // Метод для виведення інформації про смартфон
    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", coordinates=[" + latitude + ", " + longitude + "]" +
                ", isOnCall=" + isOnCall +
                '}';
    }
}
