public class Main {

    public static void main(String[]args){
        System.out.println(" ----- Operadores Relacionais ------ ");
        System.out.println("'<' - Menor");
        System.out.println("'<=' - Menor Igual");
        System.out.println("'>' - Maior");
        System.out.println("'>=' - Maior Igual");
        System.out.println("'!=' - Diferente");
        System.out.println("'==' - Igual");

        System.out.println(" --- Operadores Logicos --- ");
        System.out.println("'&&' - And logico");
        System.out.println("'||' - Or logico");
        System.out.println("'^' - xor logico, quando os dois resultados comparados sao 'opostos'eh VERDADE");
        System.out.println("'!' - not logico, nega o valor quando posta na frente");

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 ^ b2 : " + (b1^b2));
        System.out.println("b1 ^ b3 : " + (b1^b3));

        mes();
        dia();
    }

    private static void mes(){
        int mes = 9;
        if(mes == 1){
            System.out.println("Janeiro");
        }else if( mes == 2 ){
            System.out.println("Fevereiro");
        }else if ( mes == 3 ){
            System.out.println("Marco");
        }else if ( mes == 4 ){
            System.out.println("Abril");
        }else if ( mes == 5 ){
            System.out.println("Maio");
        }else if ( mes == 6 ){
            System.out.println("Junho");
        }else if ( mes == 7 ){
            System.out.println("Julho");
        }else if ( mes == 8 ){
            System.out.println("Agosto");
        }else if ( mes == 9 ){
            System.out.println("Setembro");
        }else if ( mes == 10 ){
            System.out.println("Outubro");
        }else if ( mes == 11 ){
            System.out.println("NOvembro");
        }else if ( mes == 12 ){
            System.out.println("Dezembro");
        }

    }

    private static void dia(){
        int numero = 4;
        switch (numero){
            case 1:
            case 2:
                System.out.println("Domingo e Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Quinta - Sexta - Sabado");
                break;
            default:
                System.out.println("Dia invalido!!");
                break;
        }
    }
}



