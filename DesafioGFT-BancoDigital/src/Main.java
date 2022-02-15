import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cliente cliente = new Cliente();

        for ( int i = 0 ; i<2; i++){
            System.out.println("Digite o nome do cliente: ");
            String nome = scan.next();

            cliente.setNome(nome);
            Conta contaCC = new ContaCorrente(cliente); // Cria objeto ja chamando o construtor
            Conta contaPP = new ContaPoupanca(cliente); // Cria objeto ja chamando o construtor

            contaCC.depositar(1000);
            contaCC.transferir(300,contaPP);

            contaCC.imprimirExtrato();
            contaPP.imprimirExtrato();


        }

    }
}
