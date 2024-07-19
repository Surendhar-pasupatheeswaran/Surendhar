package program;

import java.util.Scanner;

public class Find_sum_ofequalroses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double roses=sc.nextInt();
		int count=0;
		while(roses>1) {	
			roses=(roses/2);
		    System.out.println(roses);
		   count++;
		}
		System.out.println(count);
	}

}
