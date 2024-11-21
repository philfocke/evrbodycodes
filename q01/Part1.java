import java.io.*;
public class Part1 {
  public static void main(String[] args) throws IOException{
    int amtPotions = countPotions(System.in,System.out);
    System.out.println(amtPotions);
  }
  public static int countPotions (InputStream in, OutputStream out) throws IOException {
    int curPotions = 0;
    int b;
    while ( (b = in.read()) != -1 ) {
      curPotions += b == 66 ? 1 : 0;
      curPotions += b == 67 ? 3 : 0;
    }
    return curPotions;
  }
}
