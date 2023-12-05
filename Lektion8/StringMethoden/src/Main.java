import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Main {
  public static void main(String[] args) throws IOException {
    String seite = "<body id=\"www-wikipedia-org\">"
            + "<div class=\"central-textlogo\">"
            + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
            + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
            + "</div>"
            + "</body>";
    int start = seite.indexOf("<img src=\"");
    if(start != -1) {
      start += "<img src=\"".length();
    }
    int end = seite.indexOf("\">", start);
    String downloadUrl = seite.substring(start,end);
    URL url = new URL(downloadUrl);
    BufferedImage image = ImageIO.read(url);
    ImageIO.write(image, "png", new File("bild.png"));
  }
}
