package paquete1GetterYSetter;

public class Clase2SetterYGetter {
    public static void main(String[] args) {
        Clase1SetterYGetter objeto1 = new Clase1SetterYGetter();

        //objeto1.edad = 10; error

        objeto1.setEdad(21);
        System.out.println("la edad es: "+objeto1.getEdad());

        objeto1.setNombre("alejandro");
        System.out.println("el nombre es "+objeto1.getNombre());
    }
}
