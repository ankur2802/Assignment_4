// Unique Character in String

import java.util.*;

class Question_7 {
    boolean Characters(String str)
    {

        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;


        return true;
    }

    public static void main(String args[])
    {
        Question_7 obj = new Question_7();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your string");
        String str1 = sc.nextLine();

        if (obj.Characters(str1))
            System.out.println("The String " + str1 + " contains all unique characters");
        else
            System.out.println("The String " + str1 + " contains duplicate characters");
    }
}