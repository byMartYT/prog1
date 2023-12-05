import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Basis:");
    double base = sc.nextDouble();
    System.out.println("Potenz:");
    int pot = sc.nextInt();

    double res = 1;

    if (pot >= 0) {
      for (int i = 0; i <= pot; i++) {
        res *= base;
      }
      res /= base;
    } else {
      for (int i = 0; i > pot; i--) {
        res *= base;
      }
      res = 1/res;
    }

    System.out.println(res);

  }
}