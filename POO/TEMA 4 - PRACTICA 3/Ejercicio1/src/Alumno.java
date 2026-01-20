public class Alumno extends Persona{
    private String dni;

    public Alumno() {
    }

    public Alumno(String nombre, String paisNacimiento, String fechaNacimiento, String dni) {
        super(nombre, paisNacimiento, fechaNacimiento);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
