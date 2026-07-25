import java.util.Scanner;
public class Student {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello, welcome to the Student class!");
    System.out.print("Enter your name:");
    String name = sc.nextLine();
    System.out.print("Enter your ID:");
    int id = sc.nextInt();
    System.out.println("Student Information:");
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
  }
}
