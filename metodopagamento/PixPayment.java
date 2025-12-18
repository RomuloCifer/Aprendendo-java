package metodopagamento;

public class PixPayment extends PaymentMethod {
    private static final double FEE_RATE = 0.50; // 50% de desconto
    
    public PixPayment(String owner, double amount) {
        super(owner, amount);
    }
    
    @Override
    public double calculateFee() {
        return amount * FEE_RATE;
    }
    
    @Override
    public String generateReceipt() {
        double finalValue = calculateFee();
        double discount = amount - finalValue;
        
        StringBuilder receipt = new StringBuilder();
        receipt.append("┌─────────────────────────────────────┐\n");
        receipt.append("│    💳 RECIBO - PAGAMENTO PIX       │\n");
        receipt.append("├─────────────────────────────────────┤\n");
        receipt.append(String.format("│ Cliente: %-27s│\n", owner));
        receipt.append(String.format("│ Valor Original:      R$ %10.2f │\n", amount));
        receipt.append(String.format("│ Desconto (50%%):      R$ %10.2f │\n", discount));
        receipt.append("├─────────────────────────────────────┤\n");
        receipt.append(String.format("│ VALOR FINAL:         R$ %10.2f │\n", finalValue));
        receipt.append("└─────────────────────────────────────┘");
        
        return receipt.toString();
    }
}
