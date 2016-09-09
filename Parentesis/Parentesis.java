
/**
 * Write a description of class parentesis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Anita
 */
public class Parentesis {
  // Pila para guardar los parentesis de apertura

  public static void main (String [] pps) {
        pila pi = new pila(3);
      System.out.println("{[()]}"); 
   System.out.println("{[(])}");
   System.out.println("{{[[(())]]}}"); 
   System.out.println("{[()](){()}}\n");
   System.out.println("()}");
   
   pi.comparator("{[()]}");
   pi.comparator("{[(])}");
   pi.comparator("{{[[(())]]}}");
   pi.comparator("{[()](){()}}");
   pi.comparator("()");
  }

  

}  
 



