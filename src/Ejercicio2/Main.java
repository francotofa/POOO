
package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Variable
        char proximoMov = '0';
        //Crear objeto con cordenadas iniciales x=0, y=0
        Posicion objeto = new Posicion(0,0);
        System.out.println("POSICION INICIAL: ("+objeto.getEjeX()+","+objeto.getEjeY()+")");
    
        while (proximoMov != 'E'){
            //Identificar el proximo movimiento
            do {
                System.out.println("Ingrese el siguiente movimiento W-Adelante S-Atras A-Izquierda D-Derecha E-Salir ");
                proximoMov = scanner.next().trim().charAt(0);
            } while ((proximoMov !='W')&&(proximoMov !='A')&&(proximoMov !='S')&&(proximoMov !='D')&&(proximoMov !='E'));

            //Realizar el movimiento

            switch(proximoMov){
                case 'W':
                    objeto.moverArriba();
                    break;
                case 'S':
                    objeto.moverAbajo();
                    break;
                case 'A':
                    objeto.moverIzquierda();
                    break;
                case 'D':
                    objeto.moverDerecha();
                    break;
                case 'E':
                    System.out.println("Gracias por jugar!");
                    break;
                default:
                    System.out.println("Movimiento no reconocido");
                    break;
            }
        }
    }
}