package com.sayali.practice.problems.POW;

class Pow {

    public double myPow(double x, int n) {
        //initialize ans
        double ans = 1.0;
        //long to avoid overflow when n = Integer.MIN_VALUE
        long nn = n;

        //convert nn to positive
        if (nn < 0) nn = -1 * nn;

        //loop on nn
        while (nn>0) {
            if (nn % 2 == 0) {
                //even
                x = x * x;
                nn = nn / 2;
            } else {
                //odd
                ans = ans * x;
                nn = nn - 1;
            }
        }

        //if n negative ans = 1/ans
        if (n<0) ans = (double)(1.0) / (double)(ans);

        return ans;
    }
}

// Separate main class for testing
class Main {
    public static void main(String[] args) {
        // Create an instance of Pow
        Pow sol = new Pow();

        // Example input
        double x = 2.0;
        int n = 10;

        // Calculate power
        double result = sol.myPow(x, n);

        // Print result
        System.out.println(x + "^" + n + " = " + result);
    }
}
