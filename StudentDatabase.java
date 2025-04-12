import java.util.*;

class Student {
    int roll;
    String name;
    String course;

    Student(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Roll : " + roll + ", Name : " + name + ", Course : " + course;
    }
}

public class StudentDatabase {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String... args) {
        int choice;

        while (true) {
            System.out.println("\n********** Student Database *************");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student By Roll No.");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: 
                    System.out.println("Exiting..."); 
                    return;
                default: 
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        students.add(new Student(roll, name, course));
        System.out.println("Student added.");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("Database is empty.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    static void searchStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.roll == roll) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("No record found.");
    }

    static void updateStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.roll == roll) {
                sc.nextLine(); // clear buffer
                System.out.print("Enter New Name: ");
                s.name = sc.nextLine();
                System.out.print("Enter New Course: ");
                s.course = sc.nextLine();
                System.out.println("Student updated.");
                return;
            }
        }
        System.out.println("No record found.");
    }

    static void deleteStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.roll == roll) {
                it.remove();
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
