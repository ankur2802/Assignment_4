//            pangram

import java.util.*;
class Question_6 {
    public static void
    pangram(String str)
    {
        str = str.toLowerCase();

        boolean allLetterPresent = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {

            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }
        if (allLetterPresent)
            System.out.println("Yes it is pangram");
        else
            System.out.println("No it is not pangram");
    }

    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter your string");

        String str =sc.nextLine();

        pangram(str);
    }
}

