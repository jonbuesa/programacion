public class Main {
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(12);
        Circunferencia c2 = new Circunferencia(5.67);
        Circunferencia c3 = new Circunferencia(9.3);


        System.out.println("Radio " + c1.getRadio() + "\n" + "Circunferencia c1: " + c1.calcularCircunferencia()  + "\n" +
                " Area: " + c1.calcularArea() + "\n" +
                " Volumen: " + c1.calcularVolume());
    }
}