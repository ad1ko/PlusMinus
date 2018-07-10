package OCA1.PlusMinus;

public class PlusMinus {
	static void plusMinus(int[] arr) {
        double pos=0;
        double neg = 0;
        double zero = 0;
        int len=arr.length; 
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]>0){
                pos++;
            }else if(arr[i]<0){
                neg++;
            }else{
                zero++;
            }
    }
        System.out.println(pos/len);
        System.out.println(neg/len);
        System.out.println(zero/len);
        

    }

	public static void main(String[] args) {
		int arr[] = {-4, 3, -9, 0, 4, 1 };
		plusMinus(arr);
		
<<<<<<< HEAD
		System.out.println("Huseyin Baba");
=======
		System.out.println("adilet kaleysan");
		

>>>>>>> 278adb51c9ab3503dd38c1a14819cb944d1a1309

	}

}
