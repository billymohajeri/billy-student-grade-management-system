import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int id = 0;
    String name = "";
    short age = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter student's ID:");
    id = Integer.parseInt(scanner.nextLine());
    Student firstStudent = new Student(id, "Billy", (short) 15);
    firstStudent.displayInformation();


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

    public void displayInformation() {
      System.out.println(this.id + ": " + this.name + " (" + this.age + " years old)");
    }


  }


}