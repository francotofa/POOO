package Ejercicio1;

import java.util.Scanner;

public class PrincipalCuadrilatero {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Cuadrilatero c1;
        float lado1, lado2;

        System.out.println("ingrese el lado 1");
        lado1 = scanner.nextFloat();
        System.out.println("ingrese el lado 1");
        lado2 = scanner.nextFloat();
        if (lado1 == lado2) { //es un cuadrado
            c1 = new Cuadrilatero(lado1);
        }
            else{
                c1 = new Cuadrilatero(lado1,lado2);
            }
            System.out.println("el perimetro es: "+c1.getPerimetro());
        System.out.println("el area es: "+c1.getArea());

        }
    }


