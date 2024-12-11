public class Main {
    public static void main(String[] args) {
        StudentRecordManager test = new StudentRecordManager();

        // Adding students
        test.addStudent(1, "A", 3.5);
        test.addStudent(2, "B", 2.8);
        test.addStudent(3, "C", 3.9);
        test.addStudent(4, "D", 3.2);
        test.addStudent(5, "E", 4.0);

        System.out.println("All Records added:");
        test.displayAll();

        System.out.println("\nTest adding a student with an existing ID: ");
        test.addStudent(1, "A", 3.5);

        // Update GPA for a student
        System.out.println("\nUpdating GPA for Student 2...");
        test.updateGpa(2, 3.3);
        System.out.println("Updated Student 2: ");
        test.displayStudent(2);
        System.out.println("\nTest updating a student not in the record: ");
        test.updateGpa(7, 3.3);

        // Delete a student record
        System.out.println("\nDeleting Student 4... ");
        test.deleteStudent(4);
        System.out.println("Test deleting a student not in the record: ");
        test.deleteStudent(4);

        System.out.println("\nStudents with GPA higher than 3.0:");
        test.studentsWithGpaHigherThan(3.0);

        System.out.println("\nStudents with GPA higher than 4.0:");
        test.studentsWithGpaHigherThan(4.0);
    }
}
