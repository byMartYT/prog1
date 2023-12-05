public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public static double[] getMax(double[][] matrix) {
    double[] res = new double[matrix.length];
    for(int i = 0; i < matrix.length; i++) {
      res[i] = matrix[i][0] > matrix[i][1] ? matrix[i][0] : matrix[i][1];
    }
    return res;
  }
}