package logicalprogram;

public class LargestNumberintheContigiousArray {

	public static void main(String[]arr) {
		int []arrg= {0,5,6,0,9,0,0,1};
		int sum=0;
		int max=0;
		for(int i=0;i<arrg.length-1;i++) {
			sum=arrg[i]+arrg[i+1];
			if(max<sum)
			{
				max=sum;
			}
			
		}
		System.out.println(max);
	}
}
