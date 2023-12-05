public class Main {
  public static void main(String[] args) {

  }

  public static int betrag(int number) {
    return number > 0 ? number : number * (-1);
  }

  public static float betrag(float number) {
    return number > 0f ? number : number * (-1f);
  }

  public static double betrag(double number) {
    return number > 0d ? number : number * (-1d);
  }

  public static short betrag(short number) {
    return number > 0 ? number : (short) (number * (-1));
  }

  public static long betrag(long number) {
    return number > 0 ? number : number * (-1);
  }
}