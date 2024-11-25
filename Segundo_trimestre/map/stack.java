
/*
 * Usar la clase Stack (Es una lista)
 * (2+3)*[4+{5-2}] hay que comprobar que este correctamente escrito los parentesis y corchetes.
 */

package map;

import java.util.*;

public class stack {
    public static void main(String[] args) {
        String anidado ="(2+3)*4+{5-2}]";

    Stack<String> apilar=new Stack<>();
    apilar.push("(");
    apilar.push(")");
    apilar.push("[");



    
    apilar.push("]");
    apilar.push("{");
    apilar.push("}");
    System.out.println(apilar.search(anidado));

    if(apilar.search(anidado) != -1){
        System.out.println("F");
    }else{
        System.out.println("V");
    }      
    



    }
}
