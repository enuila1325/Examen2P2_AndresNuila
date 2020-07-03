package examen2p2_andresnuila;

public abstract class Parte {

    protected int tiempo;

    public Parte() {
    }

    public Parte(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public abstract String toString();

}
