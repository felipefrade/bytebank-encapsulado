public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    //Criando um construtor:
    public Conta(int agencia, int numero){    // int agencia, int numero são construtores da classe conta. Construtores são restrições de inicialização de uma classe conforme as regras do negócio
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta" + this.numero);
    }

    //Declarando um método:
    void deposita(double valor){    //Quando não retorna nada como  resposta, é necessário utilizar o void
        //this.saldo = this.saldo + valor;   Indicando que a conta que ele irá alterar o valor é a conta que invocou o método o new Conta();
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            // this.saldo = this.saldo - valor;   // Forma mais complexa de escrever variavel recebe ela mesma - valor
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    // Método criado para retornar o saldo, pois agora não conseguimos mais acessá-lo pois é do tipo private. Portanto é necessário criar um método para isso.
    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero){
        if (numero <= 0){
            System.out.println("Não pode valor menor ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}
