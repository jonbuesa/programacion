import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
            menu();

    }

    public static void menu(){
        System.out.println("que opcion quieres? \n"
                        + "1. Mostrar numero de clientes con un animal concreto \n"
                        + "2. Datos personales de un cliente \n"
                        + "3. Datos del veterinario \n"
                        + "4. Datos de la mascota de un cliente \n"
                        + "5. Datos de la mascota de un veterinario");
    }
}