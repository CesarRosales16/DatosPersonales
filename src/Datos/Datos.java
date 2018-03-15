//AUTOR: César Rosales  00060917
package Datos;

public class Datos {

    String nombre,fechaNac,carne;
    int edad;
    
    public Datos(String nombre, String fechaNac, int edad, String carne) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.edad = edad;
        this.carne = carne;
    }
    public void ImprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNac);
        System.out.println("Edad: " + edad);
        System.out.println("Carné: " + carne);
    }
}
