public class Sumofele{
    public static void main(String[] args){
        int arr[] = {2,1,3,4,5};
        int len = arr.length;
        int sum = 0;
        for(int i = 0 ; i<len;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}