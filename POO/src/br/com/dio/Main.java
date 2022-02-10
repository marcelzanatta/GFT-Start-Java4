package br.com.dio;

public class Main {
    public static void main(String[] args) {
        Carro obj = new Carro();
        Carro obj2 = new Carro("Cinza", " M Benz " , 66);


        // Objeto 1
        obj.setCor("Azul");
        obj.setModelo("Gol G4");
        obj.setCapacidadeTanque(59);

        System.out.println(obj.getCor());
        System.out.println(obj.getModelo());
        System.out.println( obj.getCapacidadeTanque());
        System.out.println(obj.totalValorTanque(5.80));

        // Objeto 2
        System.out.println(obj2.getCor());
        System.out.println(obj2.getModelo());
        System.out.println( obj2.getCapacidadeTanque());
        System.out.println(obj2.totalValorTanque(3.80));


    }
}
