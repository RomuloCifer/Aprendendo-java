import java.util.Scanner;

public class CaixinhaDeSom {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in, "Cp850" );

        System.out.println("=== CAIXINHA DE SOOOOOOOOOOOOOOOOOOOOOOM === ");
        System.out.print("Qual seu nome? ");
        String nome = leitor.nextLine();

        System.out.println("Olá" + nome + " o que gostaria de ouvir hoje?");
        System.out.println("1 - Rock");
        System.out.println("2 - Funk");
        System.out.println("3 - Classica");

        System.out.print("Escolha um número: ");
        int escolha = leitor.nextInt();

        System.out.println("------------------ ");
        if (escolha == 1) {
            System.out.println("Rock - Tocando Galinha pintadinha - versão rock");
        } else if (escolha == 2) {
            System.out.println("FUNK - Tocando Baby shark - versão funk");
        } else if (escolha == 3) {
            System.out.println("Clássica - Tocando Gaiola das poposudas");
        } else {
            System.out.println("Opção inválida, escolha 1, 2 ou 3.");
        }
        System.out.print("------------------");
        leitor.close();
    }
}
