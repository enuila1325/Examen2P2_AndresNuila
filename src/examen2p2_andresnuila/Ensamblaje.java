package examen2p2_andresnuila;

import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ensamblaje extends Thread {

    private OrdenEnsamblaje o;
    private ArrayList<Parte> lista = new ArrayList();
    private JTable instalacion;
    private boolean flag;
    private JProgressBar progreso;

    public Ensamblaje(OrdenEnsamblaje o, JTable instalacion, JProgressBar progreso) {
        this.o = o;
        this.instalacion = instalacion;
        this.progreso = progreso;
        flag = true;
        for (Parte p : o.getComputadora().getPartes()) {
            this.lista.add(p);
        }
    }

    public void run() {
        while (flag) {
            int aux = 0;
            DefaultTableModel modelo = (DefaultTableModel) this.instalacion.getModel();
            for (int i = 0; i < lista.size(); i++) {
                progreso.setValue(0);
                progreso.setMaximum(lista.get(i).getTiempo());
                for (int j = 0; j < lista.get(i).getTiempo(); j++) {
                    progreso.setValue(progreso.getValue() + 1);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
                Object[] row = {lista.get(i).toString(), lista.get(i).getTiempo()};
                modelo.addRow(row);
                aux++;
                if (aux == 6) {
                    flag = false;
                }
                this.instalacion.setModel(modelo);
            }
        }
    }

}
