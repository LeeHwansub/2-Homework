package chap04.nomal;

import java.util.Scanner;

public class Application04 {

    public static void main(String[] args) {

        System.out.print("정수를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String result = "";

        for (int b=1;b<= a; b++){


        if( b % 2 == 1){
            result += "수";
        }else{
            result += "박";


        }

        }
        System.out.println(result);

        sc.close();
    }
}
