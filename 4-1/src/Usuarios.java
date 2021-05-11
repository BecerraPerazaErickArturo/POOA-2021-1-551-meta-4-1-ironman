import java.awt.*;
import java.io.Serializable;

public class Usuarios extends Component implements Serializable {
    private String nombre;
    private String apellido;
    private String tipo;

    public Usuarios(){

    }
    public Usuarios(String nombre, String apellido, String tipo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
