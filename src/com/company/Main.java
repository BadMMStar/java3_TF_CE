package com.company;

public class Main {
    public static void main(String[] args) {
        calculateTFerma();
        calcExpression();
    }

    public static void calculateTFerma() {
        int checkSum; // variable to check the result
        int n = 2;
//        if (n > 2 || n == 2) // This line is not needed, since we still write the answer n = 2
            for(int c = 1; c < 100; ++c)
                for (int a = 1; a <= 10; ++a)
                    for (int b = 1; b <= 10; ++b) {
                        checkSum = (int) (Math.pow(a, n) + Math.pow(b, n)); // (int) convert to integer answer
                        if (checkSum <= 100 && checkSum == Math.pow(c, n)) {
                           System.out.println(a+"^" + n + " + " + b + "^" + n + " = "+ checkSum);
                }
            }
    }

    public static void calcExpression () {
        double result = 0; // the initial values
        for(double i = 1; i < 10000; ++i){
            if (i % 2 == 0) {
                result -= 1/(i);
            }
            else {
                result += 1/(i);
            }
        }
        System.out.print("\nThe result of the expression equal = " + result);
    }
}
