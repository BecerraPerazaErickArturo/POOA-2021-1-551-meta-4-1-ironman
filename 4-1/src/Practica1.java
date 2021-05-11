import javax.swing.*;

public class Practica1 {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (IllegalAccessException | InstantiationException var2) {
            var2.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            //Interfaz myGUIForm = new Interfaz();
            //myGUIForm.setVisible(true);
            //myGUIForm.acciones();

            Thread hilo = new flujodetrabajo();
            hilo.start();

            Thread hilo2 = new hilodeacciones();
            hilo2.start();
        });
    }
}