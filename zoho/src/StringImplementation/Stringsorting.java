package StringImplementation;

import java.util.Arrays;
import java.util.Scanner;

public class Stringsorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[]ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int min=ch[0];
			for(int j=i+1;j<ch.length;j++) {
			if(ch[j]<ch[i]) {
				char temp=ch[j];
				ch[j]=ch[i];
				ch[i]=temp;
			}
		}}
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}

}
