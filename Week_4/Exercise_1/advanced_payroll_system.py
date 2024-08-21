class Employee:
    def __init__(self, name, hours_worked, hourly_rate):
        self.name = name
        self.hours_worked = hours_worked
        self.hourly_rate = hourly_rate
    def calculate_pay(self):
        regular_pay = self.hours_worked * self.hourly_rate
        overtime_hours = max(0, self.hours_worked - 40)
        overtime_pay = overtime_hours * (self.hourly_rate * 1.5)
        total_pay = regular_pay + overtime_pay
        return total_pay
class Manager(Employee):
    def __init__(self, name, hours_worked, hourly_rate, bonus):
        super().__init__(name, hours_worked, hourly_rate)
        self.bonus = bonus
    def calculate_pay(self):
        total_pay = super().calculate_pay()
        total_pay += self.bonus
        return total_pay
emp_name = input("Enter employee name: ")
emp_hours = float(input("Enter hours worked: "))
emp_rate = float(input("Enter hourly rate: "))
employee = Employee(emp_name, emp_hours, emp_rate)
mgr_name = input("Enter manager name: ")
mgr_hours = float(input("Enter hours worked: "))
mgr_rate = float(input("Enter hourly rate: "))
mgr_bonus = float(input("Enter bonus: "))
manager = Manager(mgr_name, mgr_hours, mgr_rate, mgr_bonus)
print(f"Employee's total pay: ₹{employee.calculate_pay():.2f}")
print(f"Manager's total pay: ₹{manager.calculate_pay():.2f}")