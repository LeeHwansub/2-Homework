package chap08.Hard;

public class Applicaiton01 {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0]= new Car();
        vehicles[1]= new Boat();

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }

    }
}
