import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;

public class Bins {
    int numDice;
    int maxRoll;
    ArrayList<Integer> results;
    HashMap<Integer,Integer> map;
  public Bins (int minRoll, int maxRoll){
      this.numDice = minRoll;
      this.maxRoll = maxRoll;
      this.results = new ArrayList<Integer>();
      this.map = new HashMap<Integer, Integer>();
  }
  public int getBin(int Bin){
//      int counter = 0;
//      for(int roll: results){
//          if(roll == Bin){
//              counter += 1;
//          }
//      }
//      return counter;
      return (map.containsKey(Bin) ? map.get(Bin) : 0);
  }
  public void incrementBin(int rollValue){
      if (map.containsKey(rollValue)) {
          map.put(rollValue, map.get(rollValue) +1);
      } else {
          map.put(rollValue, 1);
      }
//      results.add(rollValue);
  }
  public String toString(){
      String output = "";
//      for(int i = numDice; i <= maxRoll; i++){
//         output += i + " : " + this.getBin(i) + "\n";
//      }
      for(int key: map.keySet()){
          output += key + " : " + map.get(key) + "\n";
      }
      return output;
  }

}
