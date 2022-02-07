package dio.metodo;

public class Main {
    public static void main(String[]args){

        System.out.println("--- Calculadora ---");

        Calculadora.soma(2,5);
        Calculadora.subtracao(10,3);
        Calculadora.multiplicacao(5,4);
        Calculadora.divisao(16,2);


        System.out.println(" --- Mensagem ---");

        Mensagem.showMensagem(14);

        System.out.println(" --- Emprestimo ---");

        Emprestimo.calcula(1000,1);
        Emprestimo.calcula(1000,3);
        Emprestimo.calcula(1000,6);

        Emprestimo.calcula(2000,Emprestimo.getParcelas());

        System.out.println(" --- Calculo Quadrilatero ---");

        CalculoArea.area(2);
        CalculoArea.area(2,3);
        CalculoArea.area(3f,4f);
        CalculoArea.area(5,4,2);

        double resultAreaTriagulo = CalculoArea.areaTriangulo(2,4);

        System.out.println("Valor da Area do triangulo: " + resultAreaTriagulo);

    }
}
