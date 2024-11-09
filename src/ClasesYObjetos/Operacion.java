package ClasesYObjetos;
import java.util.Scanner;

public class Operacion {
    Scanner scanner = new Scanner(System.in);
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos

    //Metodo para pedirle al usuario que nos digite 2 numeros
    public void leerNumeros(){
        System.out.println("Digite un numero: ");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
    }
    //Metodo para sumar ambos numeros
    public  void sumar(){
        suma = numero1+numero2;
    }
    public  void restar(){
        resta = numero1-numero2;
    }
    public  void multiplicar(){
        multiplicacion = numero1*numero2;
    }
    public  void dividir(){
        division = numero1/numero2;
    }
    public void mostrarResultados(){
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("la division es: "+division);
    }

}
