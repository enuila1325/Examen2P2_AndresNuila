package examen2p2_andresnuila;

import java.awt.Color;
import java.util.Date;

public class Computadora {

    private String nSerie, material;
    private Color color;
    private Date año;
    private RAM r;
    private Disco d;
    private Bateria b;
    private Teclado t;
    private Pantalla p;
    private Procesador pr;

    public Computadora() {
    }

    public Computadora(String nSerie, String material, Color color, Date año, RAM r, Disco d, Bateria b, Teclado t, Pantalla p, Procesador pr) {
        this.nSerie = nSerie;
        this.material = material;
        this.color = color;
        this.año = año;
        this.r = r;
        this.d = d;
        this.b = b;
        this.t = t;
        this.p = p;
        this.pr = pr;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public RAM getR() {
        return r;
    }

    public void setR(RAM r) {
        this.r = r;
    }

    public Disco getD() {
        return d;
    }

    public void setD(Disco d) {
        this.d = d;
    }

    public Bateria getB() {
        return b;
    }

    public void setB(Bateria b) {
        this.b = b;
    }

    public Teclado getT() {
        return t;
    }

    public void setT(Teclado t) {
        this.t = t;
    }

    public Pantalla getP() {
        return p;
    }

    public void setP(Pantalla p) {
        this.p = p;
    }

    public Procesador getPr() {
        return pr;
    }

    public void setPr(Procesador pr) {
        this.pr = pr;
    }

    @Override
    public String toString() {
        return "Computadora{" + "nSerie=" + nSerie + ", material=" + material + ", color=" + color + ", a\u00f1o=" + año + ", r=" + r + ", d=" + d + ", b=" + b + ", t=" + t + ", p=" + p + ", pr=" + pr + '}';
    }

}
