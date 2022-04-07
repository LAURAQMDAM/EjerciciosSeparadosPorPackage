package lqmControlDeFlujo.TranformarBucles;
/*• Dado el bucle for :
for (i=1; i<10; i++)
System.out.println (i);*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Dado el siguiente bucle for: ");

        for (int i = 1; i < 10; i++){

            System.out.println(i);
    }
        System.out.println("\nTransformarlo en un bucle while: ");
        int i=1;
        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("Indicar el numero de digitos pares de un numero");


        System.out.println("Factorial de un numero");

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero entero para obtener su factorial: ");

        int num = sc.nextInt();

        

        System.out.println("Escribir la tabla de caracteres ASCII");

    }
}
