package chap04.basic;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        System.out.print("정수를 하나 입력하시오 : ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 == 0){
            System.out.println("짝수다");
        }else{
            System.out.println("홀수다");
        }
    }
}
