package ClasesYObjetos;
import java.util.Scanner;

public class Operacion3 {
    Scanner scanner = new Scanner(System.in);
    //Atributos

    //Metodos

    //Metodo para sumar ambos numeros
    public  int sumar(int numero1,int numero2){
        int suma = numero1+numero2;
        return suma;
    }
    public int restar(int numero1,int numero2){
        int resta = numero1-numero2;
        return resta;
    }
    public int multiplicar(int numero1, int numero2){
        int multiplicacion = numero1*numero2;
        return multiplicacion;
    }
    public int dividir(int numero1, int numero2){
        int division = numero1/numero2;
        return division;
    }
    public void mostrarResultados(int suma,int resta,int multiplicacion,int division){
        System.out.println("la suma3 es: "+suma);
        System.out.println("la resta3 es: "+resta);
        System.out.println("la multiplicacion3 es: "+multiplicacion);
        System.out.println("la division3 es: "+division);
    }

}
