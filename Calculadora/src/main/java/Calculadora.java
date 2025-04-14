
import com.mycompany.calculadora.Interface;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        // Não é necessário inicializar nada aqui
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Interface().setVisible(true); // Abre a interface da calculadora
        });
    }
}