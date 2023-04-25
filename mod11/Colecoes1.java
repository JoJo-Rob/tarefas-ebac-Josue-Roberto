import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Colecoes1 {
    
    public static void main (String [] args) {
        System.out.println("### Lista de nomes ###");
        parteNomes();
        System.out.println(" ");
        System.out.println("### Lista de nomes por sexo ###");
        parteSexo();
    }

    private static void parteNomes() {
        Scanner nome = new Scanner(System.in);
        nome.useDelimiter("\n"); // utilizando um método para não ignorar espaços
        System.out.println("Digite os nomes separados por vírgula (Ex: Josué, Roberto, Santana): ");
        String n = nome.nextLine();
        String[] name = n.split(", ");
        ArrayList<String> nnn = new ArrayList<String>(List.of(name)); //criando uma lista imutável
        Collections.sort(nnn); //colocando em ordem alfabética
        System.out.println("Nomes em ordem alfabética: " + nnn);

    }

    private static void parteSexo() {
        HashMap<String, List<String>> gen = new HashMap<String, List<String>>();
        Scanner nomegen = new Scanner(System.in);
        System.out.println("Digite os nomes e gêneros (Ex: Josué-M, Rebeca-F, Bianca-F): ");
        String n = nomegen.nextLine();
        String[] nomeGenero = n.split(",");
        for (String nomeEGenero : nomeGenero) {  //Cria uma variável que possa ser partida pra cada elemento do nomeGenero
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
