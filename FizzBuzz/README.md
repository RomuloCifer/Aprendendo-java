# FizzBuzz

Implementação do clássico FizzBuzz com contador de estatísticas ao final.

## O que faz

O programa percorre números de 1 até um limite (neste caso, 500) e imprime:
- **Fizz** se o número é divisível por 3
- **Buzz** se é divisível por 5
- **FizzBuzz** se é divisível por ambos
- O próprio número, caso contrário

No final, exibe um relatório com:
- Quantos números foram divisíveis por 3
- Quantos foram divisíveis por 5
- Quantos foram divisíveis por ambos (3 e 5)

## Como rodar

```bash
javac FizzBuzz.java
java FizzBuzz
```

## O que pratiquei

- Loops (`for`)
- Condicionais (`if/else`)
- Métodos com parâmetros
- Variáveis contadoras para estatísticas
- Operador módulo (`%`) para verificar divisibilidade

## Melhorias futuras

- Permitir que o usuário escolha o limite máximo
- Deixar as palavras "Fizz" e "Buzz" configuráveis
- Aceitar diferentes números divisores (não apenas 3 e 5)
- Adicionar interface com Scanner para entrada do usuário
