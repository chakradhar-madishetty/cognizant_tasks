package Week_2.File_IO.ContactManagementSystem;

public class ContactApp {
    public static void main(String[] args) {
        ContactWriter contactWriter = new ContactWriter();
        ContactReader contactReader = new ContactReader();
        
        String fileName = "contact.ser";
        
        Contact contact = new Contact("John Doe", "123-456-7890", "john.doe@example.com");
        
        contactWriter.saveContact(fileName, contact);
        
        System.out.println("Reading contact from the file:");
        Contact readContact = contactReader.readContact(fileName);
        if (readContact != null) {
            System.out.println(readContact);
        }
        
        System.out.println("Attempting to read from a non-existent file:");
        contactReader.readContact("non_existent_file.ser");
        
        System.out.println("Attempting to read an object of a different class:");
        contactReader.readContact("different_class_object.ser"); 
    }
}

