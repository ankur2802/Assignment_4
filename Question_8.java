// Program to find the maximum and minimum occurring character in a string


import java.util.*;
public class Question_8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();

        int[] frq = new int[str.length()];
        char minchar = str.charAt(0), maxchar = str.charAt(0);
        int i, j, min, max;
        char str1[] = str.toCharArray();
        for(i = 0; i < str1.length; i++)
        {
            frq[i] = 1;
            for(j = i+1; j < str1.length; j++)
            {
                if(str1[i] == str1[j] && str1[i] != ' ' && str1[i] != '0')
                {
                    frq[i]++;
                    str1[j] = '0';
                }
            }
        }
        min = max = frq[0];
        for(i = 0; i <frq.length; i++)
        {
            if(min > frq[i] && frq[i] != '0')
            {
                min = frq[i];
                minchar = str1[i];
            }
            if(max < frq[i])
            {
                max = frq[i];
                maxchar = str1[i];
            }
        }
        System.out.println("Minimum occurring character: " + minchar);
        System.out.println("Maximum occurring character: " + maxchar);
    }
}