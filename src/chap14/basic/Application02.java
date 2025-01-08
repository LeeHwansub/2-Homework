package chap14.basic;

import java.io.FileInputStream;
import java.io.IOException;

public class Application02 {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("example.txt")) {

            int data;

            System.out.print("파일 내용: ");

            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류가 발생했습니다: " + e.getMessage());
        }

    }

}