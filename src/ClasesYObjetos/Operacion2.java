package ClasesYObjetos;
import java.util.Scanner;

public class Operacion2 {
    Scanner scanner = new Scanner(System.in);
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos

    //Metodo para sumar ambos numeros
    public  void sumar(int numero1,int numero2){
        suma = numero1+numero2;
    }
    public  void restar(int numero1,int numero2){
        resta = numero1-numero2;
    }
    public  void multiplicar(int numero1, int numero2){
        multiplicacion = numero1*numero2;
    }
    public  void dividir(int numero1, int numero2){
        division = numero1/numero2;
    }
    public void mostrarResultados(){
        System.out.println("la suma2 es: "+suma);
        System.out.println("la resta2 es: "+resta);
        System.out.println("la multiplicacion2 es: "+multiplicacion);
        System.out.println("la division2 es: "+division);
    }

}
