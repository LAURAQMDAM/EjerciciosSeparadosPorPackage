package lqmControlDeFlujo.SumaDigitosDeUnNumero;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Calcule la suma de los digitos de un numero entero,mm he mirado un poco por internet pero no he conseguido sacar la solucion

        Scanner sc = new Scanner(System.in);

        int numeroEntero;


          System.out.println("Introduzca el valor del numero ");

          numeroEntero = sc.nextInt();
        System.out.println(numeroEntero);
          recursion(numeroEntero);
          /*
        String number = String.valueOf(numeroEntero);

        char[] digits1 = number.toCharArray();

        for(int i = 0; i < digits1.length; i++) {
            System.out.println(digits1[i]);
        }

        int suma =digits1[0]+digits1[1]+digits1[2]+digits1[3];

        System.out.println(suma);
*/        LinkedList<Integer> stack = new LinkedList<Integer>();
        while(numeroEntero > 0){
            stack.push(numeroEntero % 10);
            numeroEntero = numeroEntero / 10;
        }
        while ((!stack.isEmpty())){
            System.out.println(stack.pop());
        }



    }
    public static void recursion(int number) {
        if(number > 0) {
            recursion(number/10);
            System.out.printf(String.valueOf(number%10));
        }
}}
