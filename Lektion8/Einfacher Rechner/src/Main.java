public class Main {
  public static void main(String[] args) throws Exception {
    if(args.length < 3) {
      throw new Exception("Parameter: mind. 2 Zahlen und + oder -!");
    }
    if(!args[args.length-1].equals("+") && !args[args.length-1].equals("-")) {
      System.out.println(args[args.length-1]);
      throw new Exception("Das letzte Zeichen muss ein + oder - sein");
    }
    int res = Integer.parseInt(args[0]);
    switch (args[args.length-1]) {
      case "+":
        for (int i = 1; i < args.length-1; i++) {
          res += Integer.parseInt(args[i]);
        }
        break;
      case "-":
        for (int i = 1; i < args.length-1; i++) {
          res -= Integer.parseInt(args[i]);
        }
        break;
    }
    System.out.println(res);

  }
}