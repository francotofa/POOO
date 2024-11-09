/*
Ejercicio 1: construir un programa que calcule el area y el perimetro de un cuadrilatero dada la longiitud
de sus dos lados. los valores de la longitud deberan introducirse por linea de ordenes. si es un cuadrado,
solo se proporcionara la longitud de uno de los lados al constructor.
 */
package Ejercicio1;

public class Cuadrilatero {
    //atributos
    private float lado1;
    private float lado2;

    //metodos

    //metodo constructor 1 (cuadrilatero)
    public Cuadrilatero(float lado1,float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;

    }
    //metodo constructor 2 (cuadrado)
    public Cuadrilatero(float lado1){
        this.lado1 = this.lado2 = lado1;
    }
    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }
    public float getArea(){
        float area = lado1 * lado2;
        return area;
    }
}
