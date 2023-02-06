// Count vowels, consonant, digits and special character


import java.util.*;

public class Question_4 {


    static void countType(String str)
    {

        int vowels = 0, consonant = 0, specialChar = 0,
                digit = 0;


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);

            if ( (ch >= 'a' && ch <= 'z') ) {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u'){
                    vowels++;
                }
                else
                    consonant++;

            }
            else if (ch >= '0' && ch <= '9'){
                digit++;

            }
            else {
                specialChar++;

            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonant: " + consonant);
        System.out.println("Digit: " + digit);
        System.out.println("Special Character: " + specialChar);
    }


    static public void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");

        String str = sc.nextLine();
        countType(str);
    }
}