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
    private String name;
    private short age;

    Student(int id, String name, short age) {
      this.id = id;
      this.name = name;
      this.age = age;
    }

    public int getId() {
      return id;
    }

    public void displayInformation() {
      System.out.println(this.id + ": " + this.name + " (" + this.age + " years old)");
    }

    public void addStudent() {
      List<Student> students = new ArrayList<>();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter student's ID:");
      id = Integer.parseInt(scanner.nextLine());
      System.out.println("Enter student's name:");
      name = scanner.nextLine();
      System.out.println("Enter student's age:");
      age = Short.parseShort(scanner.nextLine());
      Student newStudent = new Student(id, name, age);
      students.add(newStudent);
    }
  }
}