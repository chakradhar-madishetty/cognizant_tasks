package Week_2.Collections.BookCollection;


public class BookCollectionTest {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        
        collection.addBook("The Great Gatsby");
        collection.addBook("Moby Dick");
        collection.addBook("To Kill a Mockingbird");
        
        collection.removeBook("Moby Dick");
        
        System.out.println("Current books in the collection:");
        collection.displayBooks();
    }
}
