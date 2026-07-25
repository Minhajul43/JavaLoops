import java.util.Scanner;
public class PrintSum {
  public static void main(String[] args) {
    int x, y, sum = 0;
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    y = sc.nextInt();
    System.out.println("Enter the value of x and y: ");
    //System.out.println(x + " " + y);

    while (x < 10) {
      y = x - 3;
      y = 40;
      while (y > 22) {
        if ((sum > 30) && (sum < 40)) {
          sum = sum + x * 2;
        } else if ((sum > 40) && (sum < 50)) {
          sum = sum + x * 3;
        } else {
          sum = sum + 23;
        }
        System.out.println(sum);
        y = y - 10;
      }
      x += 2;
    }

  }
}
