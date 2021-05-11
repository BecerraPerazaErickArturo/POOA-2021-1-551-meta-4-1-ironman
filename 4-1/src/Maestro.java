import java.io.Serializable;

public class Maestro extends Usuarios implements Serializable {

    private String grado;
    private String jornada;
    private int antiguedad;
    private int id_empleado;

    public Maestro() {

    }

    public Maestro(String nombre, String apellido, String tipo, String grado, String jornada, int antiguedad, int id_empleado) {
        super(nombre, apellido, tipo);
        this.grado = grado;
        this.jornada = jornada;
        this.antiguedad = antiguedad;
        this.id_empleado = id_empleado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }


}
