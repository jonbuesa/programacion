import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

                menu();
                break;
            case 4:

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
        do{
        System.out.println("Nombre del libro que deseas añadir? ");
        sc.nextLine();
        String nombreLibro = sc.nextLine();
        libros.push(nombreLibro);
        System.out.println("quieres añadir otro? (1.SI / 2.NO)");
        int seguir = sc.nextInt();
        if (seguir == 1){
            otro = true;
        } else if (seguir == 2) {
            otro = false;
        }
    }while (otro == true);
}

    public static void libroTop(){
       System.out.println("el libro es:" + libros.peek());
    }

    public static void empty(){
        if(libros.isEmpty()){
            System.out.println("la pila esta vacia");
        }else {
            System.out.println("la pila contiene " + libros.size() + " libros");
        }
    }
}