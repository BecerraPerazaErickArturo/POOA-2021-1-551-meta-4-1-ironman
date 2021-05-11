public class hilodeacciones extends Thread{
    public hilodeacciones(){}

    @Override
    public void run(){
        Interfaz y = new Interfaz();
        y.createTable();
    }
}
