import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Colecoes2 {
    
    public static void main (String [] args) {
        nomeSexo();
    }

    private static void nomeSexo() {
        HashMap<String, List<String>> gen = new HashMap<String, List<String>>();
        Scanner nomegen = new Scanner(System.in);
        System.out.println("Digite os nomes e gêneros (Ex: Josué-M, Rebeca-F, Bianca-F): ");
        String n = nomegen.nextLine();
        String[] nomeGenero = n.split(",");
        for (String nomeEGenero : nomeGenero) {
            String[] parte = nomeEGenero.split("-"); //Aqui separa o Nome-Genero em duas partes
            String nome = parte[0];     //Aqui seta de acordo com o primeiro index (0)
            String genero = parte[1];   //Aqui seta de acordo com o segundo index (1)
            if (!gen.containsKey(genero)) {
                gen.put(genero, new ArrayList<String>()); //cria uma nova lista com chaves definidas para os gêneros
            }
            gen.get(genero).add(nome); //assimila essas novas chaves com os seus respectivos valores
        }
        System.out.println("Pessoas do sexo masculino: " + gen.get("M"));
        System.out.println("Pessoas do sexo feminino: " + gen.get("F"));
    }
}
