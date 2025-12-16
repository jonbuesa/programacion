import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Stack<String> libros = new Stack<>();
    public static void main(String[] args) {



        System.out.println("quieres haacer alguna consulta? (1.Si / 2.No)" );
        int menu = sc.nextInt();
        switch (menu){
            case 1:
                menu();
                break;
            case 2:
                System.exit(0);
        }
    }
    public static void menu(){
        System.out.println("_____________________________________________ \n"
                + "QUE ACCION DESEAS REALIZAR? \n" +
                "1. Añadir un libro \n" +
                "2. Consultar libro del TOP \n" +
                "3. Retirar libro del TOP \n" +
                "4. Mostrar todos los libros \n" +
                "5. Verificar si la pila esta vacia \n" +
                "6. Salir del programa");
        int opc = sc.nextInt();
        sc.nextLine();
        switch (opc){
            case 1:
                nuevoLibro();
                menu();
                break;
            case 2:
                libroTop();
                menu();
                break;
            case 3:
                borrarTop();
                menu();
                break;
            case 4:
                mostrarPila();
                menu();
                break;
            case 5:
                empty();
                menu();
                break;
            case 6:
                System.out.println("saliendo del programa...");
                System.exit(0);
                break;
        }
}

    public static void nuevoLibro(){
        boolean otro = true;
        String nombreLibro;
        String seguir;
        do{
        System.out.println("Nombre del libro que deseas añadir? ");
        nombreLibro = sc.nextLine();
        libros.push(nombreLibro);
        System.out.println("libro añadido :" + libros.peek());
        System.out.println("quieres añadir otro? (1.SI / 2.NO)");
        seguir = sc.nextLine();
        if (seguir.equals("1")){
            otro = true;
        } else if (seguir.equals("2")) {
            otro = false;
        }
    }while (otro == true);
}

    public static void libroTop(){
       System.out.println("el libro es :" + libros.peek());
    }

    public static void empty(){
        if(libros.isEmpty()){
            System.out.println("la pila esta vacia");
        }else {
            System.out.println("No esta vacia, la pila contiene " + libros.size() + " libros");
        }
    }
    public static void borrarTop(){
        System.out.println("Se borrara el libro: " + libros.peek());
        libros.pop();
        System.out.println("El nuevo top es: " + libros.peek());
    }
    public static void mostrarPila(){
        if(libros.isEmpty()){
            System.out.println("La pila esta vacia");
        }else {
                System.out.println(libros);
            }
        }
    }
