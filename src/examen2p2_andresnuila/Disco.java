package examen2p2_andresnuila;

public class Disco extends Parte{

    private int tamaño;
    private String marca;

    public Disco() {
    }

    public Disco(int tamaño, String marca, int tiempo) {
        super(tiempo);
        this.tamaño = tamaño;
        this.marca = marca;
    }

    

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Disco de " + tamaño + ", marca=" + marca + '}';
    }

}
