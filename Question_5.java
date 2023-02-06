//Anagram

import java.util.*;

public class Question_5 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter your string 1");
    String str1=sc.nextLine();
    str1=str1.toLowerCase();
    System.out.println("enter your string 2");
    String str2=sc.nextLine();
    str2=str2.toLowerCase();

    char[] ch1=str1.toCharArray();
    char[] ch2=str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    if(Arrays.equals(ch1,ch2)){
        System.out.println("it is a anagram");
    }
    else{
        System.out.println("it is not a anagram");
    }
}
}
