package Clase2;

import java.util.Scanner;

public class Ejercicio3 {
    //Pedir el ingreso de 3 números y mostrar la suma de ellos.
    //INICIO
    public static void main (String args[]) {

        //Int num1 = 0;
        int num1 = 0;
        //Int num2 = 0;
        int num2 = 0;
        //Int num3 = 0;
        int num3 = 0;
        //Int suma = 0;
        int suma = 0;

        //TECLADO;
        Scanner input = new Scanner(System.in);

        //MOSTRAR "ingrese un numero";
        System.out.println("ingrese un numero...");
        //GUARDAR num1;
        num1 = input.nextInt();

        //MOSTRAR "ingrese otro numero";
        System.out.println("ingrese otro numero");
        //GUARDAR num2;
        num2 = input.nextInt();

        //MOSTRAR "ingrese el ultimo numero;
        System.out.println("ingrese el ultimo numero");
        //GUARDAR num3;
        num3 = input.nextInt();

        //Int suma = num1 + num2 + num3;
        suma = num1 + num2 + num3;
        //MOSTRAR "la suma es" + suma;
        System.out.println("la suma es" + suma);
        //FIN

    }
}
