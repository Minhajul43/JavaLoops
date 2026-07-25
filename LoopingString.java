import java.util.Scanner;

public class LoopingString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String test = "";
    int i, j, k;
    System.out.print("Enter the value of i=0,j=0 and k=15:");
    i = sc.nextInt();
    j = sc.nextInt();
    k = sc.nextInt();
    while (i < 5) {
      test = "-->";
      j = --k;
      while (j > 10) {
        test = i + j + test + i + j;
        System.out.println(test);
        j--;
      }
      i++;
    }

  }
}