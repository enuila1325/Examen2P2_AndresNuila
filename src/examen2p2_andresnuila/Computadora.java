package examen2p2_andresnuila;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Computadora implements Serializable {

    private String nSerie, material;
    private String color;
    private int anio;
    private RAM r;
    private Disco d;
    private Bateria b;
    private Teclado t;
    private Pantalla p;
    private Procesador pr;
    private ArrayList<Parte> partes = new ArrayList();
    private static final long SerialVersionUID = 777L;

    public Computadora() {
    }

    public Computadora(String nSerie, String material, String color, int año, RAM r, Disco d, Bateria b, Teclado t, Pantalla p, Procesador pr) {
        this.nSerie = nSerie;
        this.material = material;
        this.color = color;
        this.anio = año;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return anio;
    }

    public void setAño(int año) {
        this.anio = año;
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

    public ArrayList<Parte> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<Parte> partes) {
        this.partes = partes;
    }

    @Override
    public String toString() {
        return "Computadora-->" + "nSerie=" + nSerie + " año: " + anio;
    }

}
