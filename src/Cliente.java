public class Cliente {
    String Nombre;
    String Apellidos;
    String Cedula;
    String Sexo;
    String Ubicacion;
    //construcción completa
    public Cliente (String Nombre, String Apellidos, String Cedula,String Sexo, String Ubicación){
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Sexo = Sexo;
        this.Ubicacion = Ubicacion;
    }
    //constructor sin sexo
    public Cliente (String Nombre, String Apellidos, String Cedula, String Ubicacion){
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Ubicacion = Ubicacion;
    }
    //constructor por defecto
    public Cliente (){

    }
    //metodo para suscribirse
    public void suscribirse (Suscripciones Suscripciones){
        System.out.println(Nombre+" "+Apellidos+" Adquierio una suscripcion " + Suscripciones.tipo + ".");
    }
}
