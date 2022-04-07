package lqm.Arrays.EjerciciosConClases;

public class Persona {
    private String estadocivil;//casada=c, s=soltera, v=viuda
    private int sueldo;
    private boolean mujer;

    public Persona() {
    }

    public Persona(String estadocivil, int sueldo, boolean mujer) {
        this.estadocivil = estadocivil;
        this.sueldo = sueldo;
        this.mujer = mujer;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isMujer() {
        return mujer;
    }

    public void setMujer(boolean mujer) {
        this.mujer = mujer;
    }

    @Override
    public String toString() {
        return "Persona[" +
                "estadocivil=" + estadocivil +
                ", sueldo=" + sueldo +
                ", mujer=" + mujer +
                ']';
    }
}
