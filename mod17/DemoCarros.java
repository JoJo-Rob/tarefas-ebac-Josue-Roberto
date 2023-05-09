import java.util.ArrayList;
import java.util.List;

public class DemoCarros {

    public static void main (String [] args) {

        Toyota toyota = new Toyota();
        Honda honda = new Honda();
        Vollkswagen vollkswagen = new Vollkswagen();

        List<Carro> lista = new ArrayList<>();
        lista.add(toyota);
        lista.add(honda);
        lista.add(vollkswagen);

        for (Carro carro : lista) {
           carro.modelos();
        }

    }
}
