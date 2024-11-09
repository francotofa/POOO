package ClasesYObjetos;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
/*
        //CLASE OPERACION
        Operacion op = new Operacion();

        op.leerNumeros();
        op.sumar();
        op.restar();
        op.dividir();
        op.multiplicar();
        op.mostrarResultados();

        //CLASE OPERACION 2
        System.out.println("digite un numero: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        Operacion2 op2 = new Operacion2();

        op2.sumar(n1,n2);
        op2.restar(n1,n2);
        op2.multiplicar(n1,n2);
        op2.dividir(n1,n2);

        op2.mostrarResultados();

        //CLASE OPERACION 3
        System.out.println("digite un numero: ");
        int nu1 = scanner.nextInt();
        int nu2 = scanner.nextInt();

        Operacion3 op3 = new Operacion3();

        int suma = op3.sumar(n1,n2);
        int resta = op3.restar(n1,n2);
        int mult = op3.multiplicar(n1,n2);
        int div = op3.dividir(n1,n2);
        op3.mostrarResultados(suma,resta,mult,div);

        System.out.println("la suma es: "+op3.sumar(n1,n2));//tambien se puede mostrar asi
        System.out.println("la resta es: "+op3.restar(n1,n2));
        System.out.println("la multiplicacion es: "+op3.multiplicar(n1,n2));
        System.out.println("la division es: "+op3.dividir(n1,n2));

        //CLASE PERSONA
        Persona p1 = new Persona("alejando",21);
        p1.mostrarDatos();
*/
        //CLASE PERSONA 2
        Persona2 persona2 = new Persona2("alejandro",21);
        persona2.correr();
        Persona2 persona3 = new Persona2(12312312);
        persona3.correr(100);
    }
}
