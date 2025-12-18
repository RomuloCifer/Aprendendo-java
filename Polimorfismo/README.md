# Polimorfismo em Java

Um projeto simples que demonstra o conceito de **Polimorfismo** na Orientação a Objetos através de uma hierarquia de classes de animais.

## 📋 Descrição

Este projeto exemplifica como diferentes classes podem implementar o mesmo método de formas diferentes. Usando animais como exemplo, cada tipo de animal (Cachorro e Gato) produz seu próprio som característico.

## 🎯 Conceitos Aplicados

- **Polimorfismo**: Múltiplas formas de implementar o mesmo método
- **Classes Abstratas**: `Animal` define o contrato que todas as subclasses devem seguir
- **Herança**: `Cachorro` e `Gato` herdam de `Animal`
- **Métodos Abstratos**: Obrigam as subclasses a implementar comportamentos específicos
- **Arrays de Objetos**: Trabalhando com coleções polimórficas
- **Enhanced For Loop**: Iteração simplificada sobre arrays

## 📁 Estrutura

```
Polimorfismo/
├── Animal.java      # Classe abstrata base
├── Cachorro.java    # Implementação concreta - Cachorro
├── Gato.java        # Implementação concreta - Gato
└── main.java        # Classe principal
```

## 🐾 Hierarquia de Classes

```
        Animal (abstrata)
           |
    ┌──────┴──────┐
    |             |
Cachorro        Gato
```

### Animal (Classe Abstrata)
Define a estrutura base:
- `nomeAnimal`: Nome do animal
- `som()`: Método abstrato para o som característico
- `pegarNome()`: Método abstrato para obter o nome
- `mostrarNome()`: Método abstrato para exibir o nome

### Cachorro
- Implementa o som: "late"
- Herda e implementa todos os métodos abstratos

### Gato
- Implementa o som: "mia"
- Herda e implementa todos os métodos abstratos

## 🚀 Como Executar

```bash
# Compile o projeto
javac Polimorfismo/*.java

# Execute
java Polimorfismo.main
```

## 📊 Exemplo de Saída

```
Balofo late
Balofo
Jerry mia
Jerry
```

## 💡 O que é Polimorfismo?

Polimorfismo significa "muitas formas". No código:

```java
Animal[] animais = {new Cachorro("Balofo"), new Gato("Jerry")};
for (Animal animal : animais) {
    animal.som();  // Cada animal faz seu som específico!
}
```

Mesmo que o array seja do tipo `Animal`, quando chamamos `som()`:
- O cachorro **late**
- O gato **mia**

O método correto é chamado baseado no tipo real do objeto, não no tipo da variável.

## 🎓 Aprendizado

Este projeto demonstra:
- Como criar classes abstratas que servem como "contratos"
- Como diferentes classes podem implementar o mesmo método de formas únicas
- Como trabalhar com arrays de objetos polimórficos
- O poder da abstração na Orientação a Objetos
- Como o Java escolhe qual método executar em tempo de execução (late binding)

## 🔄 Extensibilidade

Quer adicionar mais animais? É simples:

```java
public class Pato extends Animal {
    public Pato(String nome) {
        super(nome);
    }
    
    @Override
    public void som() {
        System.out.println(this.nomeAnimal + " grasna");
    }
    
    // ... implementar outros métodos abstratos
}
```

O polimorfismo garante que o novo animal funcionará perfeitamente com o código existente!
