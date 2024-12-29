package chap04.basic;

import java.util.Scanner;

public class Application05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int number = sc.nextInt();

        int sum =0;
        for (int i = 1;i<=number;i++){
            if (number % 2 ==0){
                sum += i;
            }else{
                sum += i-1;
            }
        }
        System.out.println("1부터 "+ number + "까지의 짝수의 합은 : " + sum + "입니다.");

        sc.close();

    }

}
