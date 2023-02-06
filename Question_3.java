//Palindrome

import java.util.*;
public class Question_3 {

    public static void main(String arsg[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter your number");
        int n= sc.nextInt();
        int n1=0;
        int temp;
        int n2=n;

        while(n!=0){
           temp=n%10;
           n1=temp+n1*10;
           n=n/10;

        }
        if(n1==n2){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("not plaindrome");
        }


    }

}
