def calculate(time,rate):
    total_amount=time*rate
    return total_amount
time=float(input("Enter the number of hours worked:"))
rate=float(input("Enter the hourly rate in $:"))
total_amount=calculate(time,rate)
print(f"The total amount to be paid=${total_amount:.2f}")