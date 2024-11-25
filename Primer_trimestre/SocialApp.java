public class SocialApp {
    static class Usuario{
        String Nombre;
        amigos[] amigos;
        public Usuario(String Nombre){
            this.Nombre= Nombre;
        }
    }
    static class RedSocial{
    Usuario[] usuarios;   
    public RedSocial(Usuario[] usuarios){
        this.usuarios= usuarios;
    }  
    }
}

