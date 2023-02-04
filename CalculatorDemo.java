public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int resultOfSum = calculator.sum(40,10);
        System.out.println(resultOfSum);

        int resultOfMinus = calculator.minus(22,10);
        System.out.println(resultOfMinus);

        int resultOfDiv = calculator.div(10,5);
        System.out.println(resultOfDiv);

        int resultOfMultip = calculator.multip(7,3);
        System.out.println(resultOfMultip);
    }
}
