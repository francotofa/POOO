//encapsulamiento y metodos accesores (Setters y Getters)
//se usan para controlar el codigo de un metodo
package paquete1GetterYSetter;

public class Clase1SetterYGetter {
    private int edad;
    private String nombre;

    //metodo setter: establecemos la edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    //metodo Getter: mostramos la edad
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }


}


