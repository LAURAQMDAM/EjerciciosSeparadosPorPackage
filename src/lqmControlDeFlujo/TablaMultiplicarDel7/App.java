package lqmControlDeFlujo.TablaMultiplicarDel7;

public class App {
    public static void main(String[] args) {

        System.out.println("TABLA DE MULTIPLICAR DEL 7 con bucle WHILE");
        int num = 7;
        int i = 0;
        while (i < 11) {

            System.out.println(num * i);
            i++;
        }
        System.out.println("\n\nTABLA DE MULTIPLICAR DEL 7 con bucle FOR");

        for (int j = 0; j < 11; j++) {
            System.out.println(num * j);
        }
        System.out.println("\n\nTABLA DE MULTIPLICAR DEL 7 con bucle DO While");
        int k=0;
        do{

            System.out.println(num*k);
            k++;

        }while(k<11);

        }

    }


