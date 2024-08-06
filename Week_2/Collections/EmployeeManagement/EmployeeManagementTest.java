package Week_2.Collections.EmployeeManagement;


public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();
        
        Employee emp1 = new Employee(1, "Alice", "123 Main St");
        Employee emp2 = new Employee(2, "Bob", "456 Elm St");
        Employee emp3 = new Employee(3, "Charlie", "789 Oak St");
        
        management.addEmployee(emp1);
        management.addEmployee(emp2);
        management.addEmployee(emp3);
        
        System.out.println("Employees after adding:");
        management.displayEmployees();
        
        management.updateEmployee(2, "456 Pine St");
        
        System.out.println("Employees after updating address:");
        management.displayEmployees();
        
        management.removeEmployee(1);
        
        System.out.println("Employees after removing an employee:");
        management.displayEmployees();
    }
}

