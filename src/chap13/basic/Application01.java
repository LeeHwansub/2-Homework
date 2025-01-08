package chap13.basic;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.print("첫 번쨰 정수를 입력하세요 : ");
            int a = sc.nextInt();
            System.out.print("두 번쨰 정수를 입력하세요 : ");
            int b = sc.nextInt();
            int div = a / b;
            System.out.println(" 나누기의 결과는 = " + div);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌수 없습니다.");
            e.getStackTrace();
        }finally {
            sc.close();
        }





    }
}
