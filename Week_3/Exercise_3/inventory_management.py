inventory = [('item1', 10), ('item2', 0), ('item3', 5)]
def check_inventory(inventory):
    for item, quantity in inventory:
        if quantity == 0:
            print(f"{item} is out of stock!")
        else:
            print(f"{item} is in stock with {quantity} units.")
check_inventory(inventory)
