package dio.metodo;

public class CalculoArea {

    public static void area(int l){
        System.out.println("Calculo area Quadrado(1 parametro): "+ (l*l));
    }

    public static void area(int b, int h){
        System.out.println("Calculo area Retangulo(2 paramentros int ): " +(b*h));
    }

    public static void area(float b, float h){
        System.out.println("Calculo area Retangulo(2 paramentros float ): " +(b*h));
    }

    public static void area( int baseOne, int baseTwo, int h){
        System.out.println("Calculo area Trapezio(3 parametros): " + (( baseOne+baseTwo)*h)/2 );
    }
    public static double areaTriangulo(int b, int h){
        return b*h/2;
    }
}
