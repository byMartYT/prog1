public class Main {
  public static void main(String[] args) {

    int[] numbers = {0, 0, 0, 0, 0, 0};
    for (int i = 0; i < 6; i++) {
      boolean exists = false;
      int number;
      do {
        number = getNumber();
        for (int n : numbers) {
          if (n == number) {
            exists = true;
            break;
          }
        }
      } while (exists);
      numbers[i] = number;
    }

    numbers = minsort(numbers);

    for(int n : numbers) {
      System.out.print(n + " ");
    }

  }

  public static int getNumber() {
    return (int) Math.round(Math.random() * 49.0);
  }

  public static int[] minsort(int[] arr) {
    int x;
    int y;
    for (int i = 1; i < arr.length; i++) {
      x = arr[i-1];
      y = arr[i];
      if(!smallerThan(x,y)) {
        arr[i-1] = y;
        arr[i] = x;
        arr = minsort(arr);
      }
    }
    return arr;
  }

  public static boolean smallerThan(int x, int y){
    return x < y;
  }
}