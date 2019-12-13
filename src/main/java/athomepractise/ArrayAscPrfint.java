package athomepractise;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayAscPrfint {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6},{1,2,3,4,5,7},{1,2,3,4,5,8},{1,2,3,4,5,9},{1,2,3,4,5,10},{1,2,3,4,5,11}};

        int[] check = new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            int sum = 0;
            for (int j = 0; j <arr[i].length ; j++) {
                sum+=arr[i][j];
            }
            check[i]=sum;
            int position=0;
            for (int j = 0; j <check.length ; j++) {
                if (sum>check[j]&&check[j]!=0){
                    position++;
                }
            }
            for (int j = position; j <i ;j++) {
                int[] temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                int tempForCheck = check[j];
                check[j]=check[i];
                check[i] = tempForCheck;
            }

        }
        System.out.println("\n\n");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
