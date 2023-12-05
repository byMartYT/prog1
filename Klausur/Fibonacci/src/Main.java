public class Main {
  public static void main(String[] args) {
    for (int i = 0; i <= 25; i++) {
      System.out.println(fibonacci(i));
    }
  }

  public static int fibonacci(int n) {
    int n2 = 1;
    int n1 = 0;
    if(n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }
    for (int i = 1; i <= n; i++) {
      int speicher = n2;
      n2 = n1;
      n1 = n2 + speicher;
    }
    return n1;
  }
}