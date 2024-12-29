package chap08.Nomal;

public class Application02 {

    public static void main(String[] args) {

        Circle circle = new Circle(3.5);
        System.out.println("원의 넓이는 : " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("사각형의 넓이는 :" + rectangle.calculateArea());

    }
}
