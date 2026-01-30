import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        } */

        //1 con stream
        //Coches.stream().map(Coche::getMatricula).forEach(System.out::println);



        //2 sin stream
        /*for (Propietario p : Propietarios){
            System.out.println(p.getCoches().size());
        } */

        //2 con stream
        //long total = Coches.stream().count();



        //3 sin Stream
        List<Coche> mas2015 = new ArrayList<>();
        /*for (Coche c : Coches) {
            if (c.getAño() > 2015) {
                mas2015.add(c);
                System.out.println(c.getAño());}
        }*/

        //3 con stream
        //Coches.stream().filter(c -> c.getAño() > 2015).toList() ;


        //4
  /*      double sum = 0; for(Coche c : Coches) sum += c.getPrecio(); double avg = sum / Coches.size();

        double average = Coches.stream().mapToDouble(Coche::getPrecio).average().orElse(0.0);
*/

    //5
        // Coche max = Coches.stream().max(Comparator.comparing(Coche::getPrecio)).orElse(null);


    //6
        // boolean exists = Coches.stream().anyMatch(c -> c.getMarca().equals("BMW"));

    //7
        // List<Coche> res = Coches.stream().sorted(Comparator.comparing(Coche::getPrecio)).toList();

    //8
        // Coche old = Coches.stream().min(Comparator.comparing(Coche::getAño)).orElse(null);

    //9
        // long count = Coches.stream().filter(c -> c.getPrecio() > 20000).count();

    //10
        // List<String> marcas = Coches.stream().map(Coche::getMarca).distinct().toList();

    //11
        // Map<String, Double> map = Coches.stream().collect(Collectors.toMap(Coche::getMatricula, Coche::getPrecio));

    //12
        // Map<String, List<Coche>> group = Coches.stream().collect(Collectors.groupingBy(Coche::getMarca));

    //13
        // Map<String, List<Coche>> res = Coches.stream().collect(Collectors.groupingBy(c -> c.getAño() > 2015 ? "Moderno" : "Antiguo"));

    //14
        // Map<String, Double> res = Coches.stream().collect(Collectors.groupingBy(Coche::getMarca, Collectors.averagingDouble(Coche::getPrecio)));

    //15
        // String res = coches.stream().map(Coche::getMatricula).collect(Collectors.joining(", "));

   //16
        //  long n = coches.stream().filter(c -> c.getMarca().equals("Toyota")).count();

    //17
        // List<String> res = Coches.stream().map(Coche::getMarca).distinct().sorted().toList();

    //18
        // Coche res = Coches.stream().filter(c -> c.getAño() > 2015).min(Comparator.comparing(Coche::getPrecio)).orElse(null);

    //19
        // boolean rep = Coches.stream().map(Coche::getMatricula).distinct().count() != coches.size();

    //20
        // List<Coche> top3 = coches.stream().sorted(Comparator.comparing(Coche::getPrecio).reversed()).limit(3).toList();

    //21
        //a
            //List<Coche> todos = Propietarios.stream().flatMap(p -> p.getCoches().stream()).toList();

        //b
            //long total = Propietarios.stream().mapToLong(p -> p.getCoches().size()).sum();

        //c
            /*boolean tieneBMW = propietarios.stream()
                                       .flatMap(p -> p.getCoches().stream())
                                      .anyMatch(c -> c.getMarca().equals("BMW")); */

        //d
        /*boolean tieneBMW = Propietarios.stream()
                .flatMap(p -> p.getCoches().stream())
                .anyMatch(c -> c.getMarca().equals("BMW"));*/

    }


}