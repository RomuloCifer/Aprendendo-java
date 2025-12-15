public class primeNumber {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        if (calc.ehPrimo(79)) {
            System.out.println("É primo sim :D");
        } else {
            System.out.println("É primo não :C");
        }
    }
}
class Calculadora {
    public boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int n = 2; n < numero; n++) {
            if (numero % n == 0) {
                return false;
            }
        }
        return true;
    }
}