public class Application {
    public static void main(String[] args) {
        one();
        System.out.println(two());
        three();
    }

    public static void one() {
        System.out.println("Willkommen zu Programmieren I");
    }

    public static int two() {
        //3 * (9 + 3) + 4 * 8
        return 3 * (9+3) + 4 * 8;
    }

    public static void three() {
        int x = 5;
        int y = 7;
        //Vor dem Tausch
        System.out.printf("X = %s\n", x);
        System.out.printf("Y = %s\n", y);
        //Tausch
        int xCopy = x;
        x = y;
        y = xCopy;
        //Nach dem Tausch
        System.out.printf("X = %s\n", x);
        System.out.printf("Y = %S\n", y);
    }

}
