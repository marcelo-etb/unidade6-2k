package util;
import javax.swing.JOptionPane;
public class Tela {
    public static String nextString(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }
    
    public static int nextInt(String mensagem) {
        return Integer.parseInt(nextString(mensagem));
    }
    
    public static double nextDouble(String mensagem) {
        return Double.parseDouble(nextString(mensagem));
    }
    
    public static void showMessage(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
