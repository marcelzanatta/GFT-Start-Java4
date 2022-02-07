package br.com.dio;

public class Main {
    public static void main(String[] args){
        int i = 2;
        final int J = 10; //variavel sempre tera o valor 10
        int asrn24678md = 10;

        int quantidadeProduto = 50;
        final int NUMERO_TENTATIVAS = 5;

        System.out.println("valor de i: " + i);
        System.out.println("valor J: " + J);
        System.out.println("valor asrn24678md: " + asrn24678md);
        System.out.println("valor quantidadeProduto: " + quantidadeProduto);
        System.out.println("valor NUMERO_TENTATIVAS: " + NUMERO_TENTATIVAS);

        byte b1 = 10;
        byte b2 = 20;
        short s1 = 2000;
        int i1 = 28500;
        long l1 = 10000000000000L;
        float f1 = 4.5F;
        double d1 = 85.69D;
        char c1 = 'M';
        
        String st1 = "Marcel";
        String st2 = "Marcel eh fechado com Jesus";
        
        String dt = "28/08/1986";
        
        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println();

        System.out.println("b1: "+ b1);
        System.out.println("b2: " + b2);
        System.out.println("s1: "+ s1);
        System.out.println("i1: " + i1);
        System.out.println("l1: " + l1);
        System.out.println("f1: " + f1);
        System.out.println("d1: " + d1);
        System.out.println("c1: " + c1);
        System.out.println("st1: " + st1);
        System.out.println("st2: " + st2);
        System.out.println("dt: " + dt);
        System.out.println("bo1: " + bo1);
        System.out.println("bo2: " + bo2);

        int k = 10;
        int x = --k;
        int y = k--;
        int z = k;

        System.out.println("k: " + k );
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);

        int c = 2;

        c *= z +=5;  // execucao por precedencia, primeiro +=

        System.out.println("valor c: " + c );


        // Conversoes

        byte x1;
        short sx1 = 100;
        x1 = (byte) sx1;

        System.out.println("valor x1: " + x1);



    }
}
