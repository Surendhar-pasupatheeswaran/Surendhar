package array;

public class FindSpecialIntegerInArray {
	
	
	public static void main(String[]args) {
		int []arr= {1,2,4,4,6,6,6,6,7,7,7};
	System.out.println(	findSpecialInteger(arr));
		
	}

	private static int	findSpecialInteger(int[] arr) {
			int size=arr.length;
			int p=arr[0];
			int qtr=size/4;
			int cnt=1;
			
			for(int i=1;i<arr.length;i++)
			{
				if(p==arr[i]) cnt++;
				
				else
					cnt=1;
				if(cnt>qtr) return arr[i];
				
				p=arr[i];
			}
			
		return p;
	}


}
