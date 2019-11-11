package com.mycompany.lez01;

import javax.swing.JOptionPane;

public class ArrayLoopApp {

    static int[] movs;
    static int maxmovs = 3;
    static int saldo = 0;

    public static void main(String[] args) {

        movs = new int[maxmovs];
        getMovs();
        preparaOut();
    }

    static int preparaSaldo() {
        int newsaldo = 0;
        for (int i = 0; i < movs.length; i++) {
            newsaldo = newsaldo + movs[i];
        }
        return newsaldo;
    }

    static void getMovs() {
        int valore;
        for (int i = 0; i < movs.length; i++) {
            movs[i] = myGetint();
           /* try {
                String strmov = JOptionPane.showInputDialog(null, "dimmi valore mov.");
                valore = Integer.parseInt(strmov);
                movs[i] = valore;
            } catch (Exception err) {
                valore = 0;
                JOptionPane.showMessageDialog(null, "hai scritto un valore errato" + "è stato assegnato il valore 0");
            }*/
        }

    }

    static void preparaOut() {
        String out = "";
        for (int i = 0; i < movs.length; i++) {
            if (movs[i] > 0) {
                out += "Riga numero " + (i + 1) + ": +" + movs[i] + "\n";
            } else {
                out += "Riga numero " + (i + 1) + ": " + movs[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, out + "il saldo è: " + preparaSaldo());
    }
    static int myGetint(){
        int ris=0;
        boolean ok=false;
        while(!ok)
        {
        try {
                String strmov = JOptionPane.showInputDialog(null, "dimmi valore mov.");
                ris = Integer.parseInt(strmov);
                ok=true;
                
            } catch (Exception err) {
                ris = 0;
                JOptionPane.showMessageDialog(null, "hai scritto un valore errato" + "riprova!!");
            }
        }
        return ris;
    }
}
