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
    private int _id;
    private String _name;
    private short _age;

    Student(int id, String name, short age) {
      _id = id;
      _name = name;
      _age = age;
    }

    public int getId() {
      return _id;
    }

    public String getName() {
      return _name;
    }

    public short get_age() {
      return _age;
    }

    public void displayInformation() {
      System.out.println(_id + ": " + _name + " (" + _age + " years old)");
    }

    public void addStudent() {
      List<Student> students = new ArrayList<>();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter student's ID:");
      _id = Integer.parseInt(scanner.nextLine());
      System.out.println("Enter student's name:");
      _name = scanner.nextLine();
      System.out.println("Enter student's age:");
      _age = Short.parseShort(scanner.nextLine());
      Student newStudent = new Student(_id, _name, _age);
      students.add(newStudent);
    }
  }
}