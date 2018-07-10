package may09;
//hi Adilet this is from Nargiza
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
        System.out.println("Nargiza");

    }

	public static void main(String[] args) {
		int arr[] = {-4, 3, -9, 0, 4, 1 };
		plusMinus(arr);
		
		System.out.println("adilet kaleysan");
		

System.out.println("akmal has made some changes");
	}
	

}
