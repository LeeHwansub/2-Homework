package chap06.nomal;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = new Account("123-456");
        account.a(5000);


        System.out.println("계좌번호 : " + account.getAccountNumber());
        System.out.println("잔액 : " +account.getBalance());



    }
}
