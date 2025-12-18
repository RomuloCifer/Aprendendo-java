package metodopagamento;

/**
 * Classe abstrata que representa um método de pagamento
 * Define a estrutura base para diferentes tipos de pagamento
 */
public abstract class PaymentMethod {
    protected String owner;
    protected double amount;
    
    public PaymentMethod(String owner, double amount) {
        this.owner = owner;
        this.amount = amount;
    }
    
    /**
     * Calcula o valor final com taxas aplicadas
     * @return valor final após aplicação de taxas
     */
    public abstract double calculateFee();
    
    /**
     * Gera um recibo formatado do pagamento
     * @return recibo em formato String
     */
    public abstract String generateReceipt();
}
