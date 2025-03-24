public class ContaPoupanca extends Conta{

    static int contaGlobalPoupanca;
    String tipo = "CP";
    int conta;
    public ContaPoupanca(String nomeCliente){
        super(nomeCliente);
        this.conta = ++contaGlobalPoupanca;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "Nome titular= " + nomeCliente +
                ", saldo=" + saldo +
                ", agencia=" + agencia +
                ", tipo='" + tipo + '\'' +
                ", conta=" + conta +
                '}';
    }
}
