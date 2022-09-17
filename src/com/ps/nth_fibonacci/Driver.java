package com.ps.nth_fibonacci;

public class Driver {

	private static long[] fibonacciCache;
	public static void main(String[] args) {
        int input = 90;
        
        /*  nth Fibonacci number in normal way
        long firstNum = 0, secondNum = 1;
        long fibo = 0;
        System.out.print(0 + " " + 1 + " ");

        for(int i=3; i<=input; i++){
            fibo = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = fibo;
            System.out.print(fibo + " ");
        }
		*/
        fibonacciCache = new long[input +1];
        for(int i = 0; i<input; i++){
            System.out.print(fibonacciOf(i) + " ");
        }
	
	}
	
	private static long fibonacciOf(int n){
        if(n<=1){
            return n;
        }

        if(fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }

        long fibonacciNumber = (fibonacciOf(n-1) + fibonacciOf(n-2));
        fibonacciCache[n] = fibonacciNumber;

        return fibonacciNumber;
    }

}
