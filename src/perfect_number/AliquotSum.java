package perfect_number;

public class AliquotSum {
	 
    public boolean isPerfectNumber(int number){
         
        int temp = 0;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0){
                temp += i;
            }
        }
        if(temp == number){
            System.out.println("It is a perfect number : "+number);
            return true;
        } else {
           // System.out.println("It is not a perfect number");
            return false;
        }
    }
     
    public static void main(String a[]){
    	AliquotSum ipn = new AliquotSum();
    	int i=1;
    	while( i <=100){
        System.out.println(i + " Is perfect number: "+ipn.isPerfectNumber(i));
        i++;
        }
    }
}
