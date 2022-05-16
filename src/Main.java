public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 0.13f);
        ComplexNumber b = new ComplexNumber(5, 0.31f);

        //division
        System.out.println(a + " / " + b + " = " + ComplexNumber.complexDivision(a, b));

        //multiplication
        System.out.println(a + " * " + b + " = " + ComplexNumber.complexMultiplication(a, b) + "\n");

        //root
        System.out.println(a.complexRoot(2));

        //sum
        System.out.println(a + " + " + b + " = " + ComplexNumber.complexSum(a, b));

        //subtraction
        System.out.println(a + " - " + b + " = " + ComplexNumber.complexSubtraction(a, b));
    }
}