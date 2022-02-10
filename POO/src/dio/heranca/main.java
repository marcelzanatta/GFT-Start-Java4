package dio.heranca;

public class main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();  // Criando Obj funcionario

            // Upcast - Cria um objeto transformando classe Filha / classe Mae
            Funcionario faxineiro = new Faxineiro();
            Funcionario gerente = new Gerente();
            Funcionario vendedor = new Vendedor();

            // Downcast
            Vendedor vendedorDown = (Vendedor) new Funcionario();

    }
}
