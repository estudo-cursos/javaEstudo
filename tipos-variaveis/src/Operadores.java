public class Operadores {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 < numero2)
            System.out.println("a nossa condição é verdadeira!");

        boolean simNao = numero1 == numero2;

        System.out.println("O número 1 é igual ao número 2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("O número 1 é diferente do número 2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("O número 1 é maior que o número 2? " + simNao);
    }
}
