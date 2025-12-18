package metodopagamento;

public class BilletPayment extends PaymentMethod {
    private static final double FEE_RATE = 1.10; // 10% de acréscimo
    
    public BilletPayment(String owner, double amount) {
        super(owner, amount);
    }
    
    @Override
    public double calculateFee() {
        return amount * FEE_RATE;
    }
    
    @Override
    public String generateReceipt() {
        double finalValue = calculateFee();
        double fee = finalValue - amount;
        
        StringBuilder receipt = new StringBuilder();
        receipt.append("┌─────────────────────────────────────┐\n");
        receipt.append("│   🧾 RECIBO - PAGAMENTO BOLETO     │\n");
        receipt.append("├─────────────────────────────────────┤\n");
        receipt.append(String.format("│ Cliente: %-27s│\n", owner));
        receipt.append(String.format("│ Valor Original:      R$ %10.2f │\n", amount));
        receipt.append(String.format("│ Taxa (10%%):          R$ %10.2f │\n", fee));
        receipt.append("├─────────────────────────────────────┤\n");
        receipt.append(String.format("│ VALOR FINAL:         R$ %10.2f │\n", finalValue));
        receipt.append("└─────────────────────────────────────┘");
        
        return receipt.toString();
    }
}
