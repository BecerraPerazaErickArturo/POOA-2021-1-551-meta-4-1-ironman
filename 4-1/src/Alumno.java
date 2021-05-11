import java.io.Serializable;

public class Alumno extends Usuarios implements Serializable {
    private int edad;
    private int id;
    private int semestre;
    private String facultad;
    private boolean activo;

    public Alumno(String nombre, String apellido, String tipo, int edad, int id, int semestre, String facultad, boolean activo){
        super(nombre,apellido,tipo);
        this.edad = edad;
        this.id = id;
        this.semestre = semestre;
        this.facultad = facultad;
        this.activo = activo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String toString(){

        return " "+getNombre()+" "+getApellido()+" "+getTipo()+" "+edad+" "+id+" "+semestre+" "+facultad+" "+activo;

    }
}
