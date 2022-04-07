package lqm.Arrays.Buscaminas;
/*El método main, que estará en la clase Buscaminas, deberá pedir las
coordenadas de las casilla al usuario (hasta que al menos una de ellas sea -1) y
para cada par de coordenadas deberá mostrar el numero de bombas que hay
alrededor de la casilla*/

import java.util.Scanner;

public class Buscaminas {
    public static void main(String[] args) {
        boolean acabar=false;
        int coordenada1=0;
        int coordenada2=0;
        int[][] tablero=new int[10][10];
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDOS AL BUSCAMINAS \nPORFAVOR INTRODUZCA LOS DATOS QUE SE LE IRAN PIDIENDO, PULSARA -1 CUANDO DESEE FINALIZAR LA APLICACION");
        System.out.println("Introduzca el numero de minas que contendra el tablero, minimo 7");
        Tablero.imprimirTablero(tablero);
        Tablero.inicioTablero(sc.nextInt());//con lo siguiente le estamos diciendo que rellene el tablero con el numero de bombas pasadas por parametro

        do{
            System.out.println("BIENVENIDOS AL BUSCAMINAS \nPORFAVOR INTRODUZCA LOS DATOS QUE SE LE IRAN PIDIENDO, PULSARA -1 CUANDO DESEE FINALIZAR LA APLICACION");
            System.out.println("Introduzca la primera coordenada , con los numeros comprendidos entre el 0 y el 10");
            coordenada1=sc.nextInt();
            System.out.println("Introduzca la segunda coordenada , con los numeros comprendidos entre el 0 y el 10");
            coordenada2=sc.nextInt();


        }while(!acabar);


    }
}
