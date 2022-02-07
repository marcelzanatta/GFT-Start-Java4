package dio.metodo;

public class Emprestimo {
    public static void calcula(double valor, int parcela){

        if(parcela<=2){
            valor *= 1.1;
        }else if ( parcela > 2 && parcela <5){
            valor *= 1.5;
        }else {
            valor *= 2;
        }

        System.out.println(" valor todal do emprestimo fica em: " + valor);
    }

    public static int getParcelas(){
        return 1;
    }
}
