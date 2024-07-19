package program;


public class Find_sum_of_Weight {

	public static void main(String[] args) {

		int arr[]= {10,36,54,89,12};
		int weight=0;
		int j=1;
		for(int i=0;i<arr.length;i++)
		{
			//perfect square
			for(;j<i/2;j++) {
				if(j*j==i) {
					System.out.println("The perfect square of "+arr[i]+" is "+arr[j]);
				}
			
			}
			
			
		}
	}

}
