import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    //System.out.println(replace("Graphik.Init.Datei.ini".toCharArray()));
    //System.out.println(replaceUnderline("Graphik.Init.Datei.ini".toCharArray()));

    Space sp = new Space();
    System.out.println(sp);
    sp.move();

  }

  public static int replace(char[] text){
      int count = 0;
    for (int i = 0; i < text.length; i++) {
      if(text[i] == '.') {
        count++;
      }
    }
    return count-1;
  }
  public static char[] replaceUnderline(char[] text){
    for (int i = 0; i < text.length; i++) {
      if(text[i] == '.' && i != text.length-4) {
        text[i] = '_';
      }
    }
    return text;
  }
}