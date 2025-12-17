# CaixinhaDeSom

Um simulador de caixinha de som com DJ que toca músicas de diferentes estilos no terminal.

## O que faz

O programa simula uma interação com um DJ virtual:
1. Pergunta seu nome
2. Pergunta se você quer ouvir algo (s/n)
3. Se sim, você escolhe um estilo musical:
   - 1 - Rock
   - 2 - Funk
   - 3 - Clássica
4. O DJ "toca" uma música do estilo escolhido
5. Pergunta se você quer continuar ouvindo
6. Repete até você digitar "n"

## Como rodar

```bash
javac CaixinhaDeSom.java
java CaixinhaDeSom
```

Siga as instruções no terminal e divirta-se!

## Conceitos praticados

- Uso de `Scanner` para entrada do usuário
- Loops com condição de saída (`while`)
- Estruturas de decisão (`switch/case`, `if/else`)
- `ArrayList` para armazenar músicas
- Validação básica de entrada
- Organização de código com métodos

## Observações

- A playlist é fixa e definida no código
- Apenas 3 estilos musicais disponíveis
- Não há tratamento robusto de erros de entrada

## Ideias de melhoria

- Adicionar mais estilos musicais
- Permitir que o usuário adicione suas próprias músicas
- Randomizar a escolha da música dentro do estilo
- Adicionar opção de ver toda a playlist
- Criar um histórico de músicas tocadas
- Melhorar validação de entradas inválidas
