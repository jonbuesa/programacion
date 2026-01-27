import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static List<Coche> Coches = new ArrayList<>();
    private static List<Propietario> Propietarios = new ArrayList<>();
    public static void main(String [] args) {

         // COCHES
         Coche c1 = new Coche("1234 ABC", "Toyota", 2018 , 18000);
         Coche c2 = new Coche("5678 DEF", "BMW", 2015 , 25000);
         Coche c3 = new Coche("9012 GHI", "Seat", 2012 , 12000);

         Coche c4 = new Coche("3456 JKL", "Toyota", 2020 , 22000);
         Coche c5 = new Coche("7890 MNO", "Audi", 2017 , 30000);
         Coche c6 = new Coche("1122 PQR", "BMW", 2010 , 15000);

         Coche c7 = new Coche("3344 STU", "Seat", 2019 , 16000);
         Coche c8 = new Coche("5566 VWX", "Audi", 2014 , 20000);
         Coche c9 = new Coche("7788 YZA", "Toyota", 2021 , 24000);

        Coches.add(c1);
        Coches.add(c2);
        Coches.add(c3);
        Coches.add(c4);
        Coches.add(c5);
        Coches.add(c6);
        Coches.add(c7);
        Coches.add(c8);
        Coches.add(c9);


        //PROPIETARIOS

        Propietario p1 = new Propietario("Carlos", List.of(c1,c2,c3));
        Propietario p2 = new Propietario("Ana", List.of(c4,c5,c6));
        Propietario p3 = new Propietario("Luis",List.of(c7,c8,c9));

        Propietarios.add(p1);
        Propietarios.add(p2);
        Propietarios.add(p3);


        List<String> matriculas = new ArrayList<>();

        //1 sin Stream
        /*for (Coche c : Coches){
            matriculas.add(c.getMatricula());
            System.out.println(c.getMatricula());
        }*/



        //2 sin stream
        /*for (Propietario p : Propietarios){
            System.out.println(p.getCoches().size());
        } */



        //3 sin Stream
        /*List<Coche> mas2015 = new ArrayList<>();
        for (Coche c : Coches) {
            if (c.getAño() > 2015) {
                mas2015.add(c);
                System.out.println(c.getAño());}
        }*/

        //4


 }
}