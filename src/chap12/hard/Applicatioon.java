package chap12.hard;

import java.util.Scanner;

public class Applicatioon {

    public static void main(String[] args) {

        BookController controller = new BookController();

        Scanner sc = new Scanner(System.in);

        System.out.println("도서관리 프로그램을 시작합니다.");
        System.out.println("번호를 선택해주세요.");
        System.out.println("1. 도서 추가");
        System.out.println("2. 도서 조회");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("9. 종료");

        System.out.print("번호 입력 : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("제목: ");
                String title = sc.nextLine();
                System.out.print("저자: ");
                String author = sc.nextLine();
                System.out.print("ISBN: ");
                int isbn = sc.nextInt();
                System.out.print("해외 서적 여부(true/false) : ");
                boolean isForeignBook = sc.nextBoolean();
                controller.addBook(title, author, isbn, isForeignBook);
                break;
        }
    }
}
