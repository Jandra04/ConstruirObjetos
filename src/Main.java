//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args){
        //Cliente usando el constructor completo
        Cliente cliente1 = new Cliente(
                "Alejandra",
                "Carrillo",
                "604760847",
                "Femenino",
                "Manuel Antonio"
        );
        //Cliente usando el constructor sin sexo
        Cliente cliente2 = new Cliente(
                "Josue",
                "Castillo",
                "604310248",
                "Manuel Antonio"
        );
        //Cliente con el constructor vacio
        Cliente cliente3 = new Cliente();
        // crear suscripciones diferentes
        Suscripciones Suscripcion1 = new Suscripciones("Premium", 9.99, 1);
        Suscripciones Suscripcion2 = new Suscripciones("Familiar", 14.99, 1);
        Suscripciones Suscripcion3 = new Suscripciones("Anual", 99.99,12 );
        cliente1.suscribirse(Suscripcion3);
    }

}