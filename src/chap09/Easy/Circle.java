package chap09.Easy;

public class Circle extends Shape {

   private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double carculateArea() {
        return(Math.PI * radius * radius);
    }
}
