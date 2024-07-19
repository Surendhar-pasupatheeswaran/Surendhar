package program;

import java.util.Scanner;

public class ConvertNumberToWord {
	public static final String []units= {"","one","two","three","four","five","six","seven","eight","nine"};
	public static final String []teens= {"","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
	public static final String []tens= {"","twenty","thirty","forty","fifty","sixty","seventy","eigthy","ninty"};
	
	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			
			convertword(sc.nextInt());
	}
	private static String convertword(int number) {
		if(number==0) {
			return "zero";
		}
		return convertnumberToWord(number).trim();
		
	}
	
	private static String  convertnumberToWord(int number) {
		
		if(number<10) {
			return (units[number]);
		}
		else if(number<20) {
			return (teens[number-10]);
		}
		else if(number<100) {
			return (tens[number/10]+" "+convertnumberToWord(number%10));
		}
		else if(number<1000) {
			return (units[number/100]+"Hundred"+convertnumberToWord(number%100));
		}
		else if(number<1000000) {
			return convertnumberToWord(number/1000)+"Thousand"+convertnumberToWord(number%100);
		}
	  else if (number < 1000000000) {
         return convertnumberToWord(number / 1000000) + " Million " + convertnumberToWord(number % 1000000);
     } else {
         return convertnumberToWord(number / 1000000000) + " Billion " + convertnumberToWord(number % 1000000000);
     }
		
	}

	

}
