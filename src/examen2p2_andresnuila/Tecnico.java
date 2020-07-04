package examen2p2_andresnuila;

public class Tecnico {

    private String nombre, genero;
    private int edad, cPcTeminadas;

    public Tecnico() {
    }

    public Tecnico(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.cPcTeminadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getcPcTeminadas() {
        return cPcTeminadas;
    }

    public void setcPcTeminadas(int cPcTeminadas) {
        this.cPcTeminadas = cPcTeminadas;
    }

    @Override
    public String toString() {
        return "Tecnico: " + nombre + ", PCs Terminadas=" + cPcTeminadas;
    }

}
