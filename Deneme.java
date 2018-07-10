package may09;

public class Deneme {

	    public static void main(String[] args) {
	    
	        System.out.println(evenOdd(-6.4));
	        
	        int[] arr = {2,3,7,4,8,9};
	        int[] arr2 = new int[arr.length];
	        
	        String str = "";
	        for(int i = 0; i<arr.length;i++) {
	        	str+=arr[i];
	        }
	       
	    } 
	    
	    public static String evenOdd(double a) {
	        a = Math.round(a);
	        System.out.println(a);
	        if(a % 2 == 0 || a == 0)
	        return "Even";
	        else {
	        return "Odd";}
	        
	        
	        
	    }
	    
	    
	    

	}

