package Week_2.Collections.StudentGrades;



public class StudentGradesTest {
    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();
        
        Student student1 = new Student(1, "Alice", 'A');
        Student student2 = new Student(2, "Bob", 'B');
        Student student3 = new Student(3, "Charlie", 'C');
        
        grades.addStudent(student1);
        grades.addStudent(student2);
        grades.addStudent(student3);
        
        System.out.println("Students in the system:");
        grades.displayStudents();
        
        grades.updateStudentGrade(2, 'A');
        
        System.out.println("Students in the system after updating a grade:");
        grades.displayStudents();
        
        grades.removeStudent(1);
        
        System.out.println("Students in the system after removing a student:");
        grades.displayStudents();
    }
}
