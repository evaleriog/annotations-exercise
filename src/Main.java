import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Sandi", "Metz");

        author.addBook("Practical Object-Oriented Design in Ruby");
        author.addBook("99 Bottles of OOP");

        ArrayList<String> allBooks = author.publishedBooks();
        for (String book: allBooks) {
            System.out.println(book);
        }
    }
}
