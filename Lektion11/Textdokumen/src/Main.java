public class Main {

  private static char[][] text = new char[64][];

  public static void main(String[] args) {

  }

  public static int countLetters(){
    int counter = 0;
    for (int i = 0; i < text.length; i++) {
      for (int j = 0; j < text[i].length; j++) {
        if(text[i][j] != ' ' || text[i] != null) {
          counter++;
        }
      }
    }
  return counter;
  }
  public static boolean changeLines(int eins, int zwei){
    int length = text.length;
    if(eins >= length || zwei >= length) return false;
    char[] speicher = text[zwei];
    text[zwei] = text[eins];
    text[eins] = speicher;
    return true;
  }
  
  public static void insert(char[][] newText, int row){
    if(row >= text.length) {
      throw new RuntimeException("Ungültige Zeilenposition");
    }
    char[][] speicher = text;
    text = new char[speicher.length + newText.length][];

    int j = 0;
    for (int i = 0; i < text.length; i++) {
      if(row >= i && i <= row + newText.length) {
        text[i] = newText[j];
        j++;
      }
      text[i] = speicher[i];
    }
    
  }
}