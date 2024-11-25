
// index out of bounds exception
public class excepcionoes2 {
    public static void main(String[] args){
        int []a =new int[5];
        try{
         a[6]=3;
        }catch(Exception e){
            System.out.println("Ha habido un error tipo"+ e.getMessage());
        }
    
       } 
}
