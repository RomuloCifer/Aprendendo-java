package Polimorfismo;

class Gato extends Animal{
    public Gato (String nome) {
        super(nome);
    }
    @Override
    public void som() {
        System.out.println(this.nomeAnimal + " mia");
    }
}
