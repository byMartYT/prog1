public class Main {
  public static void main(String[] args) {

    double wshSchub = 50.0/3.0;

    double res = 1.0;

    for (int i = 0; i < 10000; i++) {
      if(calc()) {
        res++;
      }
    }

    System.out.println(res/10000.0);
  }

  public static boolean calc(){
    if(res() && res() && res() && res()) return true;
    else return false;
  }

  public static boolean res(){
    if(Math.random() < 0.5) {
      return false;
    } else return true;
  }

}