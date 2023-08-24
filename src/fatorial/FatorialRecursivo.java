package src.fatorial;

public class FatorialRecursivo {
    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }

    public static void main(String[] args) {
        int numero = 7;
        long resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " = " + resultado);
    }
}
