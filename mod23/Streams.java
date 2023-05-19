import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Josué", "Masculino"));
        pessoas.add(new Pessoa("Rebeca", "Feminino"));
        pessoas.add(new Pessoa("Bianca", "Feminino"));
        pessoas.add(new Pessoa("Rodrigo", "Masculino"));
        pessoas.add(new Pessoa("Isabelle", "Feminino"));

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " - Sexo: " + pessoa.getSexo());
        }
        System.out.println(" ");
        System.out.println("### Lista de mulheres ###");

        List<Pessoa> mulheres = pessoas.stream().filter(p -> p.getSexo().equalsIgnoreCase("feminino"))
                .collect(Collectors.toList());

        mulheres.stream().map(Pessoa::getNome).forEach(System.out::println);
    }
}