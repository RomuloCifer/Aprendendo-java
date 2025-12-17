# Simulador de Dado

Programa que simula lançamentos de dados e registra estatísticas individuais e globais.

## O que faz

O programa cria um sistema de simulação de dados com duas classes:
- **Dado**: representa um dado de 6 lados que pode ser lançado
- **SimuladorDado**: classe principal que executa os lançamentos

Cada instância de `Dado` tem um jogador associado e mantém:
- Estatísticas individuais (quantos lançamentos esse jogador fez e frequência de cada lado)
- Estatísticas globais compartilhadas (total de lançamentos e frequência geral, somando todos os jogadores)

## Como funciona

1. Cria um jogador com nome
2. Lança o dado quantas vezes quiser usando `jogarDado()`
3. Cada lançamento gera um número aleatório de 1 a 6
4. As estatísticas são atualizadas automaticamente
5. No final, exibe:
   - Estatísticas individuais do jogador
   - Estatísticas globais de todos os lançamentos

## Como rodar

```bash
javac SimuladorDado/*.java
java SimuladorDado.SimuladorDado
```

## Exemplo de saída

```
Jogador: JogadorUm
Lançamentos: 3
Lado 1: 1
Lado 2: 0
Lado 3: 1
Lado 4: 0
Lado 5: 1
Lado 6: 0
Total de lançamentos: 3
Lado: 1: 1
Lado: 2: 0
Lado: 3: 1
Lado: 4: 0
Lado: 5: 1
Lado: 6: 0
```

## Conceitos praticados

- Orientação a objetos (classes e objetos)
- Atributos de instância vs. atributos estáticos (`static`)
- Métodos de instância vs. métodos estáticos
- Arrays para armazenar contadores
- Geração de números aleatórios com `Math.random()`
- Construtores
- Packages

## Melhorias futuras

- Criar múltiplos jogadores e comparar estatísticas
- Adicionar método para lançar múltiplos dados de uma vez
- Calcular porcentagens de cada lado
- Adicionar interface com Scanner para escolher número de lançamentos
- Criar dados com diferentes números de lados (d4, d8, d12, d20)
- Salvar histórico de cada lançamento individual
- Adicionar gráficos de distribuição
