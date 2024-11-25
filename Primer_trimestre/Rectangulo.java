import java.awt.Rectangle;
public class Rectangulo {
    public static void main(String[] args) {
          // Declaración de tres referencias a objetos Rectangle 
// Instanciación de tres objetos Rectangle mediante el constructor
// Y asignación de las referencias devueltas por el operador new a cada una de 
// las tres variables declaradas
Rectangle r1= new Rectangle (1,2, 5, 4);
Rectangle r2= new Rectangle (5,3, 4, 6);
Rectangle r3= new Rectangle (5,3, 4, 6);

// Comparación de los tres objetos mediante el uso del método equals
// sobre las variable referencia que apuntan a los objetos
System.out.println ("Ejemplos de comparación de objetos rectángulo:");
System.out.println ("Comparación r1 con r2 -> r1.equals(r2): " + r1.equals(r2));
System.out.println ("Comparación r1 con r3 -> r1.equals(r3): " + r1.equals(r3));
System.out.println ("Comparación r2 con r3 -> r2.equals(r3): " + r2.equals(r3));
    }
 
    
}
