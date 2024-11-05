import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número que deseja consultar: ");
        int numero = input.nextInt();
        int a = 0;
        int b = 1;

        while(b < numero ){
            int temporaria = b;
            b = a+b;
            a = temporaria;
        }
        if (b== numero || numero == 0){
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
        }else {
            System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");
        }
    }
}
