import org.junit.Assert;
import org.junit.Test;

public class StreamsTeste {

    @Test
    public void testeMostrarLista() {

        Pessoa pessoa = new Pessoa();
        pessoa.adicionarSexo("Feminino");
        Assert.assertEquals("Feminino",pessoa.getSexo());
    }

    @Test
    public void testeNaoMostrarLista() {

        Pessoa pessoa = new Pessoa();
        pessoa.adicionarSexo("Feminino");
        Assert.assertNotEquals("Masculino",pessoa.getSexo());
    }
}