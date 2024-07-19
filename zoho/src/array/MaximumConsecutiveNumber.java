package array;

import java.util.LinkedList;

public class MaximumConsecutiveNumber {

	 public static  int maxConsecutiveAnswers(String answerKey, int k) {
	        return Math.max(flipper(answerKey,k,'F'),flipper(answerKey,k,'T'));
	    }

	    public  static int flipper(String answerkey,int k,char character){
	        int max=0;
	        int count=0;

	        LinkedList<Integer> ln=new LinkedList<Integer>();

	        for(int i=0;i<answerkey.length();i++){
	            char c=answerkey.charAt(i);

	            if(c==character){
	                count++;
	            }
	            else if(k>0){
	                ln.add(i);
	                k--;
	                count++;
	            }
	            else{
	                ln.add(i);
	                max=Math.max(count,max);
	                Integer firstEmelement=ln.removeFirst();
	                count=i-firstEmelement;
	            }

	        }
	       max=Math.max(count,max);

	        return max;


	    }
	
	
	public static void main(String[] args) {
		String str="TTFF";
		int k=2;
		System.out.println(maxConsecutiveAnswers(str,k));
	}

}
