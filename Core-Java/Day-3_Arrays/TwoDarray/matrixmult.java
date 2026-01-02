public class matrixmult{
    public static void main(String[] args){
        int nums1[][] = new int[3][2];
        int nums2[][] = new int[2][4];
        int mult[][] = new int[3][4];
        for(int i = 0; i<3;i++){
            for(int j = 0; j<2; j++){
                nums1[i][j] = (int)(Math.random() *10);
            }
        }
        for(int i = 0; i<2;i++){
            for(int j = 0; j<4; j++){
                nums2[i][j] = (int)(Math.random() *10);
            }
        }
        System.out.println("Array 1:");
        for(int i = 0; i<3;i++){
            for(int j = 0; j<2; j++){
                System.out.print(nums1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array 2:");
        for(int i = 0; i<2;i++){
            for(int j = 0; j<4; j++){
                System.out.print(nums2[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0; i<3;i++){
            for(int j = 0; j<4; j++){
                for(int k=0;k<2;k++){
                    mult[i][j]+=nums1[i][k] * nums2[k][j];
                }
                
            }
        }
        System.out.println("Product :");
        for(int i = 0; i<3;i++){
            for(int j = 0; j<4; j++){
                System.out.print(mult[i][j]+" ");
            }
            System.out.println();
        }
    }
}