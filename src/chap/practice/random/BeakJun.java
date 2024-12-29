package chap.practice.random;

import java.util.Scanner;

public class BeakJun {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("첫번째 주사위의 수를 입력하시오 : ");
        int a = sc.nextInt();
        System.out.print("두번째 주사위의 수를 입력하시오 : ");
        int b = sc.nextInt();
        System.out.print("세번째 주사위의 수를 입력하시오 : ");
        int c = sc.nextInt();

        if (a <= 0 || a > 6) {
            System.out.println("1~6 의 숫자가 아닙니다. 다시 입력해주세요.");
        } else if (b <= 0 || b > 6) {
            System.out.println("1~6 의 숫자가 아닙니다. 다시 입력해주세요.");
        } else if (c <= 0 || c > 6) {
            System.out.println("1~6 의 숫자가 아닙니다. 다시 입력해주세요.");
        } else if (a == b && b == c) {
            System.out.println("상금은 " + (10000 + a * 1000) + "원 입니다."
            );

        } else if (a == b || b == c || a == c) {
            System.out.println("상금은 " + (1000 + b * 100) + "원 입니다.");
        } else {
            System.out.println("상금은 " + ((Math.max(a,Math.max(b,c)))*100) + "원 입니다.");

        }


    }
}






