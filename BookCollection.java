import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Aggregate {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
