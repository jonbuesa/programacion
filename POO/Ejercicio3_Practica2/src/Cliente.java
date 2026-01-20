public class Cliente extends Persona{
    private int telefono;

    public Cliente(int telefono) {
        this.telefono = telefono;
    }

    public Cliente(String nombre, int edad, int telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void mostrar(){
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("telefono: " + telefono);
    }
}

