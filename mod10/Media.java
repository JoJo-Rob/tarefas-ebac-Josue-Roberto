import java.util.Scanner;

// Utilizar ',' ao invés de '.' ; não sei porquê o Scanner está dando erro ao utilizar o '.'

public class Media {
    private static Double nota1;
    private static Double nota2;
    private static Double nota3;
    private static Double nota4;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Deseja consultar a média de algum aluno?[s/n] ");
        String resposta = s.next();

        while(resposta.equalsIgnoreCase("s")) {
            Scanner nota = new Scanner(System.in);
            System.out.print("Digite a 1º nota: ");
            nota1 = nota.nextDouble();
            nota = new Scanner(System.in);
            System.out.print("Digite a 2º nota: ");
            nota2 = nota.nextDouble();
            nota = new Scanner(System.in);
            System.out.print("Digite a 3º nota: ");
            nota3 = nota.nextDouble();
            nota = new Scanner(System.in);
            System.out.print("Digite a 4º nota: ");
            nota4 = nota.nextDouble();
            calcularMedia();

            System.out.println("Deseja consultar a média de algum outro aluno?[s/n] ");
            resposta = s.next();
        }
    }

    public static void calcularMedia() {
        Double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);
        if (media >= 7.0) {System.out.println("O aluno está aprovado!");}
        else if (media >= 5.0) {System.out.println("O aluno está de recuperação!");}
        else {System.out.println("O aluno está reprovado!");}
    }
}