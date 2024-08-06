package Week_2.Collections.BookCollection;


import java.util.LinkedHashSet;

public class BookCollection {
    private LinkedHashSet<String> books;

    public BookCollection() {
        books = new LinkedHashSet<>();
    }

    public boolean addBook(String bookTitle) {
        return books.add(bookTitle);
    }

    public boolean removeBook(String bookTitle) {
        return books.remove(bookTitle);
    }

    public void displayBooks() {
        for (String book : books) {
            System.out.println(book);
        }
    }
}

