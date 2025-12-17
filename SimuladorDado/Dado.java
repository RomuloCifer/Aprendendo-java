package SimuladorDado;

public class Dado {
    String nomeJogador;
    // estatisticas individuais
    int jogLancamentos = 0;
    int[] jogLados = new int[6];
    //estatisticas globais
    static int totalLancamentos = 0;
    static int[] totalLados = new int[6];

    public Dado(String nome) {
        this.nomeJogador = nome;
    }
    public int jogarDado() {
        int valorDado = (int)(Math.random() * 6) +1;
        //LOCAL
        jogLancamentos ++;
        jogLados[valorDado -1]++;
        //GLOBAL
        totalLancamentos ++;
        totalLados[valorDado-1]++;
        return valorDado;
    }
    public void mostrarEstatisticas() {
        System.out.println("Jogador: " + nomeJogador);
        System.out.println("Lançamentos: " + jogLancamentos);

        for (int i = 0; i < jogLados.length; i++) {
            System.out.println("Lado " + (i + 1) + ": " + jogLados[i]);
        }
    }
    public static void mostrarEstatisticasGlobais() {
        System.out.println("Total de lançamentos: " + totalLancamentos);

        for (int i = 0; i < totalLados.length; i++) {
            System.out.println("Lado: " + (i+1) + ": " +  totalLados[i]);
        }
    }
    
}
