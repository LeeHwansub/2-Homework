package chap11;

public class Application02 {

    public static void main(String[] args) {

        Container<Double> con = new Container<>();

        con.add(45.67);

        System.out.println("Double 데이터 : " +con.get());
    }
}
