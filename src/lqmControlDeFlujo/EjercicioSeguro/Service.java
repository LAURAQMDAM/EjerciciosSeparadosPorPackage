package lqmControlDeFlujo.EjercicioSeguro;

public class Service {

    public double cochePequenio=75000;
    public double cocheMediano=100000;
    public double cocheGrande=150000;
    public double precioFinalSeguro=0;

    public double calcularSeguro(Persona persona){

        if(persona.getTipoCoche().equals("p") && persona.getTiempoUltimoParte()>=5){

            precioFinalSeguro=(cochePequenio*(0.15));


        }else{
            precioFinalSeguro=(cochePequenio*(010));

        }

        if(persona.getTipoCoche().equals("m") && persona.getSexo().equals("m")){

            precioFinalSeguro =(cocheMediano*(0.16));

        }

        if(persona.getTipoCoche().equals("m") && persona.getSexo().equals("h") && persona.getTiempoUltimoParte()>=3){

            precioFinalSeguro =(cocheMediano*(0.17));


        }else{
            precioFinalSeguro =(cocheMediano*(0.10));

        }
        if(persona.getTipoCoche().equals("g") && persona.getTiempoUltimoParte()>=7){
            precioFinalSeguro =(cocheGrande*(0.20));


        }else if(persona.getTipoCoche().equals("g") && persona.getSexo().equals("m") && persona.getTiempoUltimoParte()<7){

            precioFinalSeguro =(cocheGrande*(0.10));

        }else{

            precioFinalSeguro =(cocheGrande*(0.08));

        }
        return precioFinalSeguro;
    }
}
