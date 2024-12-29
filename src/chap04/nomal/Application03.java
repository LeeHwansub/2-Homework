package chap04.nomal;

import java.util.Scanner;

public class Application03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");

        String a = sc.next();

        for (int b= 0; b<a.length();b++){

            System.out.println(b + " : " + a.charAt(b));
        }
    }
}
