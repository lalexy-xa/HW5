package org.example;

import java.util.HashMap;
import java.util.Map;

//часова складність O(2^n)
//просторова складність O(2n)

public class FibDinamic {
    private static Map<Integer, Long> fibNumbersStack = new HashMap<>();
    public static long fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        if (fibNumbersStack.containsKey(n)) {
            return fibNumbersStack.get(n);
        }


        long fib = fibonacci(n - 1) + fibonacci(n - 2);
        fibNumbersStack.put(n, fib);
        return fib;
    }
}
