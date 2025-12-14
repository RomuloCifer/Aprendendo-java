import java.util.Scanner;
import java.util.ArrayList;

public class CaixinhaDeSom {
    public static void main(String[] args){
        DJ djDaFesta = new DJ();
        Scanner leitor = new Scanner(System.in, "Cp850" );

        System.out.println("=== CAIXINHA DE SOOOOOOOOOOOOOOOOOOOOOOM === ");
        System.out.print("Qual seu nome? ");
        String nome = leitor.nextLine();
        String continuar = "s";
        while (!"n".equals(continuar)) {
            System.out.println("Gostaria de ouvir algo? [s/n]");
            continuar = leitor.nextLine();
            if ("n".equals(continuar)) {
                System.out.print("Fim do programa. Até mais!");
                break;
            }
            System.out.println("Olá " + nome + " o que gostaria de ouvir hoje?");
            System.out.println("1 - Rock");
            System.out.println("2 - Funk");
            System.out.println("3 - Classica");

            System.out.print("Escolha um número: ");
            int escolha = leitor.nextInt();
            leitor.nextLine();// >:( 
            djDaFesta.soltarOSom(escolha);
            }
        leitor.close();
    }
}

class DJ {
    ArrayList<String> playlist;
    public DJ() {
        playlist = new ArrayList<>();
        playlist.add("Rock - Tocando Galinha pintadinha - versão rock");
        playlist.add("FUNK - Tocando Baby shark - versão funk");
        playlist.add("Clássica - Tocando Gaiola das poposudas");
    }
    public void soltarOSom(int NumeroEscolhido) {
        System.out.println("------------------ ");
        int numeroReal = NumeroEscolhido -1;
        if (numeroReal >= 0 && numeroReal < playlist.size());
        System.out.print(playlist.get(numeroReal));
        
        System.out.println("------------------");
    }
}

