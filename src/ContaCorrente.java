public class ContaCorrente extends Conta{
    static int contaGlobalCorrente = 0;
    int conta;
    String tipo = "CC";

    public ContaCorrente(String nomeCliente) {
        super(nomeCliente);
        conta = ++contaGlobalCorrente;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "Nome titular= " + nomeCliente +
                ", saldo=" + saldo +
                ", agencia=" + agencia +
                ", tipo='" + tipo + '\'' +
                ", conta=" + conta +
                '}';
    }
}
