package chap11;

public class Application01 {

    public static void main(String[] args) {

        Box<String> box1 = new Box<>();
        box1.setData("Hello, Generics!");
        Box<Integer> box2 = new Box<>();
        box2.setData(123);

        System.out.println("문자열 데이터 : " +box1);
        System.out.println("정수 데이터 : " +box2);
    }
}
