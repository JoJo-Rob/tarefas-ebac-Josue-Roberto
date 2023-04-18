// @author Josué Roberto

public class Metodo {

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setCodigo(2781);
        livro.setPreco(32.99);
        livro.setNome("A Cabana");
        livro.setQuantidade(4);
        System.out.println("O código do livro é: " + livro.getCodigo());
        System.out.println("O preço do livro é: " + livro.getPreco());
        System.out.println("O nome do livro é: " + livro.getNome());
        System.out.println("A quantidade desse livro é: " + livro.getQuantidade());
    }
}
