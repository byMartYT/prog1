import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Eingabe:");
    double x = sc.nextDouble();

    System.out.println(sin(x));
    System.out.println(Math.sin(5));


  }

  public static double sin(double x) {
    double z = x;
    double n = 1.0;
    double sum = 1.0;
    double res = x;

    for (int i = 3; sum > 1E-15 || sum < -1E-15; i+=2) {
      z *= x * x * (-1);
      n *= i * (i-1);

      sum = z/n;
      res += sum;
    }
    return res;
  }
}