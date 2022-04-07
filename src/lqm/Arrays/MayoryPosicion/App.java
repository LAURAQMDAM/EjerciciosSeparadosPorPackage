package lqm.Arrays.MayoryPosicion;

public class App {
    public static void main(String[] args) {
        /*Crear una matriz y obtener el mayor*/


        int[] matriz = {45, 77, 12, 98,1,99,1000,33,54};
        int numeroMayor = matriz[0];
        int numeroMenor = matriz[0];
        String mayorPosicion = "0";
        String menorPosicion = "0";

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i] > numeroMayor) {
                numeroMayor = matriz[i];
                mayorPosicion = i + " " ;
            }
            if (matriz[i] < numeroMenor) {
                numeroMenor = matriz[i];
                menorPosicion = i + " ";
            }

        }
        System.out.println("El número mayor de la matriz es " + numeroMayor + " en la posición " + mayorPosicion);
        System.out.println("El número menor de la matriz es " + numeroMenor + " en la posición " + menorPosicion);
    }
}

