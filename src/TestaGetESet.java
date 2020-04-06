public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        System.out.println(conta.getNumero());

        Cliente felipe = new Cliente();
        //conta.titular = felipe; - Maneira antiga de atribuir valor diretamente no atributo

        felipe.setNome("felipe frade"); // Atribuindo "felipe" para o atributo Nome, da classe Cliente
        conta.setTitular(felipe); // Atribuindo o cliente "felipe" para o atributo titular da classe Conta

        System.out.println(conta.getTitular().getNome()); // Buscando o nome do titular da conta, navegando pelo nome do CLIENTE

        conta.getTitular().setProfissao("programador"); //Altera a profissão do titular da conta
        //Agora realizando o mesmo procedimento em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");

        System.out.println(titularDaConta);
        System.out.println(felipe);
        System.out.println(conta.getTitular());
    }
}

// Atribuindo um numero para a conta sem atributos encapsulados:
// conta.numero = 1337;

//Atribuindo valor para atributos encapsulados (private):
//O método abaixo não funcina mais pois agora criamos um construtor Conta e já passamos dentro do new Conta
//conta.setNumero(1337); Chamando o método que atribui valor para o atributo da classe