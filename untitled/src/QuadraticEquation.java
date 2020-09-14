import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return 0;
        }
        return ((-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a));
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return 0;
        }
        return ((-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a));
    }

    public static void main(String[] args) {
        System.out.println("Solve quadratic equation a * x^2 + b * x + c = 0");
        double a = inputDouble("Enter a:");
        double b = inputDouble("Enter b:");
        double c = inputDouble("Enter c:");
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("One root:");
            System.out.println(quadraticEquation.getRoot1());
        } else {
            System.out.println("Two roots: ");
            System.out.println("x1: " + quadraticEquation.getRoot1());
            System.out.println("x2: " + quadraticEquation.getRoot2());
        }
    }

    public static double inputDouble(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
