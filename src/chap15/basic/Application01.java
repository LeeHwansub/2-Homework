package chap15.basic;

public class Application01 {

    @FunctionalInterface
    interface Calculator {
        int add(int a, int b);
    }

    public static void main(String[] args) {

        // 방법 1. Lambda 표현식을 사용하여 두 정수의 합 계산
        Calculator calculator1 = (a, b) -> a + b;

        int result1 = calculator1.add(5, 7);
        System.out.println("두 정수의 합: " + result1);

        // 방법 2. 메서드 참조를 사용하여 두 정수의 합 계산 <- 참고용
        Calculator calculator2 = Integer::sum;

        int result2 = calculator2.add(7, 12);
        System.out.println("두 정수의 합: " + result2);
    }

}