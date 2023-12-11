package org.example;

//часова складність O(2^n)
//просторова складність O(n)
public class FibRec {
    public static long fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
