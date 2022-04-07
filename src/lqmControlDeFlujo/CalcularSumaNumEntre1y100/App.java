package lqmControlDeFlujo.CalcularSumaNumEntre1y100;
/*Una operación que podemos realizar con los bucles de manera muy sencilla es la suma de una serie de números.
 En el ejemplo siguiente vamos a poder ver como un bucle for  se encarga de rrecorrer los primeros 100 números
 y los suma con cada iteración.*/

public class App {

    public static void main(String[] args) {
        System.out.println("Calcula la sma de los numeros enteros entre 1 y 100 ambos inclusive");
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
            System.out.println(suma);
        }
        System.out.println("La suma total de los numeros enteros se coresponde a: " + suma);
    }
}

