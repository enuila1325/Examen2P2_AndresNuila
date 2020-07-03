package examen2p2_andresnuila;

public class Procesador extends Parte {

    private int nucleos;
    private double velocidad;

    public Procesador() {
    }

    public Procesador(int nucleos, double velocidad, int tiempo) {
        super(tiempo);
        this.nucleos = nucleos;
        this.velocidad = velocidad;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Procesadorn: nucleos=" + nucleos + ", velocidad=" + velocidad + '}';
    }

}
