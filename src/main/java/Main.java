public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("10 + 5 = " + calc.add(10,5));
        System.out.println("10 - 5 = " + calc.subtract(10,5) );
        System.out.println("10 * 5 = " + calc.multiply(10,5) );
        System.out.println("10 / 5 = " + calc.divide(10,5) );
    }
}
