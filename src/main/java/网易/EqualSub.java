package 网易;

import java.util.Scanner;
import java.util.Arrays;
public class EqualSub
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        if(isEqualSub(a)==true)
        {
            System.out.println("Possible");
        }
        else
            System.out.println("Impossible");
    }
    public static boolean isEqualSub(int[] a )
    {
        Arrays.sort(a);
        int sub=a[1]-a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]-a[i-1]!=sub)
                return false;
        }
        return true;
    }
}