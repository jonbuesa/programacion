import com.sun.source.doctree.EscapeTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Estudio[] estudio = new Estudio[3];
    public static void main(String[] args) {


        Estudio c1 = new Estudio("Universal","Wasington","LA","www.universal.com",1995,"EEUU",999999999);
        Estudio c2 = new Estudio("Century","Madrid","Vallecas","www.century.com",1920,"España",111111111);
        Estudio c3 = new Estudio("Walt Disney","Paris","Calle Francia", "www.wd.com",1935,"Francia",444444444);

        c1 = estudio[0];
        c2 = estudio[1];
        c3 = estudio[2];

        Pelicula p1 = new Pelicula("ET",1978,160,"Ciencia Ficcion");
        Pelicula p2 = new Pelicula("Titanic",1969,210,"Amor");
        Pelicula p3 = new Pelicula("Mortadelo Y Filemon",1999,200,"Comedia");


    }
}