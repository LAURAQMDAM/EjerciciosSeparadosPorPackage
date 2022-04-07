package lqm.Arrays.TecladoyCantidadaDeLeidos;

import java.util.Scanner;

/*Hacer un programa que lea numeros de 1 digito(del 1 al 9) del teclado e indique cuantos se han leido de cada tipo (5 de valor 0,3 de valor 1, 6 de valor 2..)*/
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir=false;
        int tamanio=0;

        int[] matriz;

        do{
            System.out.println("Introduzca numeros de 1 digito");
            System.out.println("Para salir pulse -555");

            matriz=new int[tamanio];



            for(int i=0;i<matriz.length;i++){
                matriz[i]=sc.nextInt();
                tamanio++;
                System.out.println(matriz[i]);
            }
            System.out.println(matriz);

            if(sc.nextInt()==-555){
                salir=true;
                System.out.println("\nHasta pronto!!!");
            }


        }while(!salir);

    }
}
