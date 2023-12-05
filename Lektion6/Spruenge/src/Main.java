import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Distanz:");
    int dist = sc.nextInt();
    System.out.println("Sprung 1:");
    int j1 = sc.nextInt();
    System.out.println("Sprung 2:");
    int j2 = sc.nextInt();

    System.out.println(springeInMehrerenSpruengen(dist, j1, j2) + " Möglichkeiten");

  }

  public static int springeInMehrerenSpruengen(int dist, int j1, int j2) {
    int i = 0;
    if (dist == 0) return 1;
    if (dist < j1 && dist < j2) return 0;
    if (dist >= j1) {
      int res = springeInMehrerenSpruengen(dist - j1, j1, j2);
      if (res != 0) i += res;
    }
    if (dist >= j2) {
      int res = springeInMehrerenSpruengen(dist - j2, j1, j2);
      if (res != 0) i += res;
    }
    return i;
  }
}