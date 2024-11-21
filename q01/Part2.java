import java.io.*;
import java.util.Vector;
public class Part2 {
  public static void main(String[] args ) throws IOException {
    countPotions(System.in,System.out);
  }
  public static void countPotions(InputStream in, OutputStream out) throws IOException{
    int amtPotions = 0;
    int l;
    Vector<Integer> x = new Vector<Integer>();
    while ( (l = in.read()) != -1 ){
      x.addElement(l);
    }
    for (int i = 0; i < x.size(); i += 2) {
      int curFirst = x.elementAt(i);
      int curSecond = i+1 < x.size() ? x.elementAt(i+1) : 137;

      amtPotions += curFirst + curSecond < 137 ? 2 : 0; 
      amtPotions += checkCount(curFirst);
      amtPotions += checkCount(curSecond);
    }
    System.out.println(amtPotions);
  }
    static int checkCount(int x){
      switch (x) {
        case 66:
          return 1;
        case 67:
          return 3;
        case 68:
          return 5;
        default:
          return 0;
      }
    }
  }
