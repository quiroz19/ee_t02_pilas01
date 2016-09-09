
/**
 * Write a description of class pila here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Stack;
/**
 *
 * @author Anita
 */
public class pila {
    char [] pila;
    Integer tope;
    Integer tamaño;
    
    public pila(int tamaño){
     tope=-1;
     this.tamaño=tamaño;
     pila=new char[tamaño];
    }
    
    public boolean estallena(){
     return tope==tamaño-1;
    }
    public boolean estaVacia(){
     return tope==-1;
    }
    
 public void push(char dato){
     
     if (tope < tamaño-1){
         tope ++;
         pila[tope]=dato;
     }
     else{
         System.out.println("desvordamiento");
     } 
 
}
 public char pop(){
     char resultado=' ';
     if (tope>-1){
         resultado=pila[tope];
         pila[tope]=resultado;
         tope--;
     }
     else {
         System.out.println("subdesvordamiento");
      
     }
     return resultado;
 }

    public char peek (){
     char n=' ';
     if(tope>-1){
         n=pila[tope];
         return n;
     }
     else{
         System.out.println("la pila esta vacia");
           
     }
        return n;
    
 }
 public void comparator(String datos){
      int i=0;
        while(i<datos.length()){
         if(datos.charAt(i)=='('){
            push('(');
            }else if(datos.charAt(i)==')' && peek()=='('){
             if(!estaVacia()){
                pop();
                }else{
                 push(')');
                 break;
                }
            }
          if(datos.charAt(i)=='{'){
              push('{');
            }
             else if(datos.charAt(i)=='}' && peek()=='{'){
             if(!estaVacia()){
                pop();
                }else{
                 push('}');
                 break;
                }
            }
          if(datos.charAt(i)=='['){
            push('[');
            }
            else if(datos.charAt(i)==']' && peek()=='['){
             if(!estaVacia()){
                pop();
                }else{
                 push(']');
                 break;
                }
            }
                 
            i++;
        }
        if(estaVacia()){
         System.out.println("SI");
          }else{
            System.out.println("NO");
            }
    }
    
}
