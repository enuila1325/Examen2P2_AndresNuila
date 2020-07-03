package examen2p2_andresnuila;

public class Parte {

    private String tiempo;

    public Parte() {
    }

    public Parte(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Parte{" + "tiempo=" + tiempo + '}';
    }

}
