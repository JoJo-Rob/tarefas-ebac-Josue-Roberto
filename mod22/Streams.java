import java.util.*;

public class Streams {

    public static void main(String[] args) {
        nomeSexo();
    }

    private static void nomeSexo() {

        Scanner nomegen = new Scanner(System.in);
        System.out.println("Digite os nomes e gêneros (Ex: Josué,M; Rebeca,F; Bianca,F): ");
        String n = nomegen.nextLine().replaceAll(" ", ""); //retira todos os espaços
        String[] nomeGenero = n.split(";");
        System.out.println(" ");

        System.out.println("### Lista de mulheres ###");
        List.of(nomeGenero).stream()
                .filter(s -> s.contains("F"))
                .map(m -> m.substring(0, m.length() - 2)) //exclui a ',' e o sexo "F"
                .forEach(sexo -> System.out.println(" -> " + sexo));
    }
}