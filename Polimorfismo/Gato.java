package Polimorfismo;

public class Gato extends Animal{
    public Gato (String nome) {
        super(nome);
    }
    @Override
    public void som() {
        System.out.println(this.nomeAnimal + " mia");
    }
    @Override
    public void mostrarNome() {
        System.out.println(pegarNome());
    }
    @Override
    public String pegarNome() {
        return nomeAnimal;
    };
}
