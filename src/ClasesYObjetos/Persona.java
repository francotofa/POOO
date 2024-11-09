package ClasesYObjetos;

public class Persona {
    //atributos
    String nombre;
    int edad;

    //metodos

    //metodo constructor
    //forma 1
    public Persona(String Nombre,int Edad){
        nombre = Nombre;
        edad = Edad;
    }
    //forma 2
/*    public Persona(String nombre,int edad){
        this.nombre = nombre;  //this.nombre senala al atributo y nombre senala al parametro constructor
        this.edad = edad;
}*/
    public void mostrarDatos(){
        System.out.println("el nombre es: "+nombre);
        System.out.println("la edad es: "+edad);
    }
}
