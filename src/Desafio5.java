import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva a palavra que deseja inverter:");
        String exemplo = input.nextLine();
        String inversa = "";
        for (int i = exemplo.length()-1; i>= 0; i--){
            inversa += exemplo.charAt(i);
        }

        System.out.println("A palavra invertida ficou: " + inversa);
    }
}
