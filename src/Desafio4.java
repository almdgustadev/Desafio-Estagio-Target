import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total;
        double porcentagem;

        total = sp + rj+ mg + es + outros;

        System.out.println("De qual estado deseja obter a porcentagem:" +
                "\n1.São Paulo" +
                "\n2.Rio de Janeiro" +
                "\n3.Minas Gerais" +
                "\n4.Espírito Santo" +
                "\n5.Outros.");
        int opcao = input.nextInt();

        switch (opcao){
            case 1:
                porcentagem = (sp/total)*100;
                System.out.printf("São Paulo corresponde %.2f%% do total.%n",porcentagem);
                break;
            case 2:
                porcentagem = (rj/total)*100;
                System.out.printf("Rio de Janeiro corresponde %.2f%% do total.%n",porcentagem);
                break;
            case 3:
                porcentagem = (mg/total)*100;
                System.out.printf("Minas gerais corresponde %.2f%% do total.%n",porcentagem);
                break;
            case 4:
                porcentagem = (es/total)*100;
                System.out.printf("Espírito Santo corresponde %.2f%% do total.%n",porcentagem);
                break;
            case 5:
                porcentagem = (outros/total)*100;
                System.out.printf("Outros corresponde %.2f%% do total.%n",porcentagem);
                break;
            default:
                System.out.println("Opção inválida!");
                break;

        }





    }
}
