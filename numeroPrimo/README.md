# Número Primo

Programa que verifica se um número é primo ou não.

## O que faz

O programa cria uma classe `Calculadora` com um método `ehPrimo(int)` que retorna `true` se o número for primo e `false` caso contrário.

O método verifica:
- Se o número é menor ou igual a 1 (não é primo)
- Se o número é par (não é primo, exceto o 2)
- Testa divisores de 3 até o próprio número

No `main`, o programa testa um número e imprime uma mensagem dizendo se ele é primo ou não.

## Como rodar

```bash
javac primeNumber.java
java primeNumber
```

## Exemplo de saída

Para o número 80:
```
80 não é primo
```

Para um número primo como 7:
```
7 é primo
```

## Conceitos praticados

- Criação de classes e métodos
- Métodos que retornam `boolean`
- Loops (`for`)
- Condicionais (`if/else`)
- Lógica matemática básica
- Operador módulo (`%`)

## Melhorias futuras

- Otimizar o loop testando apenas até a raiz quadrada do número
- Corrigir o caso especial do número 2 (único primo par)
- Adicionar Scanner para o usuário testar diferentes números
- Criar um método que lista todos os primos até N
- Implementar o Crivo de Eratóstenes para maior eficiência
