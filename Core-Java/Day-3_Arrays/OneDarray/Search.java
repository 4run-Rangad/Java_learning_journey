//linear and Binary search
public class Search{
    public static int linear(int arr[], int target){
        int len = arr.length;
        for(int i = 0; i<len;i++){
            if(arr[i]==target) return i;//found
        }
        return -1;//not found
    }
    public static int Binary(int arr[], int target){
        int left = 0, right = arr.length-1, mid = 0;
        while(left<=right){
            mid = left + (right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                left= mid+1;
            }
            else right = mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,4,5,3,7};
        int sarr[]= {1,2,3,4,5,6};//Binary search works on sorted array
        int target = 3;
        System.out.println("Target found at index: "+ linear(arr,target));
        System.out.print("Target found at index: "+ Binary(sarr,target));


    }
}