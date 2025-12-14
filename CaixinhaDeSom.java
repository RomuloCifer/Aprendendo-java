import java.util.Scanner;

public class CaixinhaDeSom {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== CAIXINHA DE SOOOOOOOOOOOOOOOOOOOOOOM === ");
        System.out.print("Qual seu nome? ");
        String nome = leitor.nextLine();

        System.out.println("Olá" + nome + "o que gostaria de ouvir hoje?");
        System.out.print("1 - Rock");
        System.out.print("2 - Funk");
        System.out.print("3 - Classica");

        System.out.println("Escolha um número: ");
        int escolha = leitor.nextInt();

        if (escolha == 1) {
            System.out.print("Rock - Tocando Galinha pintadinha - versão rock");
        } else if (escolha == 2) {
            System.out.print("FUNK - Tocando Baby shark - versão funk");
        } else if (escolha == 3) {
            System.out.print("Clássica - Tocando Gaiola das poposudas");
        } else {
            System.out.print("Opção inválida, escolha 1, 2 ou 3.");
        }
    }
}
