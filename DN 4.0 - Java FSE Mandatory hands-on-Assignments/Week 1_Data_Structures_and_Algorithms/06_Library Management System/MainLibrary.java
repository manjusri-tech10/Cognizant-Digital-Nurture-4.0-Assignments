import java.util.Arrays;

public class MainLibrary {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "C", "Dennis"),
            new Book(2, "Java", "James"),
            new Book(3, "Python", "Guido")
        };
        Arrays.sort(books, (a, b) -> a.title.compareTo(b.title));
        BookSearch s = new BookSearch();
        s.linearSearch(books, "Python");
        s.binarySearch(books, "Python");
    }
}
