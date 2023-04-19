public class Media {

    public static void main (String [] args) {

        calcularMedia();
    }

    private static void calcularMedia() {
        double num1 = 7.00;
        double num2 = 2.50;
        double num3 = 8.50;
        double num4 = 4.20;
        double num5 = (num1 + num2 + num3 + num4) / 4;
        System.out.println("A média final do aluno é: " + num5);

        // O exercício não pediu, mas vou adicionar um condicional pra dizer se ele foi aprovado ou não

        double media = 6.00; // Eu poderia só colocar num5>=6.00, mas preferi declarar uma variável
        if (num5 >= media) {
            System.out.println("O aluno está aprovado!");
        } else {
            System.out.println("O aluno está reprovado!");
        }

    }
}
