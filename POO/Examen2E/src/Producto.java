import java.time.LocalDate;
import java.util.ArrayList;

public class Producto {
    private LocalDate fecha;
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private ArrayList<Usuario> usuarios;


    public Producto() {
    }

    public Producto(LocalDate fecha) {
        this.fecha = fecha;
    }


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
