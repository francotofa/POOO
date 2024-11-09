package ClasesYObjetos;

public class Persona2 {
    //atributos
    String nombre;
    int edad;
    int dni;

    //metodos


    public Persona2(String nombre,int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona2(int dni){
        this.dni = dni;
    }
    //sobrecarga de metodos
    public void correr(){
        System.out.println("soy "+nombre+"tengo "+edad+" anos y estoy corriendo una maraton");
    }
    public void correr(int km){
        System.out.println("he corrido "+km+" kilometros");

    }
}
