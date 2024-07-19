package StringImplementation;

public class FindValidPalindrome {

	public static boolean validPalindrome(String str) {
		String str1="";

		String regex=str.toLowerCase().replaceAll("[^a-zA-Z0-9]", str1);
		System.out.println(regex);
		String str2=regex;	
					

				StringBuffer sb=new StringBuffer(regex);
				sb.reverse();
				
				String s=new String(sb);
				if(s.equals(str2)) {
					return true;
				}
				return false;
	}
	
	public static void main(String[] args) {
String str="A man, a plan, a canal: Panama";
String s="ab@d";
	System.out.println(validPalindrome(str));


	}

	

}
