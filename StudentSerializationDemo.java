import java.io.*;

public class StudentSerializationDemo {
    public static void main(String[] args) {
        Student student = new Student(101, "John Doe", 3.8);
        String filename = "student.ser";

        // Serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(student);
            System.out.println("Student details saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        System.out.println("\nReading from file...");
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Student readStudent = (Student) in.readObject();
            readStudent.displayDetails();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
