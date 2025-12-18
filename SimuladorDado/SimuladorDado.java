package SimuladorDado;


public class SimuladorDado {
    public static void main(String[] args) {
        Dado jogador1 = new Dado("Rômulo");

        for (int i = 0; i < 10000000; i++) {
            jogador1.jogarDado();
        }


        jogador1.mostrarEstatisticas();
        Dado.mostrarEstatisticasGlobais();
       
    }
}