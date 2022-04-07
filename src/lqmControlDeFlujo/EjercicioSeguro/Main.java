package lqmControlDeFlujo.EjercicioSeguro;

public class Main {

    public static void main(String[] args) {

        //creamos algunas persoans de ejemplo para nuestra calculadora de seguros

        Persona p1 = new Persona("h", 6, "p");
        Persona p2 = new Persona("m", 5, "g");
        Persona p3 = new Persona("h", 7, "m");
        Persona p4 = new Persona("m", 3, "g");
        Persona p5 = new Persona("h", 12, "g");
        Persona p6 = new Persona("h", 1, "g");

        Service service = new Service();

        System.out.println("la persona 1 se ahorrara por su seguro la cantidad: " + service.calcularSeguro(p1));
        System.out.println("la persona 2 se ahorrara por su seguro la cantidad: " + service.calcularSeguro(p2));
        System.out.println("la persona 3 se ahorrara por su seguro la cantidad: " + service.calcularSeguro(p3));
        System.out.println("la persona 4 se ahorrara por su seguro la cantidad: " + service.calcularSeguro(p4));
        System.out.println("la persona 5 se ahorrara por su seguro la cantidad: " + service.calcularSeguro(p5));
        System.out.println("la persona 6 se ahorrara por su seguro la cantidad: " + service.calcularSeguro(p6));
    }
}
