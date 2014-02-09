* Rory McEntee
 * 17 Jan 2013
 * Lab 2
 * Gamma
 * Desmonstrating Cast types */

import java.math.BigInteger;

public class FactorialTable {
  public static void main(String[] args) {
    
    System.out.println("first loop");
  int m = 1, n = 1, s = 1;
  
    for (n = 1; n < 13; n++) {
    m = n * m;
    System.out.println(m);
    }
    //Values are incorrect after 12! due to limitations of int datatype
    
    System.out.println("second loop");
    
   long r = (long) m; 
    for (s = 13; s < 21; s++) {
    r = s * r;
    System.out.println(r);
    }
    //Values are incorrect after 20! due to limitations of long datatype
    
    System.out.println("third loop");
    
  
    BigInteger thirdStage = new BigInteger(Long.toString(r));
  
    for (int y = 21; y < 26; y++) {
        BigInteger bigY = new BigInteger(Integer.toString(y));
    thirdStage = bigY.multiply(thirdStage);
    System.out.println(thirdStage);
    }
}
}



