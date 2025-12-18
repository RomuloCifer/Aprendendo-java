# Sistema de Pagamentos

Um sistema simples de processamento de pagamentos em Java que demonstra os conceitos de **Orientação a Objetos**, **Polimorfismo** e **Classes Abstratas**.

## 📋 Descrição

Este projeto implementa diferentes métodos de pagamento (PIX e Boleto) com suas respectivas taxas e descontos. Cada método de pagamento gera um recibo formatado com informações detalhadas da transação.

## 🎯 Conceitos Aplicados

- **Classes Abstratas**: `PaymentMethod` serve como base para todos os métodos de pagamento
- **Polimorfismo**: Diferentes implementações do método `generateReceipt()` e `calculateFee()`
- **Herança**: `PixPayment` e `BilletPayment` herdam de `PaymentMethod`
- **Encapsulamento**: Atributos protegidos e métodos bem definidos

## 📁 Estrutura

```
metodopagamento/
├── PaymentMethod.java    # Classe abstrata base
├── PixPayment.java       # Pagamento via PIX (50% desconto)
├── BilletPayment.java    # Pagamento via Boleto (10% taxa)
└── Main.java             # Classe principal
```

## 💰 Métodos de Pagamento

### PIX
- **Desconto**: 50% sobre o valor original
- **Vantagem**: Pagamento instantâneo com desconto significativo

### Boleto
- **Taxa**: 10% sobre o valor original
- **Característica**: Forma tradicional de pagamento com acréscimo

## 🚀 Como Executar

```bash
# Compile o projeto
javac metodopagamento/*.java

# Execute
java metodopagamento.Main
```

## 📊 Exemplo de Saída

```
╔═════════════════════════════╗
║ SISTEMA DE PAGAMENTOS - JAVA║
╚═════════════════════════════╝

 COMPRA 1: TV
┌─────────────────────────────────────────┐
│         💳 RECIBO - PAGAMENTO PIX       │
├─────────────────────────────────────────┤
│ Cliente: Cleitin                        │
│ Valor Original:           R$  1000.00   │
│ Desconto (50%):           R$   500.00   │
├─────────────────────────────────────────┤
│ VALOR FINAL:              R$   500.00   │
└─────────────────────────────────────────┘

 COMPRA 2: Sofá
┌─────────────────────────────────────────┐
│        🧾 RECIBO - PAGAMENTO BOLETO     │
├─────────────────────────────────────────┤
│ Cliente: Jubiscleita                    │
│ Valor Original:           R$  1000.00   │
│ Taxa (10%):               R$   100.00   │
├─────────────────────────────────────────┤
│ VALOR FINAL:              R$  1100.00   │
└─────────────────────────────────────────┘

════════════════════════
 Obrigado por sua compra!
════════════════════════
```

## 🎓 Aprendizado

Este projeto foi desenvolvido para praticar:
- Criação de hierarquias de classes
- Uso de classes abstratas e métodos abstratos
- Implementação de polimorfismo
- Formatação de strings com `String.format()`
- Uso de `StringBuilder` para construção de strings complexas

## 📝 Notas

- Os valores são formatados com duas casas decimais
- Os recibos utilizam caracteres Unicode para criar bordas bonitas
- O código evita o uso de imports avançados para focar nos conceitos básicos
