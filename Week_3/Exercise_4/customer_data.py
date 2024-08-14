customer_data = {'Alice': 120, 'Bob': 75, 'Charlie': 90}
def update_purchase(customer_data, name, amount):
    if name in customer_data:
        customer_data[name] = amount
        print(f"Updated {name}'s purchase amount to {amount}.")
    else:
        print(f"Customer {name} not found.")
update_purchase(customer_data, 'Bob', 100)
print("Updated customer data:", customer_data)
