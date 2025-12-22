import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Configurações básicas do jogo
        System.out.print("Digite o limite máximo: ");
        int limite = scanner.nextInt();
        
        System.out.print("Digite o primeiro divisor: ");
        int divisor1 = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer
        
        System.out.print("Digite a palavra para o primeiro divisor: ");
        String palavra1 = scanner.nextLine();
        
        System.out.print("Digite o segundo divisor: ");
        int divisor2 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite a palavra para o segundo divisor: ");
        String palavra2 = scanner.nextLine();
        
        System.out.println("\n--- Iniciando FizzBuzz ---\n");
        
        executarFizzBuzz(limite, divisor1, divisor2, palavra1, palavra2);
        
        scanner.close();
    }
    
    static void executarFizzBuzz(int limite, int divisor1, int divisor2, String palavra1, String palavra2) {
        int contadorPalavra1 = 0;
        int contadorPalavra2 = 0;
        int contadorAmbos = 0;
        
        for (int i = 1; i <= limite; i++) {
            // Verifica se é divisível por ambos
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                System.out.println(palavra1 + palavra2);
                contadorAmbos++;
            } else if (i % divisor1 == 0) {
                System.out.println(palavra1);
                contadorPalavra1++;
            } else if (i % divisor2 == 0) {
                System.out.println(palavra2);
                contadorPalavra2++;
            } else {
                System.out.println(i + "!");
            }
        }
        
        // Relatório final
        System.out.println("\n--- Estatísticas ---");
        System.out.println("Números divisíveis por " + divisor1 + ": " + contadorPalavra1);
        System.out.println("Números divisíveis por " + divisor2 + ": " + contadorPalavra2);
        System.out.println("Números divisíveis por ambos (" + divisor1 + " e " + divisor2 + "): " + contadorAmbos);
    }
}
