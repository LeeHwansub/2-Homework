package chap09.Easy;

public class Application02 {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] =  new Circle(5.0);
        shapes[1] =  new Rectangle(10.0,20.0);

        for ( Shape shape : shapes){
            System.out.println("면적 : " + shape.carculateArea());
        }
    }
}
