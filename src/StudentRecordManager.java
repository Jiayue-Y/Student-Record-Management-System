import java.util.Map;
import java.util.TreeMap;

public class StudentRecordManager {
    private TreeMap<Integer, Student> studentRecords;

    public StudentRecordManager() {
        studentRecords = new TreeMap<>();
    }

    public void addStudent(int id, String name, double gpa) {
        if (studentRecords.containsKey(id))
            System.out.println("Error: Student " + id + " already exists!");
        else studentRecords.put(id, new Student(name, gpa));
    }

    public void deleteStudent(int id) {
        if (!studentRecords.containsKey(id))
            System.out.println("Error: Student " + id + " not found!");
        else studentRecords.remove(id);
    }

    public void updateGpa(int id, double newGpa) {
        Student student = studentRecords.get(id);
        if (student == null)
            System.out.println("Error: Student " + id + " not found!");
        else student.setGpa(newGpa);

    }

    public void displayStudent(int id){
        if (!studentRecords.containsKey(id))
            System.out.println("Error: Student " + id + " not found!");
        else System.out.println("ID: " + id + ", " + studentRecords.get(id));
    }

    public void displayAll() {
        if (studentRecords.isEmpty()) {
            System.out.println("No records to display.");
        }
        else {
            for (Map.Entry<Integer, Student> entry :
                    studentRecords.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", "
                        + entry.getValue());
            }
        }
    }

    // Find students with GPA higher than a specified value
    public void studentsWithGpaHigherThan(double gpa) {
        boolean found = false;
        for (Map.Entry<Integer, Student> entry : studentRecords.entrySet()) {
            if (entry.getValue().getGpa() > gpa) {
                System.out.println("ID: " + entry.getKey() + ", "
                        + entry.getValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found with GPA higher than " + gpa);
        }
    }
}



