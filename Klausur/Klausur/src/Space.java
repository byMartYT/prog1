import java.io.IOException;

public class Space {
  private int pos = (int) Math.round(Math.random()*8);

  public void move() throws IOException {
    while(true) {
      char in = (char) System.in.read();
      if(in == 'x') return;
      if(in == 'a') {
        if(pos == 0 ){
          continue;
        } else {
          pos--;
          System.out.println(this);
        }
      } else if (in == 'd') {
        if (pos == 7) {
          continue;
        } else {
          pos++;
          System.out.println(this);
        }
      }
    }
  }
  @Override
  public String toString() {
    String out = String.format("oooooooo\n\n\n\n");
    for (int i = 0; i < 8; i++) {
      if(i == pos) {
        out += "V";
      } else {
        out += " ";
      }
    }
    return out;
  }
}
