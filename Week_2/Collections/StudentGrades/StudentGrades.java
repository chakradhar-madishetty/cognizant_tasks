package Week_2.Collections.StudentGrades;


import java.util.LinkedHashMap;
import java.util.Map;

public class StudentGrades {
    private LinkedHashMap<Integer, Student> studentMap;

    public StudentGrades() {
        studentMap = new LinkedHashMap<>();
    }

    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }

    public boolean removeStudent(int studentId) {
        return studentMap.remove(studentId) != null;
    }

    public boolean updateStudentGrade(int studentId, char newGrade) {
        Student student = studentMap.get(studentId);
        if (student != null) {
            student.setGrade(newGrade);
            return true;
        }
        return false;
    }

    public void displayStudents() {
        for (Student student : studentMap.values()) {
            System.out.println(student);
        }
    }
}
