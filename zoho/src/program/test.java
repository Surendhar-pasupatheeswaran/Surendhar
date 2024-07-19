package program;

public class test {
	
	
	  int i=m1();

	
     test(){
	    System.out.println("hi");
        }


   int m1() {
	System.out.println("m1-method");
	return 20;
    }

 
static 
{  
	System.out.println("instance block");
	
}

public static void main(String[]args) {
	test t=new test();
	
}
}
