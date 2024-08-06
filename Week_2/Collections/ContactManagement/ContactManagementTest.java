package Week_2.Collections.ContactManagement;

public class ContactManagementTest {
    public static void main(String[] args) {
        ContactManagement management = new ContactManagement();
        
        Contact contact1 = new Contact(1, "Alice", "123-456-7890");
        Contact contact2 = new Contact(2, "Bob", "234-567-8901");
        Contact contact3 = new Contact(3, "Charlie", "345-678-9012");
        
        management.addContact(contact1);
        management.addContact(contact2);
        management.addContact(contact3);
        
        System.out.println("Contacts in the system:");
        management.displayContacts();
        
        management.removeContact(2);
        
        System.out.println("Contacts in the system after removing a contact:");
        management.displayContacts();
    }
}