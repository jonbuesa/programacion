import java.util.List;

public class Directivo extends Empleado{
    private String categoria;

    private List<Empleado> subordinados;

    public Directivo(String nombre, int edad, float sueldoBruto, String categoria, List<Empleado> subordinados) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
    }
}

