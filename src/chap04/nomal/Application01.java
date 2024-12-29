package chap04.nomal;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하시오 : ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            if (number <= 10 && number > 0) {
                System.out.println("짝수입니다.");
            }
        } else if (number % 2 == 1) {
            if (number <= 10 && number > 0) {
                System.out.println("홀수입니다.");
            }
        } else {
            System.out.println("1~10사이의 정수를 입력해야합니다.");



        }
        sc.close();
    }
}


