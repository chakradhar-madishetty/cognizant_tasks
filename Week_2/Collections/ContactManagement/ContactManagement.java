package Week_2.Collections.ContactManagement;

import java.util.Hashtable;

public class ContactManagement {
    private Hashtable<Integer, Contact> contactTable;

    public ContactManagement() {
        contactTable = new Hashtable<>();
    }

    public void addContact(Contact contact) {
        contactTable.put(contact.getId(), contact);
    }

    public boolean removeContact(int contactId) {
        return contactTable.remove(contactId) != null;
    }

    public void displayContacts() {
        for (Contact contact : contactTable.values()) {
            System.out.println(contact);
        }
    }
}
