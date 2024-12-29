package chap06.easy;

public class Applicaiton2 {
    public static void main(String[] args) {

        Car car = new Car("스포츠카", 2000);
        System.out.println("모델명: " + car.model);
        System.out.println("가격: " + car.price);
    }
}