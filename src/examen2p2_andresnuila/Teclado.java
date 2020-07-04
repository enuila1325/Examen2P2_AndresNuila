package examen2p2_andresnuila;

import java.awt.Color;

public class Teclado extends Parte {

    private String material;
    private String color;

    public Teclado() {
    }

    public Teclado(String material, String color, int tiempo) {
        super(tiempo);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Teclado{" + "material=" + material;
    }

}
