package lqmControlDeFlujo.EjercicioSeguro;

public class Persona {
    private String sexo; //m,h
    private int tiempoUltimoParte; //en años
    private String tipoCoche; // p,m,g

    public Persona(String sexo, int tiempoUltimoParte, String tipoCoche) {
        this.sexo = sexo;
        this.tiempoUltimoParte = tiempoUltimoParte;
        this.tipoCoche = tipoCoche;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTiempoUltimoParte() {
        return tiempoUltimoParte;
    }

    public void setTiempoUltimoParte(int tiempoUltimoParte) {
        this.tiempoUltimoParte = tiempoUltimoParte;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(String tipoCoche) {
        this.tipoCoche = tipoCoche;
    }
}
