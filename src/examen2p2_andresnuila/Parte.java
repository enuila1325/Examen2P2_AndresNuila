package examen2p2_andresnuila;

import java.io.Serializable;

public abstract class Parte implements Serializable {

    protected int tiempo;

    private static final long SerialVersionUID = 777L;

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
