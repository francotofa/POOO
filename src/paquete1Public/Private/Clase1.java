//MODIFICADORES DE ACCESO [por defecto (nada), public (pueden usarlos todos) y private (solo la misma clase)
/*
se crea atributo1 en clase1 y se lo puede llamar en cualquier clase que este en el mismo paquete
int atributo1;

para crear objetos de otro paquete se importa
import paquete1.Clase1;
y cambiar el modificador de accedo al atributo1
public int atributo1;
ahora se puede usar en cualquier clase

private int atributo1;
private restringe mi atributo1 para que solo pueda ser utilizado por metodos de la misma clase1

 */
package paquete1Public.Private;

public class Clase1 {
    public int atributo1;
}
