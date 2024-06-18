package exemplos;

import javax.swing.JOptionPane;
public class TesteVetor2 {
    public static void main(String[] args) {
        int quantidade = Integer.parseInt(
            JOptionPane.showInputDialog("Digite a quantidade de notas"));
        double notas [] = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            notas[i] = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a " + (i+1) + "ª nota"));
        }
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Nota[" + i + "]=" + notas[i]);
        }
    }    
}
