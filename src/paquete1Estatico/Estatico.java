//miembros estaticos de una clase (static)
//cuando un atributo es estatico, ya no le pertenece a los objetos, le pertece a la clase, todo cambio que haga en el atriburto frase,
// no importa en que objeto este,repercute y sera el ultimo cambio definitivo para todos los objetos

//todos los objetos comparten ese atributo(frase) y si lo cambio en un objeto cambiara en todos los objetos porque ya lo le pertece a cada
//objeto individual ahora le pertenece a la clase propia

// otra caracteristica es que no necesitan que se instaciemos un objeto para poder utilizarlo
//System.out.println(Estatico.frase);
package paquete1Estatico;

public class Estatico {
    private static String frase = "primera frase";

    public static int sumar(int n1,int n2){
        int suma = n1+n2;
        return suma;
    }


    public static void main(String[] args){
        //System.out.println(Estatico.frase);
        System.out.println("la suma es: "+Estatico.sumar(3,4));
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();

        ob2.frase = "segunda frase";

        System.out.println(ob1.frase);
        System.out.println(ob2.frase);

    }
}
