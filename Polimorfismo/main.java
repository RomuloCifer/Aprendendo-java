package Polimorfismo;

public class main {
    public static void main(String[] args) {


        Animal[] animais = {new Cachorro("Balofo"), new Gato("Jerry")};
        for ( Animal animal : animais) {
            animal.som();
            animal.mostrarNome();
        }
        
}}
