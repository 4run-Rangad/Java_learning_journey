public class EvenOdd{
    public static void main(String[] args){
        int arr[] = {2,5,3,4,6,1};
        int len = arr.length;
        int even = 0, odd = 0;
        for(int i = 0; i<len; i++){
            if((arr[i]%2)==0){
                even++;
            }
            else odd++;
        }
        System.out.print("No. of even: "+even + " and no. of odd: "+ odd);
    }
}