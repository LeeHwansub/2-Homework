package chap04.nomal;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        System.out.print("체중을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        System.out.print("당신의 키를 입력하세요 :");
        int cm = sc.nextInt();

        double bmi = kg/(cm*cm);
        if (bmi < 20){
            System.out.println("당신은 저 체중입니다.");

        } else if ((bmi >= 20) && (bmi < 25)){
            System.out.println("당신은 정상 체중입니다.");
        }else {
            System.out.println("당신은 과 체중입니다.");
        }


    }
}
