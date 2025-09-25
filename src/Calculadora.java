public class Calculadora {
    private double n1, n2, n, base, exponente, res;

    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN1() {
        return this.n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getN2() {
        return this.n2;
    }

    public void setN(double n) {
        this.n = n;
    }
    public double getN() {
        return this.n;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double getBase() {
        return this.base;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    public double getExponente() {
        return this.exponente;
    }

    public void setRes(double res) {
        this.res = res;
    }
    public double getRes() {
        return this.res;
    }


    public Calculadora() {
    }

    public double sumar(double n1, double n2) {
        res = n1 + n2;

        return res;
    }

    public double restar(double n1, double n2) {
        res = n1 - n2;

        return res;
    }

    public double dividir(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("No se puede dividir un número entre 0.");
        }

        res = n1 / n2;

        return res;
    }

    public double multiplicar(double n1, double n2) {
        res = n1 * n2;

        return res;
    }

    public boolean calcularPar(int n) {
        return n % 2 == 0;
    }

    public boolean calcularPrimo(int n) {
        if (n <= 1) {
            System.out.println("Los números 1 y 0 NO son primos.");
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean esPositivo(int n) {
        return n > 0;
    }

    public double calcularFactorial(int n) {
        double factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        res = factorial;

        return res;
    }

    private int sumarDivisores(int n) {
        int suma = 0;

        for (int divisor = 1; divisor < n; divisor++) {
            if (n % divisor == 0) {
                suma += divisor;
            }
        }

        return suma;
    }

    public boolean calcularPerfecto(int n) {
        return n == sumarDivisores(n);
    }

    public boolean calcularAmigos(int n1, int n2) {
        return sumarDivisores(n1) == n2 && sumarDivisores(n2) == n1;
    }

    public double potencia(double base, int exponente) {
        res = 1;

        for (int i = 0; i < exponente; i++) {
            res *= base;
        }

        return res;
    }
}
