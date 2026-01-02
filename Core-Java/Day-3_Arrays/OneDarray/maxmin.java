public class maxmin{
    public static void main(String[] args){
        int arr[] = {3,6,1,4,7};
        int len = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<len;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            
        }
        System.out.println(max +" "+ min);
    }
}