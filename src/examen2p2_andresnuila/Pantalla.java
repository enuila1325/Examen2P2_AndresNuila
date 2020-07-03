package examen2p2_andresnuila;

public class Pantalla extends Parte {
    private String tactil, tipo;

    public Pantalla() {
    }

    public Pantalla(String tactil, String tipo, String tiempo) {
        super(tiempo);
        this.tactil = tactil;
        this.tipo = tipo;
    }

    

    public String getTactil() {
        return tactil;
    }

    public void setTactil(String tactil) {
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "tactil=" + tactil + ", tipo=" + tipo + '}';
    }
    
    
}
