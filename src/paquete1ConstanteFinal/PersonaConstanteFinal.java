//constantes (final)
package paquete1ConstanteFinal;

public class PersonaConstanteFinal {
    private final String nombre;
    private int edad;

    //contructor
    public PersonaConstanteFinal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("el nombre es: "+nombre);
        System.out.println("la edad es: "+edad);
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
}
