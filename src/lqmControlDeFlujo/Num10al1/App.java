package lqmControlDeFlujo.Num10al1;

public class App {
    public static void main(String[] args) {

        System.out.println("Mostrar en pantalla los numero del 10 al 1 en orden de lqm.Arrays.Mayor.mayor a menor con bucle for" );

        for(int i=10;i>0;i--){
            System.out.println(i);
        }
        System.out.println("Mostrar en pantalla los numero del 10 al 1 en orden de lqm.Arrays.Mayor.mayor a menor con bucle WHILE" );
        int j = 10;
        while(j>0){
            System.out.println(j);
            j--;
        }

        System.out.println("Mostrar en pantalla los numero del 10 al 1 en orden de lqm.Arrays.Mayor.mayor a menor con bucle do-While" );
        int k=10;
        do{
            System.out.println(k);
            k--;
        }while(k>0);

    }
}
