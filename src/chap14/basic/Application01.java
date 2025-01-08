package chap14.basic;

import java.io.File;
import java.io.IOException;

public class Application01 {

    public static void main(String[] args) {

        File file = new File("example.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("example.txt 파일이 생성되었습니다.");
            } else {
                System.out.println("example.txt 파일이 존재합니다.");
            }
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류가 발생했습니다" + e.getMessage());
            e.fillInStackTrace();
        }
        if (file.exists()) {
            System.out.println("example.txt 파일이 존재합니다.");
        } else {
            System.out.println("example.txt 파일이 존재하지 않습니다.");
        }
    }
}
