package Polimorfismo;

public class main {
    public static void main(String[] args) {


        Animal[] animais = {new Cachorro("Balofo"), new Gato("Jerry"), new Animal("Animal")};
        for ( Animal animal : animais) {
            animal.som();
        }
        
}}
