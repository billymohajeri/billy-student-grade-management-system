import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int id = 0;
    String name = "";
    short age = 0;
    Student student = new Student(id, name, age);
    student.addStudent();
    student.displayInformation();
  }

  static class Student {
    private int id;
    private String name;
    private short age;

    Student(int id, String name, short age) {
      this.id = id;
      this.name = name;
      this.age = age;
    }

    public int getId() {
      return this.id;
    }

    public String getName() {
      return name;
    }

    public short geAge() {
      return age;
    }

    public void displayInformation() {
      System.out.println(this.id + ": " + name + " (" + age + " years old)");
    }

    public void addGrades() {
      System.out.println("Student ID: ");
      System.out.println("Course name: ");
    }


    public void addStudent() {
      List<Student> students = new ArrayList<>();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter student's ID:");
      this.id = Integer.parseInt(scanner.nextLine());
      System.out.println("Enter student's name:");
      name = scanner.nextLine();
      System.out.println("Enter student's age:");
      age = Short.parseShort(scanner.nextLine());
      Student newStudent = new Student(this.id, name, age);
      students.add(newStudent);
    }

  }

}