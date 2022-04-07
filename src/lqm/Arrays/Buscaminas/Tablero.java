package lqm.Arrays.Buscaminas;
/*Se implementara una clase Tablero en la que se incluirá el tablero de 10x10 y
todos los métodos necesarios para realizar la aplicación*/

public class Tablero {
    final static int TAMANIO = 10;

    static int[][]tablero=new int[TAMANIO][TAMANIO];

    int mina=0;
    int noMina=1;
    static int oculto=3;

    public static void inicioTablero(int numMinas) {

        //pensemos que por ejemplo el tablero tendra como casillas, el numero 0 cuando no haya minas, y el numero 1 cuando si las haya

        for (int i = 0; i < tablero[0].length; i++) {

            for (int j = 0; j < tablero[1].length; j++) {
                tablero[i][j] = oculto;

            }

        }
        System.out.println("MAPA DE BUSCAMINAS; TODO COMIENZA COMO CASILLAS OCULTAS, QUE HEMOS NOMBREADO CON EL NUNERO 3");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();


        }
    }
        public static void imprimirTablero(int[][] tablero){
            // Calculamos las letras según el tamaño
            char[] letras = new char[TAMANIO];
            for (int i = 0; i < TAMANIO; i++)
                letras[i] = (char) ('A' + i);

            // Imprimimos la fila de encabezado
            System.out.print("    ");
            for (int i = 0; i < TAMANIO; i++) {
                System.out.print("[" + i + "] ");
            }

            System.out.println("");
            // Imprimimos el resto de filas
            for (int i = 0; i < TAMANIO; i++) {
                System.out.print("[" + letras[i] + "]  ");
                for (int j = 0; j < TAMANIO; j++) {
                    System.out.print(tablero[i][j] + "   ");
                }
                System.out.println("");
            }
        }
    }
