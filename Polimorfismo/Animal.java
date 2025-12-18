package Polimorfismo;

public abstract class Animal {
    protected String nomeAnimal;

    public Animal(String nome) {
        nomeAnimal = nome;
    }
    public abstract void som();
    public abstract String pegarNome();
    public abstract void mostrarNome();
}
