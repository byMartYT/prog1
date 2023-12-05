public class Main {
  private static boolean[][][] field = new boolean[3][3][3];

  public static void main(String[] args) {
    generate();
    print();
  }

  public static void generate() {
    for (boolean[][] one : field) {
      for (boolean[] two : one) {
        for (int i = 0; i < two.length; i++) {
          two[i] = random();
        }
      }
    }
  }

  public static void print() {
    for (boolean[][] one : field) {
      for (boolean[] two : one) {
        for (boolean three : two) {
          System.out.print((three ? "X" : "O") + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }

  public static boolean random() {
    int rnd = (int) Math.round(Math.random());
    return rnd == 1;
  }

}
