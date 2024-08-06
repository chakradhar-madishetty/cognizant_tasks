package Week_2.File_IO.ContactManagementSystem;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ContactWriter {
    public void saveContact(String fileName, Contact contact) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(contact);
            System.out.println("Contact saved to " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving contact: " + e.getMessage());
        }
    }
}
