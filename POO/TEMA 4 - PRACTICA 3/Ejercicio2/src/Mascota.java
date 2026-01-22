public class Mascota {
    protected String tipo;
    protected String raza;
    protected String nombre;
    protected String fechaNacimiento;
    protected String sexo;
    protected String peso;
    protected float longitud;
    protected String tipoPelo;

    public Mascota() {
    }

    public Mascota(String tipo, String raza, String nombre, String fechaNacimiento, String sexo, String peso, float longitud, String tipoPelo) {
        this.tipo = tipo;
        this.raza = raza;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.longitud = longitud;
        this.tipoPelo = tipoPelo;
    }
}
