import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> especiesAceptadas = new ArrayList<>(List.of("perro","gato","conejo","loro","tortuga"));
    private static ArrayList<String> animalesRescatados = new ArrayList<>();
    private static Map<String, String > ascoiarCuidador = new HashMap<>();
    private static Queue<String> cola = new LinkedList<>();
    public static void main(String[] args) {
        menuOpciones();


    }
    public static void menuOpciones() {
        System.out.println(
                "a)Ver Especies aceptadas\n" +
                "b)Agregar un nuevo animal al listado de rescatado \n" +
                "c)Asignar un cuidador a un animal. \n" +
                "d)Pasar un animal a la cola de espera de adopcion \n" +
                "e)Adoptar un animal \n" +
                "f)Lista todos los animales y sus cuidadores actuales \n" +
                "g)Salir");

        String opcion = sc.nextLine();

        switch (opcion){
            case "a":
                verEspecies();
                menuOpciones();
                break;
            case "b":
                agregarAnimal();
                menuOpciones();
                break;
            case "c":
                asignarCuidador();
                menuOpciones();
                break;
            case "d":
                animalCola();
                menuOpciones();
                break;
            case "e":
                adoptar();
                menuOpciones();
                break;
            case "f":
                listaAnimales();
                menuOpciones();
                break;
            case "g":
                System.out.println("Saliendo del programa...");
                System.exit(0);
        }

    }
    public static void verEspecies(){
        System.out.println("LAS ESPECIES ACEPTADAS SON: \n"
                            + especiesAceptadas
        );
    }
    public static void agregarAnimal(){
        System.out.println("ESTAS SEGURO QUE QUIERES AGREGARLO? (SI / NO)");
        String mas = sc.nextLine();
        if (mas.equals("si")  || mas.equals("SI") || mas.equals("Si") ){
        boolean animalAceptado = false;
            do{

            System.out.println("que animal quieres añadir");
            String nuevoAnimal = sc.nextLine();

            if (especiesAceptadas.contains(nuevoAnimal)){
                animalesRescatados.add(nuevoAnimal.toLowerCase());

                animalAceptado = true;

            } else {
                System.out.println("este animal no esta disponible");
                animalAceptado = false;
            }}while (animalAceptado == false);
        } else if (mas.equals("NO")  || mas.equals("No")  || mas.equals("no") ) {
                System.out.println("Esta bien, te devolveremos al menu");
            }

        System.out.println("los animales disponibles son: \n"
                        + animalesRescatados);
        }


    public static void asignarCuidador(){

    }

    public static void animalCola(){
        System.out.println("añadir un animal a la cola de adopcion");
        String colaAnimal = sc.nextLine();
        if (animalesRescatados.contains(colaAnimal)){
            cola.add(colaAnimal);
            animalesRescatados.remove(colaAnimal);
        }
        System.out.println("el animal de la cola es: " + cola.peek());
    }

    public static void adoptar(){

    }

    public static void listaAnimales(){
        if (ascoiarCuidador.isEmpty()){
            System.out.println("aun no hay ningun cuidador");
        } else {
            System.out.println(ascoiarCuidador);
        }
    }
}