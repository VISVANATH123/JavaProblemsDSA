package Sort;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        merge_sort(nums,0,n-1);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    public static void merge_sort(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;
        merge_sort(arr,l,mid);
        merge_sort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int n=r-l+1;
        int left=l;
        int right=mid+1,k=0;
        int[] temp= new int[n];
        while (left<=mid && right<=r){
             if(arr[left]<=arr[right]){
                 temp[k++]=arr[left++];
             }else{
                 temp[k++]=arr[right++];
             }
        }
        while(left<=mid){
            temp[k++]=arr[left++];
        }
        while(right<=r){
            temp[k++]=arr[right++];
        }
        for(int i=0;i<n;i++){
            arr[l+i]=temp[i];
        }
    }
}
