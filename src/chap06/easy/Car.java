package chap06.easy;

public class Car {
    String model;
    int price;

    Car() {
        this.model = "기본 모델";
        this.price = 1000;
    }

    Car(String model, int price) {

        this.model = model;
        this.price = price;
    }
}