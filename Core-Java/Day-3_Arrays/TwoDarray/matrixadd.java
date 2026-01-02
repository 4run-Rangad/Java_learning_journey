public class matrixadd{
    public static void main(String[] args){
        int nums1[][] = new int[3][4];
        int nums2[][] = new int[3][4];
        int sum[][] = new int[3][4];
        for(int i = 0; i<3;i++){
            for(int j = 0; j<4; j++){
                nums1[i][j] = (int)(Math.random() *10);
                nums2[i][j] = (int)(Math.random() *10);
            }
        }
        System.out.println("Array 1:");
        for(int i = 0; i<3;i++){
            for(int j = 0; j<4; j++){
                System.out.print(nums1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array 2:");
        for(int i = 0; i<3;i++){
            for(int j = 0; j<4; j++){
                System.out.print(nums2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum :");
        for(int i = 0; i<3;i++){
            for(int j = 0; j<4; j++){
                sum[i][j]=nums1[i][j] + nums2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}