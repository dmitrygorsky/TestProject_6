package by.cdptr.javabasics.l2_1;

import java.util.*;

public class FormulaCalculate {

    public static double userNumber(double n) {

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextDouble()) {
            System.out.println("Not a valid number! Try again");
            scan.next();
        }

        return scan.nextDouble();

    }

    public static double formulaResult(double a, double b, double c) {

        double x = Math.pow(b, 2) + (4 * a * c);

        if (a == 0) {

            System.out.println("Divide by zero is forbidden");
            System.exit(1);

        } else if (x < 0) {

            System.out.println("Square root cannot be extracted from negative number");
            System.exit(1);

        }

        return (b + Math.sqrt(x)) / (2 * a) - (Math.pow(a, 3) * c) + b;

    }

}


