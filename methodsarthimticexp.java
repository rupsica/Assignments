public class Arithmetic {

    public static void main(String[] args) {
        addition(10, 20);
        subtraction(20, 10);
        multiplication(5, 4);
        division(20, 4);
        modulus(10, 3);
    }

    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    public static void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    public static void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    public static void division(int a, int b) {
        int result = a / b;
        System.out.println("Division: " + result);
    }

    public static void modulus(int a, int b) {
        int result = a % b;
        System.out.println("Modulus: " + result);
    }
}
