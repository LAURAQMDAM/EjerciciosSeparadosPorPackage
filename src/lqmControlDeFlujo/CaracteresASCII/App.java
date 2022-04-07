package lqmControlDeFlujo.CaracteresASCII;
/*La forma más básica y fácil de extraer el carácter de un código ASCII es lanzar el código ASCII a un char directamente; esto convertirá el asciiValue del tipo int en un tipo char.*/

public class App {
    public static void main(String[] args) {

        int asciiValue = 97;

        char convertedChar = (char)asciiValue;
        System.out.println(convertedChar);

        for(int i=0;i<127;i++){

            System.out.println((char)i);
        }

    }

}
