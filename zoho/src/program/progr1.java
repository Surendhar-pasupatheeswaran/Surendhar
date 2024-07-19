package program;

import java.util.Scanner;

public class progr1 {

 
		public static void main(String args[]){ 
			Scanner sc = new Scanner(System.in); 
			String myString = sc.next(); 
				 
			int counter = 0; 
			int num = 0; 
			char c = 0; 
				 
			for(int i=0;i<myString.length();i++){ 
				 
				if(i%2 != 0){ 
					num = Integer.parseInt(Character.toString(myString.charAt(i))); 
				 
				}else if(i%2 == 0){ 
					c = myString.charAt(i); 
				} 
				counter++; 
				 
				if(counter == 2){ 
					for(int j=0;j<num;j++){ 
						System.out.print(c); 
					} 
					counter = 0; 
				} 
				 
			} 
		} 
	} 