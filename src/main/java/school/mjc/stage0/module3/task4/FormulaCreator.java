package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a = 10, b = 8;
        double result = 0;
        result = (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * Math.round((a + b - 4 * a * b)/ 2);
        System.out.println("Result: " + result);
        /*double a = 0.0, b = 0.0, result = 0.0;
        result = ((9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * (a + b - 4 * a * b) * 1.0) / 2;
        System.out.println(result);*/
    }
}
