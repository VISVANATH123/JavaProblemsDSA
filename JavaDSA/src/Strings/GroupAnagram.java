package Strings;

import java.util.*;

public class GroupAnagram {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine(); // consume leftover newline

        String[] str=new String[n];

        for(int i=0;i<n;i++){
           str[i]=scan.nextLine();
       }
        Map<String,List<String>> freqmap=new HashMap<>();
        for(int i=0;i<str.length;i++){
            String freq=getFreq(str[i]);
            if(freqmap.containsKey(freq)){
                freqmap.get(freq).add(str[i]);

            }else{
                List<String> a=new ArrayList<>();
                a.add(str[i]);
                freqmap.put(freq,a);

            }

        }
        System.out.print(freqmap.values());



    }
    public static String getFreq(String s){
        int[] frq=new int[26];
        for(char sr:s.toCharArray()){
            frq[sr-'a']++;
        }
        StringBuilder stringBuilder=new StringBuilder();
        char c='a';
        for(int i:frq){
            stringBuilder.append(c);
            stringBuilder.append(i);
        }
        return stringBuilder.toString();

    }

}
