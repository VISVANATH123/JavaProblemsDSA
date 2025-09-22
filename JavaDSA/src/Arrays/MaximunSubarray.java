package Arrays;

import java.util.Scanner;

public class MaximunSubarray {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        int curr=nums[0],max=nums[0];
        for(int i=1;i<n;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            max=Math.max(max,curr);
        }
        System.out.print(max);
    }
}
