package examen2p2_andresnuila;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

public class adminReporteFallos {

    private ArrayList<OrdenEnsamblaje> ensamblajes = new ArrayList();
    private File archivo = null;

    public adminReporteFallos() {
    }

    public adminReporteFallos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<OrdenEnsamblaje> getEnsamblajesFallidos() {
        return ensamblajes;
    }

    public void setTecnicos(ArrayList<OrdenEnsamblaje> ensamblajes) {
        this.ensamblajes = ensamblajes;
    }

    @Override
    public String toString() {
        return "Orden ensamblaje fallidas=" + ensamblajes;
    }

    //extra mutador
    public void setOrden(OrdenEnsamblaje u) {
        this.ensamblajes.add(u);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String auxProyecto = "";
        for (OrdenEnsamblaje lp : ensamblajes) {
            try {
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                auxProyecto += "SE REPORTO UN FALLO A LAS: " + new Date() + "\n";
                auxProyecto += lp.getTecnico().getNombre() + "fallo en ensamblar.\n";
                auxProyecto += "Computadora con numero de serie: " + lp.getComputadora().getnSerie();
                bw.write(auxProyecto);
                bw.flush();
            } catch (Exception e) {
            }
        }
        bw.close();
        fw.close();
    }

}
