package Polimorfismo;

public class Cachorro extends Animal{
    public Cachorro(String nome){
        super(nome);
    }
    @Override
    public void som() {
        System.out.println(this.nomeAnimal +" late");
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
