public class CaixinhaDeSom {
    public static void main(String[] args){
        System.out.println("TESTANDOOOOO");
        BestSongs nbs = new BestSongs();
        nbs.PrintSongs();
    }
}

class BestSongs {
    String[] songs = {"BABY", "BABY", "BABY", "OOOOOOOHHHHHHH"};
    void PrintSongs() {
        for (String song : songs) {
            System.out.println(song);
        }
    }
}