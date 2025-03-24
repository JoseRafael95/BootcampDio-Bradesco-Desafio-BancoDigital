public class Main {
    public static void main(String[] args) {
        // Criando novas contas
        Conta conta1 = new ContaCorrente("João");
        Conta conta2 = new ContaPoupanca("Maria");

        // Realizando operações
        conta1.depositar(500);
        conta1.sacar(100);
        conta1.transferencia(200, conta2);

        // Consultando saldo
        conta1.saldo();
        conta2.saldo();
    }
}