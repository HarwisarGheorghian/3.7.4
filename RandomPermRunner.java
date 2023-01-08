import java.io.*;
import java.util.ArrayList;
public class RandomPermRunner
{
  public static void main(String[] args) throws IOException
  {
    //int[] randNums = RandomPermutation.next(10);
    //System.out.println(java.util.Arrays.toString(randNums));
    ArrayList<Horse> horses = new ArrayList<Horse>();
    BufferedReader br = null;
    try{
      br = new BufferedReader(new FileReader("/workspace/3.7.4/horsedata.txt"));
      String line;
      while((line = br.readLine()) != null){
        String[] qualities = line.split(",");
        horses.add(new Horse(qualities[0], Integer.parseInt(qualities[1])));
      }

      RandomPermutation.horseRandomizer(horses);
    } finally {
      if (br != null) {
          br.close();
      }
    }

  }
}