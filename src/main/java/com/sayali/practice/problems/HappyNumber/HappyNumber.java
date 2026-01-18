package com.sayali.practice.problems.HappyNumber;

public class HappyNumber {

    public static int getSum(int num) {
        int sum = 0;
        while (num>0) {
            int digit = num%10;
            sum += digit*digit;
            num=num/10;
        }
        return sum;
    }

    public static boolean happyNumber(int num) {

        int slow = num;
        int fast = num;

        do {
            slow = getSum(slow);
            fast = getSum(getSum(fast));
        } while (slow!=fast);

        return slow==1;
    }
    public static void main(String[] args) {

        System.out.println(happyNumber(34));
    }
}
