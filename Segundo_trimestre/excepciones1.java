

public class excepciones1 {
   public static void main(String[] args){
    int a = 4, b=0;
    
    try{
     System.out.println(a/b);
    }catch(Exception e){
        System.out.println("Ha habido un error tipo"+ e.getMessage());
    }

   } 
}
