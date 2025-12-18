package Polimorfismo;

public class Animal {
    protected String nomeAnimal;
    public Animal(String nome) {
        nomeAnimal = nome;
    }
    public void som() {
        System.out.println("Som de animal");
    }
}
