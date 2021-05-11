import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class Interfaz extends JFrame implements Serializable {
    DefaultTableModel model = new DefaultTableModel();


    public JPanel Interfaz;
    public JTabbedPane tabbedPane1;
    public JLabel Nombre;
    public JTextArea txtNombre;
    public JTextArea txtEdad;
    public JRadioButton siRadioButton;
    public JRadioButton noRadioButton;
    public JComboBox comboBox1;
    public JTextField textField1;
    public JComboBox comboBox2;
    public JTextArea textArea3;
    public JTextArea txtApellido;
    public JTextArea txtId;
    public JSpinner spSemestre;
    public JComboBox comboFacultad;
    public JComboBox comboTipo;
    public JLabel lblEdad;
    private JButton btnAlta;
    private JTable table1;
    private JButton btnMostrar;
    private int i = 0;
    private boolean activo = false;
    ArrayList<Usuarios> usuarios = new ArrayList<>();

    public Interfaz() {
        add(Interfaz);
        setTitle("Nuestra interfaz de usuario");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void createTable() {
        Object[][] data = new Object[20][];
        int i = 0;
        for (Usuarios us: usuarios) {
            data[i] = new Object[]{usuarios.get(i).getNombre(),
                                    usuarios.get(i).getApellido(),
                                    usuarios.get(i).getTipo(),
                                    ((Alumno) usuarios.get(i)).getEdad(),
                                    ((Alumno) usuarios.get(i)).getId(),
                                    ((Alumno) usuarios.get(i)).getSemestre(),
                                    ((Alumno) usuarios.get(i)).getFacultad(),
                                    ((Alumno) usuarios.get(i)).isActivo()};
            i++;

        }

        table1.setModel(new DefaultTableModel(
                data,
                new String[]{"Nombre","Apellido","Tipo","Edad","Matricula","Semestre","Facultad","Activo"}
        ));
    }

    public void acciones(){
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createTable();
            }
        });

        btnAlta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (comboTipo.getSelectedIndex()){

                    case 0:
                        if(!siRadioButton.getHideActionText()){
                            activo = true;
                        } else {
                            activo = false;
                        }

                        Alumno usuario = new Alumno(
                                txtNombre.getText(),
                                txtApellido.getText(),
                                comboTipo.getItemAt(0).toString(),
                                (Integer.parseInt(txtEdad.getText())),
                                (Integer.parseInt(txtId.getText())),
                                (Integer.parseInt(spSemestre.getValue().toString())),
                                comboFacultad.getItemAt(comboFacultad.getSelectedIndex()).toString(),
                                activo);
                        usuarios.add(guardar(usuario));
                        break;
                    case 1:
                }
            }

        });
    }

    public Alumno guardar(Alumno al){
        try{
            ObjectOutputStream escribe_fichero = new ObjectOutputStream(new FileOutputStream("Save.txt"));

            escribe_fichero.writeObject(al);

            escribe_fichero.close();

            ObjectInputStream recupera_fichero = new ObjectInputStream(new FileInputStream("Save.txt"));

            al = (Alumno) recupera_fichero.readObject();

            System.out.println("Alumno: " + al);

            recupera_fichero.close();

            System.out.println("Funciona");

        }catch (Exception e){
            System.out.println("Error");
        }
        return al;
    }
}
