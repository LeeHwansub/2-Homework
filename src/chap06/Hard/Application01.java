package chap06.Hard;

public class Application01 {

    public static void main(String[] args) {

        Book book = new Book("자바의정석","남궁성",30000);

        System.out.println("제목 : " + book.getTitle());
        System.out.println("저자 : " + book.getAuthor());
        System.out.println("가격 : " + book.getPrice());
    }
}
