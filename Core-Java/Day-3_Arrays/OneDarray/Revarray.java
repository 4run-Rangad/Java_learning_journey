public class Revarray{
    public static void main(String[] args){
        int arr[] = {2,4,6,1,0};
        int len = arr.length;
        int i = 0, j=len-1;
        while(i<j){
            arr[i] += arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] = arr[i]- arr[j];
            i++;
            j--;
        }
        for(int n = 0; n<len;n++){
            System.out.print(arr[n]+" ");
        }
    }
}