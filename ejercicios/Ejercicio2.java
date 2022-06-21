package Clase2;

import java.util.Scanner;

public class Ejercicio2 {
    //Pedir el ingreso del nombre y el año de nacimiento. Mostrar el nombre y la edad de la
    //persona.
    //INICIO
    public static void main (String args[]) {

        //teclado
        Scanner input = new Scanner(System.in);

        //String nombre;
        String nombre ="";

        //Int año;
        int año = 0;

        //MOSTRAR "Ingrese su nombre";
        System.out.println("Ingrese su nombre");

        //GUARDAR NOMBRE;
        nombre = input.next();

        //MOSTRAR "ingrese su año de nacimiento";
        System.out.println("ingrese su año de nacimiento");

        //GUARDAR año;
        año = input.nextInt();

        //calcular la edad de la persona
        int edad = 2020 - año;

        //MOSTRAR "su nombre es" + nombre + "y su edad es" + edad;
        System.out.println("su nombre es" + nombre + "y su edad es" + edad);


    }



}
