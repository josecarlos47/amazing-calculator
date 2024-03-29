import java.util.Scanner;

public class IncredibleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner();

        System.out.println("Selecciona la operación que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (división entera)");
        System.out.println("5. Dividir (división con decimales)");

        int opcion = leerEnteroEntrada();
        int resultado;
        int entero1;
        int entero2;
        String aux;


        switch (opcion) {
            case 1: //Sumar. Debes leer dos numeros enteros de entrada e imprimir su suma

                    System.out.println("Diga un número");
                    aux=sc.nextLine();
                    entero1=Integer.parseInt(aux);

                    System.out.println("Diga un número");
                    aux=sc.nextLine();
                    entero2=Integer.parseInt(aux);

                    resultado=entero1+entero2;

                    System.out.println(resultado);


                    break;
            case 2: // Restar. Debes leer dos números enteros de entrada e imprimir su resta
            
            System.out.println("Esto deberia restar");

                    break;
            case 3: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su producto.
                    break;
            case 4: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su división entera.
                    break;
            case 5: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su división con decimales.
                    break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un número entero!");
            System.exit(1);
            return -1;
        }

    }

}