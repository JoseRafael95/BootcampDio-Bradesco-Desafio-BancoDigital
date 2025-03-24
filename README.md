# BOOTCAMP DIO - Bradesco - Java Cloud Native

## Descrição
Este pequeno projeto foi desenvolvido para um bootcamp, com o objetivo de estudar os conceitos de Programação Orientada a Objetos (POO) e Collections. 
O sistema simula o funcionamento de contas bancárias com diferentes tipos de contas, como Conta Corrente e Conta Poupança.

## Funcionalidades
O sistema permite ao usuário a criação de dois tipos de conta: Conta Corrente e Conta Poupança. Cada conta criada é gerenciada por uma classe Banco.
As contas permitem que o usuário realize as seguintes operações:
1. Depositar um valor no saldo da conta.
2. Sacar um valor da conta, desde que haja saldo suficiente.
3. Transferir um valor para outra conta, desde que haja saldo suficiente.
4. Consultar o saldo da conta.
   
## Tecnologias
Java 23 (versão mais recente)
POO (Programação Orientada a Objetos)
Collections (para manipulação de dados)


## Instalação
1. Clone o repositório:
   ```bash
   git clone https://github.com/usuario/repo.git

2. Compile e execute o projeto:
   ```
   javac Main.java
   java Main
   ```

## Exemplo de Uso

Criação de contas e operações bancárias:
```java
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("João");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria");

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);

        contaCorrente.sacar(200);
        contaCorrente.transferencia(300, contaPoupanca);

        contaCorrente.saldo();
        contaPoupanca.saldo();
    }
}
```
## Referências e Links Úteis
https://github.com/falvojr/lab-banco-digital-oo
