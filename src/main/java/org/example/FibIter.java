package org.example;

//часова складність O(n)
//просторова складність O(1)
public class FibIter {
    public static long fibonacci(int n){
        if (n <= 1) {
            return n;
        }

        long first = 0;
        long second = 1;

        for (int i = 0; i <= n - 3; i++){
            long temp = second;
            second = first + second;
            first = temp;
        }

        return first + second;
    }
}
