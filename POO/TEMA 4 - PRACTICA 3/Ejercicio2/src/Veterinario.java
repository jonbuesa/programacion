public class Veterinario extends Persona{
    private String dni;
    private int numeroSeguridadSocial;


    public Veterinario(String nombre, String dni, String direccion, int telefono, String dni1, int numeroSeguridadSocial) {
        super(nombre, dni, direccion, telefono);
        this.dni = dni1;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
