import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    private static Map< String, String > contactos = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        System.out.println("---------------------------------- \n"
                + "MENÚ DE CONTACTOS \n"
                + "0. Lista de contactos \n"
                + "1. Añadir nuevo numero \n"
                + "2. Borrar numero \n"
                + "3. Buscar por numero \n"
                + "4. Borrar por nombre \n"
                + "5. Buscar por nombre \n"
                + "6. Salir");
        int menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case 0:
                System.out.println("contactos actuales: " + contactos);
                menu();
                break;
            case 1:
                añadirContactos();
                menu();
                break;
            case 2:
                borrarNumero();
                menu();
                break;
            case 3:
                buscarNumero();
                menu();
                break;
            case 4:
                borraNombre();
                menu();
                break;
            case 5:
                buscarNombre();
                menu();
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                break;
        }
    }

    public static void añadirContactos(){
        System.out.println("NOMBRE DEL CONTACTO: ");
        String nombre = sc.nextLine();
        System.out.println("NUMERO DEL CONTACTO: ");
        Pattern pat = Pattern.compile("^[0-9]{9}$");
        String numero = sc.nextLine();
        Matcher mat = pat.matcher(numero);
        if(mat.matches()){
            System.out.println("Numero valido: " + numero);
            contactos.put(nombre, numero);
        } else {
            System.out.println("numero no valido");
        }
    }

    public static void borrarNumero(){
        System.out.println("que numero quieres borrar: ");
        String delNum = sc.nextLine();
        String dato = contactos.remove(delNum);
        if(dato == null){
            System.out.println("numero eliminado");
        } else {
            System.out.println("numero no eliminado");
        }
    }

    public static void buscarNumero() {
        System.out.println("que numero quieres buscar: ");
        String buscNum = sc.nextLine();
        if (contactos.containsKey(buscNum)){
            System.out.println("Contacto buscado: " + contactos.get(buscNum));
        }else {
            System.out.println("el telefono no existe");
        }
    }

    public static void borraNombre(){
        System.out.println("escribe el Nombre que deseas borrar: ");
        String delNom = sc.nextLine();
        if (contactos.containsKey(delNom)){
            String clave = contactos.remove(delNom);
        } else {
            System.out.println("no tienes este contacto agregado");
        }
    }

    public static void buscarNombre(){
        System.out.println("buscar nombre: ");
        String buscNombre = sc.nextLine();
        if (contactos.containsValue(buscNombre)){
            System.out.println("el contacto es " + contactos.get(
                    buscNombre));
        } else {
            System.out.println("no tienes nadie con ese nombre agregado");
        }
    }
}