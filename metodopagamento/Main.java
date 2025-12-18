package metodopagamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔═════════════════════════════╗");
        System.out.println("║ SISTEMA DE PAGAMENTOS - JAVA║");
        System.out.println("╚═════════════════════════════╝");
        System.out.println();
        
        // Compra 1 - Pagamento via PIX
        PaymentMethod tvCompra = new PixPayment("Cleitin", 1000.0);
        System.out.println(" COMPRA 1: TV");
        System.out.println(tvCompra.generateReceipt());
        System.out.println();
        
        // Compra 2 - Pagamento via Boleto
        PaymentMethod sofaCompra = new BilletPayment("Jubiscleita", 1000.0);
        System.out.println(" COMPRA 2: Sofá");
        System.out.println(sofaCompra.generateReceipt());
        System.out.println();
        
        System.out.println("════════════════════════");
        System.out.println(" Obrigado por sua compra!");
        System.out.println("════════════════════════");
    }
}
