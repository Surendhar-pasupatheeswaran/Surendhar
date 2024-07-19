package array;

import java.util.Scanner;
import java.util.*;

public class Find_Largest_PrimeFactor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
           System.out.println( divisible(n));
        }
    }

    public static long isPrime(long n) {

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return i; // n is divisible by i, so it's not prime
            }
        }

        return n; // n is not divisible by any number, so it's prime
    }

    public static long divisible(long n) {
     long smallestFactor=isPrime(n);
     if(smallestFactor==n) {
    	 return n;
     }
     return n/smallestFactor;
    	
    } 
    
}

