

public class Conta implements InterfaceConta{

    protected String nomeCliente;
    protected double saldo = 0;
    protected static int agencia = 101;
    protected String tipo;

    public Conta(String cliente){
        this.nomeCliente = cliente;
        Banco.adicionarCliente(this);
    }

    @Override
    public void sacar(double valor) {
        if(valor <= 0) {
            System.out.println("Digite um valor válido para saque.");
        }else if (valor > saldo) {
            System.out.println("Saldo insuficiente. Seu saldo é de:" + saldo);
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso.");
        }else{
            System.out.println("Digite um valor válido.");
        }
    }

    @Override
    public void transferencia(double valor, Conta contaDestino) {
        if(valor <= 0){
            System.out.println("Digite um valor válido para transferencia.");
        }else if(contaDestino == null){
            System.out.println("Conta destino inválida.");
        }else {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferencia de : R$"+ valor +"  realizada com sucesso!");
        }
        }

    @Override
    public void saldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}





