package polimorfismo;

public class Main {
    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[]{ new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for ( ClasseMae clase : classes){
            clase.metodo1();
        }

        System.out.println("");

        for ( ClasseMae clase : classes){
            clase.metodo2();
        }

        System.out.println("");

        // Sobrescrita pq o metodo2 da classe filha2 tem o @Override
        ClasseFilha2 classeFilha2= new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
