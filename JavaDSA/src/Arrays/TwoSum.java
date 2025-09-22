package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] a=new int[100];
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        int target=scanner.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();
        int curr=0;
        for(int i=0;i<n;i++){
            curr=target-a[i];
            if(map.containsKey(curr)){
                System.out.println(map.get(curr)+" "+i);
            }
            map.put(a[i],i);
        }

    }
}
