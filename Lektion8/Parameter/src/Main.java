public class Main {
  public static void main(String[] args) throws Exception {
    if(args.length != 2){
      throw new Exception("Bitte 2 Parameter mitgeben!");
    }
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    System.out.println(x * y);
  }
}