import threading
import time
import json

class Inventory:
    def __init__(self):
        self.items = {}

    def add_item(self, item, quantity):
        if item in self.items:
            self.items[item] += quantity
        else:
            self.items[item] = quantity

    def remove_item(self, item, quantity):
        if item in self.items:
            if self.items[item] >= quantity:
                self.items[item] -= quantity
            else:
                print(f"Not enough {item} in stock")
        else:
            print(f"{item} not found in inventory")

    def check_stock(self, item):
        if item in self.items:
            return self.items[item]
        else:
            return 0

    def save_to_file(self, filename):
        try:
            with open(filename, 'w') as f:
                json.dump(self.items, f)
        except IOError as e:
            print(f"Error saving to file: {e}")

    def load_from_file(self, filename):
        try:
            with open(filename, 'r') as f:
                self.items = json.load(f)
        except IOError as e:
            print(f"Error loading from file: {e}")

    def check_low_stock(self):
        low_stock_threshold = 10
        for item, quantity in self.items.items():
            if quantity <= low_stock_threshold:
                print(f"Low stock alert: {item} - {quantity} remaining")

def periodic_check_low_stock(inventory, interval):
    while True:
        inventory.check_low_stock()
        time.sleep(interval)

def main():
    # Create an inventory instance
    inventory = Inventory()

    while True:
        print("\nInventory Management Menu:")
        print("1. Add item")
        print("2. Remove item")
        print("3. Check stock")
        print("4. Save to file")
        print("5. Load from file")
        print("6. Exit")

        choice = input("Enter your choice: ")

        if choice == "1":
            item = input("Enter item name: ")
            quantity = int(input("Enter quantity: "))
            inventory.add_item(item, quantity)
        elif choice == "2":
            item = input("Enter item name: ")
            quantity = int(input("Enter quantity: "))
            inventory.remove_item(item, quantity)
        elif choice == "3":
            item = input("Enter item name: ")
            print(f"Stock level: {inventory.check_stock(item)}")
        elif choice == "4":
            filename = input("Enter filename: ")
            inventory.save_to_file(filename)
        elif choice == "5":
            filename = input("Enter filename: ")
            inventory.load_from_file(filename)
            print("Inventory loaded:")
            print(inventory.items)
        elif choice == "6":
            break
        else:
            print("Invalid choice. Please try again.")
    interval = 60
    threading.Thread(target=periodic_check_low_stock, args=(inventory, interval)).start()

if __name__ == "__main__":
    main()