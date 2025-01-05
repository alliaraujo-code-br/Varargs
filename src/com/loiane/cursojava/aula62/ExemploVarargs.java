public class ExemploVarargs {

    public static void main(String[] args) {
        System.out.println(soma(1, 2)); // Soma de dois números
        System.out.println(soma(1, 2, 3)); // Soma de três números

        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println(soma(vetor)); // Soma de um array

        System.out.println(soma(1, 2, 3, 4, 5)); // Soma com varargs
    }

    static int soma(int a, int b) {
        return a + b;
    }

    static int soma(int a, int b, int c) {
        return a + b + c;
    }

    // Usando varargs para simplificar
    static int soma(int... vetor) {
        int total = 0;
        for (int numero : vetor) {
            total += numero;
        }
        return total;
    }
}
