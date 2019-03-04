package One;

import java.util.Scanner;

//回文字符串
// A  B  B插入A种有几种方式使得A是回文
public class HuiWen
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.next();
        String str2=scanner.next();

        int len1=str1.length();
        int count=0;
        for(int index=0;index<=len1;index++)
        {
            StringBuilder str=new StringBuilder(str1);
            str.insert(index,str2);
            int len2=str.length();
            int i=0,j=len2-1;
            while(i<j)
            {
                if(str.charAt(i)!=str.charAt(j))
                {
                    break;
                }
                i++;
                j--;
            }
            if(i>=j)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}