package br.com.dio.collection.set;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ExercicioProposto01 {
    public static void main(String[] args) {

        Set<String> coresArcoIris = new HashSet<>(Arrays.asList( "Vermelha" , "Laranja" , "Amarelo" , "Verde" , "Azul", "Azul Escuro" , "Violeta" ));

        System.out.println(" ---- Impressao uma em baixo da outra ---- ");
        System.out.println(coresArcoIris);
        System.out.println("");

        for (String cores:
                coresArcoIris)
            System.out.println(cores); {

        }

        System.out.println("");
        System.out.println(" ---- A quantidade de cores que o arco-íris tem ---- ");
        System.out.println(coresArcoIris.size());

        System.out.println("");
        System.out.println("---- Exiba as cores em ordem alfabética ----");

        Set<String> corArcoIris2 = new TreeSet<>( coresArcoIris );
        System.out.println(corArcoIris2);

        System.out.println("");
        System.out.println("---- Exiba as cores na ordem inversa da que foi informada ----");

        List<String> coresArcoIris3 = new ArrayList<>(coresArcoIris);
        Collections.reverse(coresArcoIris3);
        System.out.println(coresArcoIris3);

        System.out.println("");
        System.out.println("---- Exiba todas as cores que começam com a letra ”v” ----");

        for (String cor: coresArcoIris) {
            if (cor.startsWith("V")) System.out.println(cor);
        }

        System.out.println("");
        System.out.println("---- Remova todas as cores que não começam com a letra “v” ----");
/*
        for (String cor: coresArcoIris) {
            if (cor.startsWith("V")) coresArcoIris.remove(cor);
        }
*/

        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().startsWith("V")) iterator2.remove();
        }

        for (String cores:
                coresArcoIris)
            System.out.println(cores); {

        }

        System.out.println("");
        System.out.println("---- Limpe o conjunto ---- ");
        coresArcoIris.clear();

        for (String cores:
                coresArcoIris)
            System.out.println(cores); {

        }
    }
}
