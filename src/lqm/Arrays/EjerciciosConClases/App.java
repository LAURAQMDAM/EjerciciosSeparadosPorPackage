package lqm.Arrays.EjerciciosConClases;

public class App {
    public static void main(String[] args) {

        ArrayPersona.crearArray();
        System.out.println("El numero de mujeres que existe en el array es: " + ArrayPersona.numMujeres());
        System.out.println("El numero de Hombres que esten casados es: " + ArrayPersona.numHombresCasados());
        System.out.println("El Sueldo medio de los hombres solteros  es : " + ((int)ArrayPersona.sueldoMedioHombresSolteros()));
        System.out.println("El Sueldo  medio de los hombres casados  : " + ((int)ArrayPersona.sueldoMedioHombresCasados()));
        System.out.println("¿Es el Sueldo  medio de los hombres solteros mayor que el de los hombres casados?  " + ArrayPersona.sueldoMedioHombreSolteroMayorASueldoHombresCasados());

    }
}
