order=float(input("Enter the bill amount: "))

def apply_discount(order):
    order=(order*90)/100
    return order


if(order>100):
    order=apply_discount(order)
print(f"The order amount is : ${order:.2f}")