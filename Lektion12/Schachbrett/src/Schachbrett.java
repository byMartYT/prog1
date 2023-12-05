public class Schachbrett {
  boolean[][] brett = new boolean[8][8];

  public void setzeTurm(int x, int y) {
    for (int i = 0; i < brett.length; i++) {
      brett[x][i] = true;
    }
    for (int i = 0; i < brett.length; i++) {
      brett[i][y] = true;
    }
  }

  @Override
  public String toString() {
    String res = "";
    for (int i = 0; i < brett.length; i++) {
      for (int j = 0; j < brett.length; j++) {
        res += String.format("%s ",brett[i][j] ? "x" : "o");
      }
      res += String.format("\n");
    }
    return res;
  }

}
