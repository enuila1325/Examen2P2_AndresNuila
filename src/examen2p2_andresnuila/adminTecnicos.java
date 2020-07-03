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

public class adminTecnicos {
    
    private ArrayList<Tecnico> tecnicos = new ArrayList();
    private File archivo = null;
    
    public adminTecnicos() {
    }
    
    public adminTecnicos(String path) {
        archivo = new File(path);
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }
    
    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }
    
    @Override
    public String toString() {
        return "tecnicos=" + tecnicos;
    }

    //extra mutador
    public void setTecnico(Tecnico u) {
        this.tecnicos.add(u);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String auxProyecto = "";
        for (Tecnico lp : tecnicos) {
            try {
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                auxProyecto += lp.getNombre() + ";" + lp.getGenero() + ";" + lp.getEdad() + ";" + lp.getcPcTeminadas() + "\n";
                bw.write(auxProyecto);
                bw.flush();
            } catch (Exception e) {
            }
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        try {
            FileReader fr = null;
            BufferedReader br = null;
            tecnicos = new ArrayList();
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            if (archivo.exists()) {
                String linea = "";
                try {
                    while ((linea = br.readLine()) != null) {
                        try {
                            String datos[] = linea.split(";");
                            Tecnico p = new Tecnico(datos[0], datos[1], Integer.parseInt(datos[2]));
                            p.setcPcTeminadas(Integer.parseInt(datos[3]));
                            tecnicos.add(p);
                        } catch (Exception ex) {
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(adminTecnicos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } //FIN IF

        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminTecnicos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
