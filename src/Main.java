public class Main {
  public static void main(String[] args) {

    Student firstStudent = new Student(1, "Billy", (short) 15);
    firstStudent.displayInformation();
//    System.out.println(firstStudent.id + ": " + firstStudent.name + " (" + firstStudent.age + " years old)");
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