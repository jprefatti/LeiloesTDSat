
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Usar SwingUtilities para garantir que a UI seja criada na thread correta
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Abrir a tela de cadastro como principal
                new cadastroVIEW().setVisible(true);
            }
        });
    }
}
