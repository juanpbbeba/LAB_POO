import java.util.List;

public class BookIterator implements Iterator {
    private List<Book> books;
    private int position = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return books.get(position++);
        }
        return null;
    }
}
