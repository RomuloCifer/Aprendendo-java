# FizzBuzz

Implementação do clássico FizzBuzz totalmente configurável, com contador de estatísticas ao final.

## O que faz

O programa permite que você personalize completamente o jogo FizzBuzz:
- Escolha o **limite máximo** de números
- Defina os **divisores** (não precisa ser 3 e 5)
- Customize as **palavras** (não precisa ser "Fizz" e "Buzz")

O programa percorre números de 1 até o limite escolhido e imprime:
- A primeira palavra se o número é divisível pelo primeiro divisor
- A segunda palavra se é divisível pelo segundo divisor
- Ambas as palavras juntas se é divisível por ambos
- O próprio número, caso contrário

No final, exibe um relatório com:
- Quantos números foram divisíveis pelo primeiro divisor
- Quantos foram divisíveis pelo segundo divisor
- Quantos foram divisíveis por ambos

## Como rodar

```bash
javac FizzBuzz.java
java FizzBuzz
```

O programa irá solicitar:
1. O limite máximo
2. O primeiro divisor e sua palavra
3. O segundo divisor e sua palavra

Exemplo de uso:
```
Digite o limite máximo: 100
Digite o primeiro divisor: 3
Digite a palavra para o primeiro divisor: Fizz
Digite o segundo divisor: 5
Digite a palavra para o segundo divisor: Buzz
```

## O que pratiquei

- Loops (`for`)
- Condicionais (`if/else`)
- Métodos com múltiplos parâmetros
- Variáveis contadoras para estatísticas
- Operador módulo (`%`) para verificar divisibilidade
- Entrada de dados com `Scanner`
- Manipulação de Strings

## Melhorias implementadas

✅ Usuário escolhe o limite máximo
✅ Palavras "Fizz" e "Buzz" configuráveis
✅ Divisores configuráveis (não apenas 3 e 5)
✅ Interface com Scanner para entrada do usuário
