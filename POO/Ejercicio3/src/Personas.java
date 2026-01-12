import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Personas {
    private String nombre;
    private int dNacimiento;
    private int mNacimiento;
    private int aNacimiento;
    private String direccion;
    private int codigoPostal;
    private String ciudad;

    public Personas(String ciudad, int codigoPostal, String direccion, int aNacimiento, int mNacimiento, int dNacimiento, String nombre) {
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.direccion = direccion;
        this.aNacimiento = aNacimiento;
        this.mNacimiento = mNacimiento;
        this.dNacimiento = dNacimiento;
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento(){
        return LocalDate.of(dNacimiento,mNacimiento,aNacimiento);
    }

    public int getEdad(){
        return Period.between(getFechaNacimiento(),LocalDate.now()).getYears();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(int dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public int getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(int mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public int getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(int aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "nombre='" + nombre + '\'' +
                ", dNacimiento=" + dNacimiento +
                ", mNacimiento=" + mNacimiento +
                ", aNacimiento=" + aNacimiento +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
