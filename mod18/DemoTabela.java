import java.lang.reflect.Field;
import java.util.Arrays;

public class DemoTabela {

    @Tabela(tabela = {"Este é o nome da tabela!"})

    private String tabela;

    public static void main (String [] args) throws NoSuchFieldException {

        DemoTabela demo = new DemoTabela();
        Field field = demo.getClass().getDeclaredField("tabela");
        Tabela campo = field.getAnnotation(Tabela.class);
        if (campo != null) {
            System.out.println("O nome da tabela está recebendo o valor da tabela que é: " + Arrays.toString(campo.tabela()));
        }
    }
}
