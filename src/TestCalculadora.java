import java.util.Scanner;

public class TestCalculadora {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int opcion, n, exponente;
        double n1, n2, base, resultado;

        do {
            System.out.println("CALCULADORA");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Potencia");
            System.out.println("6) Calcular si un número es par");
            System.out.println("7) Calcular si un número es positivo");
            System.out.println("8) Calcular si un número es primo");
            System.out.println("9) Calcular el factorial de un número");
            System.out.println("10) Calcular si 2 números son amigos");
            System.out.println("11) Calcular si un número es perfecto");
            System.out.println("12) Salir");

            System.out.println();

            System.out.println("Ingresa la opción: ");
            opcion = lector.nextInt();

            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa un valor: ");
                    n1 = lector.nextDouble();
                    calc.setN1(n1);

                    System.out.println();

                    System.out.println("Ingresa el otro valor: ");
                    n2 = lector.nextDouble();
                    calc.setN2(n2);

                    resultado = calc.sumar(n1,n2);

                    System.out.println();

                    System.out.println("La suma es: " + resultado);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ingresa un valor: ");
                    n1 = lector.nextDouble();
                    calc.setN1(n1);

                    System.out.println();

                    System.out.println("Ingresa el otro valor: ");
                    n2 = lector.nextDouble();
                    calc.setN2(n2);

                    resultado = calc.restar(n1,n2);

                    System.out.println();

                    System.out.println("La resta es: " + resultado);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ingresa un valor: ");
                    n1 = lector.nextDouble();
                    calc.setN1(n1);

                    System.out.println();

                    System.out.println("Ingresa el otro valor: ");
                    n2 = lector.nextDouble();
                    calc.setN2(n2);

                    resultado = calc.multiplicar(n1,n2);

                    System.out.println();

                    System.out.println("La multiplicación es: " + resultado);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Ingresa el dividendo: ");
                    n1 = lector.nextDouble();
                    calc.setN1(n1);

                    System.out.println();

                    System.out.println("Ingresa el divisor: ");
                    n2 = lector.nextDouble();
                    calc.setN2(n2);

                    resultado = calc.dividir(n1,n2);

                    System.out.println();

                    System.out.println("El resultado de la division es: " + resultado);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Ingresa la base: ");
                    base = lector.nextDouble();
                    calc.setBase(base);

                    System.out.println();

                    System.out.println("Ingresa el exponente: ");
                    exponente = lector.nextInt();
                    calc.setExponente(exponente);

                    resultado = calc.potencia(base, exponente);

                    System.out.println();

                    System.out.println("El resultado de la potencia es: " + resultado);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Ingresa el número: ");
                    n = lector.nextInt();
                    calc.setN(n);

                    System.out.println();

                    boolean esPar = calc.calcularPar(n);

                    System.out.println(esPar);

                    System.out.println();
                    break;
                case 7:
                    System.out.println("Ingresa el número: ");
                    n = lector.nextInt();
                    calc.setN(n);

                    System.out.println();

                    boolean esPositivo = calc.esPositivo(n);

                    System.out.println(esPositivo);

                    System.out.println();
                    break;
                case 8:
                    System.out.println("Ingresa el número: ");
                    n = lector.nextInt();
                    calc.setN(n);

                    System.out.println();

                    boolean esPrimo = calc.calcularPrimo(n);

                    System.out.println(esPrimo);

                    System.out.println();
                    break;
                case 9:
                    System.out.println("Ingresa el número: ");
                    n = lector.nextInt();
                    calc.setN(n);

                    resultado = calc.calcularFactorial(n);

                    System.out.println();

                    System.out.println("El factorial es: " + resultado);
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Ingresa un número: ");
                    n1 = lector.nextDouble();
                    calc.setN1(n1);

                    System.out.println();

                    System.out.println("Ingresa el otro número: ");
                    n2 = lector.nextDouble();
                    calc.setN2(n2);

                    System.out.println();

                    boolean sonAmigos = calc.calcularAmigos((int) n1, (int) n2);

                    System.out.println(sonAmigos);

                    System.out.println();
                    break;
                case 11:
                    System.out.println("Ingresa el número: ");
                    n = lector.nextInt();
                    calc.setN(n);

                    System.out.println();

                    boolean esPerfecto = calc.calcularPerfecto(n);

                    System.out.println(esPerfecto);

                    System.out.println();
                    break;
                case 12:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        } while (opcion != 12);
    }
}
