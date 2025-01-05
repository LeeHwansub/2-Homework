package chap12.hard;

import java.util.ArrayList;

public class BookController {
    private  Library library;
    private  BookView view;

    public BookController() {
    library = new Library();
    view = new BookView();
    }

    public void addBook(String title, String autor, int isbn, boolean isForeignBook) {

        Book book = new Book(title, autor, isbn, isForeignBook);

        library.addBook(book);
        view.displayMessage("도서가 추가 되었습니다.");

    }
    public void getBook() {

    }
    public void updateBook() {

    }
    public void deletBook() {

    }

}
