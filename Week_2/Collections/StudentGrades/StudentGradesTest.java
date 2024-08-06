// StudentGradesTest.java
package StudentGrades;

public class StudentGradesTest {
    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();
        
        // Add students
        Student student1 = new Student(1, "Alice", 'A');
        Student student2 = new Student(2, "Bob", 'B');
        Student student3 = new Student(3, "Charlie", 'C');
        
        grades.addStudent(student1);
        grades.addStudent(student2);
        grades.addStudent(student3);
        
        // Display students
        System.out.println("Students in the system:");
        grades.displayStudents();
        
        // Update student grade
        grades.updateStudentGrade(2, 'A');
        
        // Display students after update
        System.out.println("Students in the system after updating a grade:");
        grades.displayStudents();
        
        // Remove a student
        grades.removeStudent(1);
        
        // Display students after removal
        System.out.println("Students in the system after removing a student:");
        grades.displayStudents();
    }
}
