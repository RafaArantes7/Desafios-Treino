import java.util.Scanner;

/*Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas. 
 */

public class NumerosIguais {
    public static void main(String[] args) {
        int primeiroNumero;
        int segundoNumero;

        Scanner leitorScanner = new Scanner(System.in);
        primeiroNumero = leitorScanner.nextInt();
        segundoNumero = leitorScanner.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }
    }
}
