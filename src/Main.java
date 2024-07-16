import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int id = 0;
    String name = "";
    short age = 0;
  }

  static class Student {
    private int id;
    private String _name;
    private short _age;

    Student(int id, String name, short age) {
      this.id = id;
      _name = name;
      _age = age;
    }

    public int getId() {
      return this.id;
    }

    public String getName() {
      return _name;
    }

    public short get_age() {
      return _age;
    }

    public void displayInformation() {
      System.out.println(this.id + ": " + _name + " (" + _age + " years old)");
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
      _name = scanner.nextLine();
      System.out.println("Enter student's age:");
      _age = Short.parseShort(scanner.nextLine());
      Student newStudent = new Student(this.id, _name, _age);
      students.add(newStudent);
    }
  }
}