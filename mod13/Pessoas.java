public class Pessoas {

    public static void main (String [] args) {
        Fisica fisica = new Fisica();
        fisica.setNome("Josué");
        fisica.setContato(988001234);
        fisica.setEndereco("Rua 12 nº456C");
        fisica.setCpf("000.111.222-34");
        fisica.setEstadoCivil("solteiro");
        System.out.println("### Pessoa Física ###");
        System.out.println(fisica.getNome() + " mora no endereço " + fisica.getEndereco()
                + "\nSeu número de telefone é " + fisica.getContato() +
                "\nSeu nº de CPF é " + fisica.getCpf() + "\nSeu estado civil é " + fisica.getEstadoCivil() + ".");

        System.out.println(" ");

        System.out.println("### Pessoa Jurídica ###");
        Juridica empresa = new Juridica();
        empresa.setNome("Grupo Zelo");
        empresa.setContato(32130099);
        empresa.setEndereco("Av General 1019");
        empresa.setCnpj("00.123.444/5679-90");
        empresa.setFormaJuridica("Ltda");
        System.out.println("A empresa " + empresa.getNome() + empresa.getFormaJuridica() +
                "\nEstá no endereço " + empresa.getEndereco()
                + "\nSeu número de telefone é " + empresa.getContato()
                + "\nE seu CNPJ é " + empresa.getCnpj() + ".");
    }
}
