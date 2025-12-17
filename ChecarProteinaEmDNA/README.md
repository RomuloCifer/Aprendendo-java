# Checar Proteína em DNA

Programa que verifica se uma sequência de DNA contém uma proteína válida.

## O problema

Uma proteína válida em uma sequência de DNA precisa atender alguns critérios:
- Começar com o códon de início **"ATG"**
- Terminar com o códon de parada **"TGA"**
- A sequência entre ATG e TGA deve ter um tamanho múltiplo de 3

O programa também lida com casos onde o "ATG" não está no início da string, mas sim em alguma posição intermediária.

## O que o código faz

O programa define várias sequências de DNA de exemplo e verifica cada uma delas usando o método `checarProteina()`. Para cada sequência, ele imprime `true` (contém proteína válida) ou `false` (não contém).

A lógica verifica:
1. Se existe "ATG" na sequência
2. Se a sequência tem pelo menos 6 caracteres (tamanho mínimo)
3. Se termina com "TGA"
4. Se a parte entre ATG e TGA é divisível por 3

## Como rodar

```bash
javac DNA.java
java DNA
```

## Conceitos praticados

- Manipulação de strings (`indexOf`, `substring`, `equals`)
- Arrays de strings
- Loops (`for-each`)
- Métodos que retornam boolean
- Condicionais múltiplas
- Lógica de validação
