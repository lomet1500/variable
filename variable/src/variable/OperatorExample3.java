package variable;

public class OperatorExample3 {

	public static void main(String[] args) {
		
		int num1 = 3;
		
		int result = 0; // 짝수:0, 홀수:1
		// INT result = 0;
		// 짝수 : true, 홀수 false
		
		boolean result2 = true; 
		
		// 1) if구문
		// 2) ? : 구문
		
	    if (num1 % 2 == 0 ) {
			System.out.println(" num1은 짝수입니다. ");
		} else {
			System.out.println(" num1은 홀수입니다. ");
			
		result = (num1 % 2 == 0) ?  0 : 1;
		System.out.println( result );
		
	    
	    if (num1 % 2 == 0) {
	    	System.out.println(" true ");
	    }else {
	    	System.out.println(" false ");
	    }
		}
	    
	    result2 = (num1 % 2 == 0) ;
		System.out.println( result );
		
	  
		
	}	
	}		


