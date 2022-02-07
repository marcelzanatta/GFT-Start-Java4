package dio.metodo;

public class Mensagem {
    public static void showMensagem(int hora){

        if(hora>5 && hora<12){
            System.out.println("Bom dia!!!");
        }else if ( hora >= 13 && hora < 19 ){
            System.out.println("Boa tarde!!");
        }else{
            System.out.println("Boa noite!!");
        }

    }
}
