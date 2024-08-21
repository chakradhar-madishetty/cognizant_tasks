#1.Lists
product_names = []

def add_product(name):
    product_names.append(name)

def remove_product(name):
    if name in product_names:
        product_names.remove(name)

def update_product(old_name, new_name):
    if old_name in product_names:
        index = product_names.index(old_name)
        product_names[index] = new_name

#2.Dictionaries
product_details = {}

def add_product_detail(name, quantity, price):
    product_details[name] = {"quantity": quantity, "price": price}

def update_product_detail(name, quantity=None, price=None):
    if name in product_details:
        if quantity:
            product_details[name]["quantity"] = quantity
        if price:
            product_details[name]["price"] = price

def delete_product_detail(name):
    if name in product_details:
        del product_details[name]

#3.Tuples
product_catalog = []

def add_product_to_catalog(name, description, price):
    product_catalog.append((name, description, price))

def print_product_catalog():
    for product in product_catalog:
        print(f"Name: {product[0]}, Description: {product[1]}, Price: {product[2]}")

#4.Sets
product_categories = set()

def add_category(category):
    product_categories.add(category)

def remove_category(category):
    if category in product_categories:
        product_categories.remove(category)

#5.CombiningCollections
def generate_report():
    sorted_products = sorted(product_details.items(), key=lambda x: x[1]["price"])
    for name, details in sorted_products:
        print(f"Name: {name}, Quantity: {details['quantity']}, Price: {details['price']}")

def find_products_in_price_range(min_price, max_price):
    products_in_range = set()
    for name, details in product_details.items():
        if min_price <= details["price"] <= max_price:
            products_in_range.add(name)
    return products_in_range

while True:
    print("1. Add product name")
    print("2. Remove product name")
    print("3. Update product name")
    print("4. Add product detail")
    print("5. Update product detail")
    print("6. Delete product detail")
    print("7. Add product to catalog")
    print("8. Print product catalog")
    print("9. Add category")
    print("10. Remove category")
    print("11. Generate report")
    print("12. Find products in price range")
    print("13. Exit")

    choice = int(input("Enter your choice: "))

    if choice == 1:
        name = input("Enter product name: ")
        add_product(name)
    elif choice == 2:
        name = input("Enter product name: ")
        remove_product(name)
    elif choice == 3:
        old_name = input("Enter old product name: ")
        new_name = input("Enter new product name: ")
        update_product(old_name, new_name)
    elif choice == 4:
        name = input("Enter product name: ")
        quantity = int(input("Enter quantity: "))
        price = float(input("Enter price: "))
        add_product_detail(name, quantity, price)
    elif choice == 5:
        name = input("Enter product name: ")
        quantity = int(input("Enter new quantity: "))
        price = float(input("Enter new price: "))
        update_product_detail(name, quantity, price)
    elif choice == 6:
        name = input("Enter product name: ")
        delete_product_detail(name)
    elif choice == 7:
        name = input("Enter product name: ")
        description = input("Enter product description: ")
        price = float(input("Enter product price: "))
        add_product_to_catalog(name, description, price)
    elif choice == 8:
        print_product_catalog()
    elif choice == 9:
        category = input("Enter category: ")
        add_category(category)
    elif choice == 10:
        category = input("Enter category: ")
        remove_category(category)
    elif choice == 11:
        generate_report()
    elif choice == 12:
        min_price = float(input("Enter minimum price: "))
        max_price = float(input("Enter maximum price: "))
        products_in_range = find_products_in_price_range(min_price, max_price)
        print("Products in price range:")
        for product in products_in_range:
            print(product)
    elif choice == 13:
        break
    else:
        print("Invalid choice. Please try again.")