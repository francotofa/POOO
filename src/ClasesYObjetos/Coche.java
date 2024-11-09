package ClasesYObjetos;

public class Coche {
    //atributos
    String color;
    String marca;
    int km;

    //metodo
    public static void main(String [] args) {
        Coche coche1 = new Coche();

        coche1.color = "blanco";
        coche1.marca = "audi";
        coche1.km = 0;

        System.out.println("el color del coche es; " + coche1.color);
        System.out.println("la marca del coche es: " + coche1.marca);
        System.out.println("el km del coche es: " + coche1.km);

        Coche coche2 = new Coche();

        coche2.color = "rojo";
        coche2.marca = "ferrari";
        coche2.km = 100;

        System.out.println("el color del coche es; " + coche2.color);
        System.out.println("la marca del coche es: " + coche2.marca);
        System.out.println("el km del coche es: " + coche2.km);

        //un metodo es una accion o comportamiento de los objetos
        //modificador de acceso: public
        //valor de retorno: void
        //nombre del metodo: nombre del metodo
        //( ): argumentos

        //paramentros: es una decraracion de variable u objeto
        //argumentos: es un valor que se envia

        //public void metodo(int a,String b){  = DECLARACION DE METODO
        //objeto.metodo(1,"hola");  = INVOCACION DE METODO

        //retorno de valores
        /* public int sumar(int a, int b){
        int suma=a+b;
        return suma;
        }
        int suma=objeto.sumar(5,4)
        System.out.println("la suma es: "+suma)

        public String saludar(String nombre){
        String saludo = "hola "+nombre;
        return saludo;
        }
        String saludo=objeto.saludo("alejando");
        System.out.println(saludo);
         */

        //QUE ES UN METODO CONSTRUCTOR?
        //Un constructor es un metodo especial de una clase que se invoca siempre que se crea un objeto de esa clase
        //se asigna memoria para el objeto
        //se inicializan los atributos de ese objeto
        //se invoca al constructor de la clase que puede ser uno entre varios
        // persona p1 = new persona();
        //CARACTERISTICAS DE LOS CONTRUCTORES
        //tienen el mismo nombre de la clase
        //no devuelve ningun valor
        //debe declararse como publico
    }
}
