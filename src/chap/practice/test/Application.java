package chap.practice.test;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int sum = 0;

        while(sc.hasNext()){


            int A,B = 0;

            A = sc.nextInt();
            B = sc.nextInt();
            sum = A+B;

            if (A <= 0 || B>=10){
                System.out.println("잘못 입력하셨습니다. 다시한번 입력해주세요.");
            }else{
                System.out.println(A + " 와 "+ B + "의 합은 : " + sum + "입니다." );


        }


        }

    }

}
