class Tabuada {
    public static void main(String[] args) {
        int num = 1;
        int soma;

        for (int valor = 1; valor <= 10; valor++) {
            soma = num * valor;
            System.out.println(num + " x " + valor + " = " + soma);
        }
    }
}