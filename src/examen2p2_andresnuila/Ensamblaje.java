package examen2p2_andresnuila;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

public class Ensamblaje extends Thread {

    private OrdenEnsamblaje o;
    private ArrayList<Parte> lista = new ArrayList();
    private JTable instalacion;
    private boolean flag;
    private JProgressBar progreso;
    Random r = new Random();

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
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ensamblaje.class.getName()).log(Level.SEVERE, null, ex);
                }
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

                int canti = o.getTecnico().getcPcTeminadas();
                int fallo;
                if (canti < 0 || canti >= 5) {
                    fallo = 1 + r.nextInt(30);
                    System.out.println(fallo);
                    if (fallo < 30) {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "Ensamblaje fallido");
                    }
                } else if (canti < 6 || canti >= 15) {
                    fallo = 1 + r.nextInt(22);
                    if (fallo < 22) {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "Ensamblaje fallido");
                    }
                } else if (canti < 16 || canti >= 30) {
                    fallo = 1 + r.nextInt(13);
                    if (fallo < 13) {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "Ensamblaje fallido");
                    }
                } else if (canti < 30) {
                    fallo = 1 + r.nextInt(7);
                    if (fallo < 7) {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "Ensamblaje fallido");
                    }
                }
                aux++;
                if (aux == 6) {
                    flag = false;
                    JOptionPane.showMessageDialog(null, "Ensamblaje finalizado");
                }
                this.instalacion.setModel(modelo);
            }
        }
    }

}
