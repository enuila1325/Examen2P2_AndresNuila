package examen2p2_andresnuila;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class adminCompus {

    private ArrayList<Computadora> computadoras = new ArrayList();
    private File archivo = null;

    private static final long SerialVersionUID = 777L;

    public adminCompus(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Computadora> getComputadoras() {
        return computadoras;
    }

    public void setListaPersonas(ArrayList<Computadora> computadoras) {
        this.computadoras = computadoras;
    }

    @Override
    public String toString() {
        return "computadoras=" + computadoras;
    }

    //extra mutador
    public void setPersona(Computadora u) {
        this.computadoras.add(u);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Computadora t : computadoras) {
                bw.writeObject(t);
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
        } finally {

        }
    }

    public void cargarArchivo() {
        try {
            computadoras = new ArrayList();
            Computadora temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Computadora) objeto.readObject()) != null) {
                        computadoras.add(temp);
                    }
                } catch (IOException | ClassNotFoundException ex) {
                    // Logger.getLogger(adminPersonas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } //FIN IF

        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminCompus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(adminCompus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
