import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 2;
        String state = "";

        for (int i = 0; i < number; i++) {
            String input = sc.next();
            if(input.length() == 1 && (input.equals("t") || input.equals("f"))){
                state += input.equals("t") ? "1" : "0";

                //if else

                // state = state + ....
            } else {
                throw new RuntimeException();
            }
        }
        int res = Integer.parseInt(state,2 );
        System.out.println(res);
    }
}