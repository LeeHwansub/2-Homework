package chap04.basic;

import java.util.Scanner;

public class Application04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" 정수를 입력하세요 : ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<= a; i++){
            sum += i;
            System.out.println("1부터 " + a + "까지의 합은 "+ sum + "입니다.");
        }

    }
}
