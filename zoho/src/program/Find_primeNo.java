package program;

import java.util.Scanner;

public class Find_primeNo {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            count(n);
        }
    }
    
    public static void count(int n){
          int count=0;
             int number=2;
        int arr[]=new int [n];
             while(count<n){
              if(isPrime(number)){
                arr[count]=number;
                count++;
                 }
              number++;
             }
             
             System.out.println(number);
             
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    
}