import pickle
import os

TEXT_FILE = "contacts.txt"
BINARY_FILE = "contacts.bin"

def read_contacts_text():
    try:
        with open(TEXT_FILE, "r") as file:
            return [line.strip() for line in file]
    except FileNotFoundError:
        return []

def write_contacts_text(contacts):
    with open(TEXT_FILE, "w") as file:
        for contact in contacts:
            file.write(f"{contact}\n")

def read_contacts_binary():
    try:
        with open(BINARY_FILE, "rb") as file:
            return pickle.load(file)
    except (FileNotFoundError, pickle.UnpicklingError):
        return []

def write_contacts_binary(contacts):
    with open(BINARY_FILE, "wb") as file:
        pickle.dump(contacts, file)

def add_contact(contacts):
    name = input("Enter contact name: ")
    phone = input("Enter contact phone number: ")
    contact = f"{name}: {phone}"
    contacts.append(contact)
    print("Contact added successfully.")

def remove_contact(contacts):
    name = input("Enter the name of the contact to remove: ")
    for contact in contacts:
        if contact.startswith(name + ":"):
            contacts.remove(contact)
            print("Contact removed successfully.")
            return
    print("Contact not found.")

def display_contacts(contacts):
    if not contacts:
        print("No contacts found.")
    else:
        for contact in contacts:
            print(contact)

def main():
    contacts = []
    
    while True:
        print("\nContact Management System")
        print("1. Add contact")
        print("2. Remove contact")
        print("3. Display contacts")
        print("4. Save and exit")
        
        choice = input("Enter your choice (1-4): ")
        
        if choice == "1":
            add_contact(contacts)
        elif choice == "2":
            remove_contact(contacts)
        elif choice == "3":
            display_contacts(contacts)
        elif choice == "4":
            try:
                write_contacts_text(contacts)
                write_contacts_binary(contacts)
                print("Contacts saved successfully.")
                break
            except Exception as e:
                print(f"Error saving contacts: {e}")
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    try:
        contacts = read_contacts_text()
        if not contacts:
            contacts = read_contacts_binary()
        main()
    except Exception as e:
        print(f"An unexpected error occurred: {e}")