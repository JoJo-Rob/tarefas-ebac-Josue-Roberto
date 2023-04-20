package br.com.jojo;

public class Conversao {

    public static void main (String [] args) {
        realizarConversao();
    }

    private static void realizarConversao() {

        long num = 1234567890;
        System.out.println(num);
        System.out.println("** Após converter a variável do tipo primitivo para o tipo wrapper **");
        Long num1 = num;
        System.out.println(num1);

    }
}
