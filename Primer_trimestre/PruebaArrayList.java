import java.util.ArrayList;

public class PruebaArrayList {
    public static void main(String[] args) {
        //DECLARACIÓN EL ARRAYLIST
        ArrayList<String> nombreArrayList = new ArrayList<String>();
    }
    //AÑADIMOS 10 ELEMENTOS EN EL ARRAYLIST
    for(int i=1; i<=10 ; i++ ){
        nombreArrayList.add("Elemento"+i);
    }
    //Añadimos un nuevo elemento al ArrayList en la posición 2
    nombreArrayList.add(2,"Elemento 3");
    Iterable<String> nombreIterable;
    nombreIterator =nombreArrayList.iterator();
    while(nombreIterator.hasNext()){
        String elemento = nombreIterable.next();
        System.out.print(elemento + "/");
        System.out.flush();
    }
}
