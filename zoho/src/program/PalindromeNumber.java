package program;

public class PalindromeNumber {
	    public static boolean isPalindrome(int x) {
	        int temp=x;
	    int y;int sum=0;
	        while(x>0)
	            {
	                y=x%10;
	                sum=sum*10+y;
	                x/=10;
	            }    

	            if(sum==temp){
	            return true;
	            }
				return false;
	    }
	
	public static void main(String[] args) {

		System.out.println(isPalindrome(-121));
	}

}
