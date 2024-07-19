package StringImplementation;

import java.util.Scanner;

public class Find_Reverse_OF_String {

	public static void main(String[] args) {
		String str="Sabari";
		
		String str1="";
		String str2="";
		//StringBuilder output=new StringBuilder(); 
		for(int i=0;i<str.length();i++) {
			
			
			if(i%2==0)
			{
				for(int j=i+1;j>=i;j--) {
					str1=str1+str.charAt(j);	
				}
				
				
			}
			
			
		}
		Find_Reverse_OF_String f=new Find_Reverse_OF_String();
		System.out.println(f.getClass().getName());
	System.out.println(str1);
	}


}