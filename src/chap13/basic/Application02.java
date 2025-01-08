package chap13.basic;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("인덱스 번호를 입력하세요 : ");
        int index = sc.nextInt();
        int a[] = new int [5];
        a[0] = 1;
        a[1] = 10;
        a[2] = 100;
        a[3] = 1000;
        a[4] = 10000;
        try {
     System.out.print("배열의 요소 : " + a[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스의 배열의 범위를 벗어났습니다.");
            e.getStackTrace();
        }
    }
}
