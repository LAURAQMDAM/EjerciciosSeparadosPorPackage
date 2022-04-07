package lqm.Arrays.EjerciciosConClases;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*clase que permita almacenar los datos de 100 personas y que posea metodos para calcular :
 * el numero de mujeres, el numero de hombres casados, y si el sueldo medio de los hombres solteros es mayor que el de los hombres casados*/
public class ArrayPersona {

    static Persona[] array = new Persona[100];
    //Creamos metodos random para que nos cree la lista de cosas "variadas", entre estado civil , sueldo y mujer o no:
    static List<String> estadocivil = List.of(new String[]{"c", "s", "v"});
    static List<Integer> sueldo = List.of(new Integer[]{1200, 1500, 2500});
    static List<Boolean> sexo = List.of(new Boolean[]{true, false});

    public static int randomEstadoCivil(List<String> e) {

        int posicionAleatoria = estadocivil.size();
        Random aleatorio = new Random();
        int r = (aleatorio.nextInt(estadocivil.size()));
        return r;

    }

    public static int randomSueldo(List<Integer> e) {

        int posicionAleatoria = sueldo.size();
        Random aleatorio = new Random();
        int r = (aleatorio.nextInt(sueldo.size()));
        return r;

    }

    public static int randomMujer(List<Boolean> e) {

        int posicionAleatoria = sexo.size();
        Random aleatorio = new Random();
        int r = (aleatorio.nextInt(sexo.size()));
        return r;

    }

    public static void crearArray() {

        for (int i = 0; i < array.length; i++) {

            Persona p = new Persona((estadocivil.get(randomEstadoCivil(estadocivil))), (sueldo.get(randomSueldo(sueldo))), (sexo.get(randomMujer(sexo))));
            array[i] = p;
            System.out.println(array[i]);

        }


    }

    //Ahora necesitamos crear unos metodos para calcular lo siguiente: el numero de mujeres, el numero de hombres casados,
    // y si el sueldo medio de los hombres solteros es mayor que el de los hombres casados
    public static int numMujeres() {

       int contadorMujeres= (int) Arrays.stream(array).filter(a -> a.isMujer()==true).count();


        return contadorMujeres ;

    }
    public static int numHombresCasados(){

        int contadorHombresCasados= (int) Arrays.stream(array).filter(a -> a.getEstadocivil().equals("c") && a.isMujer()==false).count();
        return contadorHombresCasados;
    }

    public static double sueldoMedioHombresSolteros(){

       DecimalFormat df = new DecimalFormat("#.00");

       double sueldoHombresSolteros= Arrays.stream(array).filter(a -> a.isMujer()==false && a.getEstadocivil().equals("s")).collect(Collectors.averagingDouble(Persona::getSueldo));
       String sueldoSolteros2Decimales = df.format(sueldoHombresSolteros);

        return sueldoHombresSolteros;
    }

    public static double sueldoMedioHombresCasados(){

        DecimalFormat df = new DecimalFormat("#.00");

        double sueldoHombresCasados= Arrays.stream(array).filter(a -> a.isMujer()==false && a.getEstadocivil().equals("c")).collect(Collectors.averagingDouble(Persona::getSueldo));
        String sueldoCasados2Decimales = df.format(sueldoHombresCasados);

        return sueldoHombresCasados;

    }

    public static boolean sueldoMedioHombreSolteroMayorASueldoHombresCasados(){
        //como hemos casteado los sueldos medios a String para que no nos devolviera muchos decimales, debemos castear de nuevo a Double para que nos deje operar

        if(sueldoMedioHombresSolteros()>sueldoMedioHombresCasados()){

            return true;

        }

        return false;
    }
}

