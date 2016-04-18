

import java.util.*;

 
class assignment3 {
  public static void main(String[] args) {
  	int  number,c;

  	Scanner in = new Scanner(System.in);

	System.out.println("Enter Number");

	number= in.nextInt();
    
    Random t = new Random();
 
      System.out.println(t.nextInt(number));
  }
}