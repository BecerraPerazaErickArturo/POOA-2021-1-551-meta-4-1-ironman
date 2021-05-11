public class flujodetrabajo extends Thread{
    public flujodetrabajo(){}

    @Override
    public void run(){
        Interfaz x = new Interfaz();
        x.setVisible(true);
        x.acciones();
    }
}
