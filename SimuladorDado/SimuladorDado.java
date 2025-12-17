package SimuladorDado;


public class SimuladorDado {
    public static void main(String[] args) {
        Dado jogador1 = new Dado("Rômulo");

        jogador1.jogarDado();
        jogador1.jogarDado();
        jogador1.jogarDado();

        jogador1.mostrarEstatisticas();
        Dado.mostrarEstatisticasGlobais();
       
    }
}