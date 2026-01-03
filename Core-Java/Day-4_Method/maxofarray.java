public class maxofarray{
    public static int check(int arr[]){
        int x = Integer.MIN_VALUE;
        int len = arr.length;
        for(int i = 0; i<len; i++){
            if(arr[i]>x){
                x = arr[i];
            }
        }
        return x;
    }
    public static void main(String[] args){
        int arr[] = {1,3,7,2,5};
        System.out.print("Max of array: "+ check(arr));

    }
}