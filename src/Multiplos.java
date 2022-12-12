
//Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        int A, N;
        int soma = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        for (int i = 0; i <= N; i++) {
            if (i % A == 0) {
                soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}
