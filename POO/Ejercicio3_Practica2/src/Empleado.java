public class Empleado extends Persona{
    protected float sueldoBruto;

    public Empleado() {
    }

    public Empleado(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public Empleado(String nombre, int edad, float sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    public float getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

        public void mostrar(){
            System.out.println("nombre: " + nombre);
            System.out.println("edad: " + edad);
            System.out.println("sueldo bruto: " + sueldoBruto);
        }

        public void calcularSalarioNeto(){
        double sueldoNeto = sueldoBruto * 0.9;
        }
    }

