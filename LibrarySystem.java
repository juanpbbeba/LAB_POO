public class LibrarySystem {
    public static void main(String[] args) {
        
        BookCollection library = new BookCollection();
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Dio mio", "Harper Lee"));
        library.addBook(new Book("OASIS CORAZÓN", "J.D. Salinger"));

      
        Iterator bookIterator = library.createIterator();
        System.out.println("Lista de libros en la biblioteca:");
        while (bookIterator.hasNext()) {
            Book book = (Book) bookIterator.next();
            System.out.println(book);
        }
    }
}
