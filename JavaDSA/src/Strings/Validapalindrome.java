package Strings;

import java.util.Scanner;

public class Validapalindrome {
    public static void main(String  args[]){
        Scanner scan=new Scanner(System.in);

        String s=scan.nextLine();
        String o=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        if(palindrome(o)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
    public static boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while (i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
