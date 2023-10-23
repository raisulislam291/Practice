public class piCalculator {
    public static void main(String[] args) {
        PiCalculator piCalculator = new piCalculator();
        var pi = piCalculator.calculate(100_000);
        System.out.println("Pi: "+ pi);
    }

    
}
