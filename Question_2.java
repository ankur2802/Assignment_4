
//Duplicate in string

import java.util.*;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your string");
        String string1 = sc.nextLine();
        int count;
        int ct=0;

        
        char string[] = string1.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    ct++;

                    string[j] = '0';
                }
            }

            if(count > 1 && string[i] != '0')
                System.out.println(string[i]);

        }
        if(ct<1){
            System.out.println("duplicate not found");
        }
    }
}
