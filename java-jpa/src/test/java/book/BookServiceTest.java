package book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    private BookService bookService = new BookService();

    @Test
    public void add(){
        Book book = new Book();
        book.setTitle("해리포터222");
        book.setAuthor("조앤롤링");
        bookService.add(book);
    }

}