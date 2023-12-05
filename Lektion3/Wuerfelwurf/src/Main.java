public class Main {
    public static void main(String[] args) {
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;
        boolean five = false;
        boolean six = false;
        for (int i = 0; i<1000; i++) {
            int number = (int) Math.round(Math.random()*6);

            switch (number) {
                case 1:
                    System.out.println("Eins gewürfelt");
                    break;
                case 2:
                    System.out.println("Zwei gewürfelt");
                    break;
                case 3:
                    System.out.println("Drei gewürfelt");
                    break;
                case 4:
                    System.out.println("Vier gewürfelt");
                    break;
                case 5:
                    System.out.println("Fünf gewürfelt");
                    break;
                case 6:
                    System.out.println("Sechs gewürfelt");
                    break;
                default:
                    System.out.println("Fehler");
            }

        }
    }
}
