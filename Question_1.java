//Remove duplicate from string

import java.util.*;

class Question_1
{
    static String removeDuplicate(char str[], int n)
    {
        int cnt = 0;
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[cnt++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, cnt));
    }


    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your string");
        String str1=sc.nextLine();
        char str[] = str1.toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }
}