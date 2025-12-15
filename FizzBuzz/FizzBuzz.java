public class FizzBuzz {
    public static void main(String[] args){
    executarFizzBuzz(500);
}
    static void executarFizzBuzz(int limite) {
        int Fizz = 0;
        int Buzz = 0;
        int FizzBuzz = 0;
        for (int i=1; i < limite; i++) {
            if ( i % 15 == 0) {
                System.out.println("FizzBuzz");
                FizzBuzz ++;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                Fizz ++;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                Buzz ++;
            } else {
                System.out.println(i + "!");
            }
        }
        System.out.println("Números Divisíveis por três " + Fizz );
        System.out.println("Números divisíveis por cinco: " + Buzz);
        System.out.println("Números divisíveis por três e por cincoDois contos: " + FizzBuzz);
    }
    
}
