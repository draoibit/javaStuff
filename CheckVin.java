/* Rory McEntee
 * Assignment 2
 * Gamma
 * Verifies whether a VIN number is valid or not*/

import jpb.*;

public class CheckVin {

//The CharCheck boolean helper functions determine whether or not
//the syntax of the VIN is correct  
  public static boolean CharCheck1() {
    
      if (userInput.length() == 17) {
        return true; }
      
        else
        System.out.println("Error: Number must be 17 characters long");
        return false;
  }
      
  public static boolean CharCheck2() {
    for (int i = 0; i < 17; i++;) {
        if (Character.isLetterorDigit(userInput.At(i))) {
             return true;
        }
      else 
        System.out.println("Invalid; illegal characters");
        return false;
               }
  }
  
  public static boolean CharCheck3() {
      for (int i = 13; i < 17; i++;) {
        if (Character.isDigit(userInput.At(i))) {
               return true;
      }
      else
        System.out.println("Invalid; illegal characters");
        return false;      
  }
  }
  
  public static boolean CharCheck4() {
      for (int i = 0; i < 17; i++;) {
          if (Character.isDigit(userInput.charAt(i)) ==
              'I' || 'O' || 'Q' || 'i' || 'o' || 'q') {
        System.out.println("VIN must not contain letters I, O, or U");
            return false;
        }
      else
        return true;
        }
  }
  //Changes VIN into a completely numerical value
        public static int AssignValue(char res) {
      
      if (res == '0' {
        return 0;
      }
      if (res == '1' || res == 'A' || res == 'J' || res == 'a' || res == 'j'){
        return 1;
      }
               
      if (res == '2' || res == 'B' || res == 'K' || res == 'S' || res == 'b'||
           res == 'k' || res == 's') { 
         return 2;   
       }
      if (res == '3' || res == 'C' || res == 'L' || res == 'T' || res == 'c'||
           res == 'l' || res == 't') { 
         return 3;   
      }
          
      if (res == '4' || res == 'D' || res == 'M' || res == 'U' || res == 'd'||
           res == 'm' || res == 'u') { 
         return 4;   
       }
          
      if (res == '5' || res == 'E' || res == 'N' || res == 'V' || res == 'e'||
           res == 'n' || res == 'v') { 
         return 5;   
       }
          
      if (res == '6' || res == 'F' || res == 'W' || res == 'f' || res == 'w') {
         return 2;   
       }
          
      if (res == '7' || res == 'G' || res == 'P' || res == 'X' || res == 'g'||
           res == 'p' || res == 'x') { 
         return 7;   
       }
          
      if (res == '8' || res == 'H' || res == 'Y' || res == 'h' || res == 'y') {
         return 8;   
       }
          
      if (res == '9' || res == 'R' || res == 'Z' || res == 'r' || res == 'z') {
         return 9;   
       }
         return 10;           
          }

  //Array that holds the weight values
        public static int[] WeightArray() {
          int weights[] = new int[17];
          weights[0] = 8;
          weights[1] = 7;
          weights[2] = 6;
          weights[3] = 5;
          weights[4] = 4;
          weights[5] = 3;
          weights[6] = 2;
          weights[7] = 10;
          weights[8] = 1;
          weights[9] = 9;
          weights[10] = 8;
          weights[11] = 7;
          weights[12] = 6;         
          weights[13] = 5;
          weights[14] = 4;
          weights[15] = 3;
          weights[16] = 2;
          return weights;
        }
        
public static char Convert(String userInput) {
        int[] vinArray = new int[17];
        for (int = 0; i < 17; i++;) {
          vinArray[i] = AssignValue(userInput.charAt());
        }
      }
      
public static int ObtainCheckDigit() {
          for (i = 0; i < 17; i++;) {
            if (i != 8){
            total += vinArray[i] * WeightArray[i];
          }
          }
          total = total % 11;
         return total;
        }

switch (total) {
  case 0: return '0';
  case 1: return '1';
  case 2: return '2';
  case 3: return '3';
  case 4: return '4';
  case 5: return '5';
  case 6: return '6';
  case 7: return '7';
  case 8: return '8';
  case 9: return '9';
  case 10: return 'X';
}
return
  
}


     public static void main(String[] args) {
    
     SimpleIO.prompt("Enter a VIN number: ");
     String userInput = SimpleIO.readLine().trim();
    
     if (CharCheck1(userInput) == true) {
       if (CharCheck2(userInput) == true) {
         if (CharCheck3(userInput) == true) {
           if (CharCheck4(userInput) == true) {
             if (switch (total) == userInput.charAt(8)) {
         System.out.println("You have entered a valid VIN.");
           }
                              else {
         System.out.println("You have entered an invalid VIN.")
                                }
                }
     }
    }
          }
          }
     