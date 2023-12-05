import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double[] input;


    System.out.print("Anzahl der einzulesenden Werte: ");
    int anzahl = sc.nextInt();
    input = new double[anzahl];
    for (int i = 0; i < input.length; i++) {
      System.out.printf("%d. Wert:  ",i+1);
      input[i] = sc.nextDouble();
    }
    System.out.println("Kleinster Wert: " + min(input));
    System.out.println("Groesster Wert: " + max(input));
    System.out.println("Arithmetischer Mittelwert: " + avg(input));
    System.out.printf("Standardabweichung: %.2f", standard(input));
  }

  public static double min(double[] input) {
    double small = input[0];
    for (double in : input) {
      small = in < small ? in : small;
    }
    return small;
  }
 public static double max(double[] input) {
    double max = input[0];
    for (double in : input) {
      max = in > max ? in : max;
    }
    return max;
  }

  public static double avg(double[] input) {
    double res = 0.0;
    for (double in : input) {
      res += in;
    }
    return res/input.length;
  }

  public static double standard(double[] input) {
    double avg = avg(input);
    double sum = 0;
    for(double in : input) {
      sum += Math.pow(in-avg, 2);
    }
    double res = sum / input.length;

    return Math.sqrt(res);
  }

}