// BookCollectionTest.java
package BookCollection;

public class BookCollectionTest {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        
        // Add books
        collection.addBook("The Great Gatsby");
        collection.addBook("Moby Dick");
        collection.addBook("To Kill a Mockingbird");
        
        // Remove a book
        collection.removeBook("Moby Dick");
        
        // Display all books
        System.out.println("Current books in the collection:");
        collection.displayBooks();
    }
}
