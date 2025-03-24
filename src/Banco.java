import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private static List<Conta> clientes = new ArrayList<>();

    public static void adicionarCliente(Conta conta){
        clientes.add(conta);
    }

    public void listaClientes(){
        if(clientes.isEmpty()){
            System.out.println("Não há clientes cadastrados.");

        }else {
            for(Conta cliente:clientes){
                System.out.println(cliente);
            }
        }
    }




}
