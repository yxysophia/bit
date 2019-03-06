package 网易;

/**
 * 小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
 * 1、将a_i放入b序列的末尾
 * 2、逆置b序列
 * 小易需要你计算输出操作n次之后的b序列。
 */

//从后向前隔一个输出一个
//1 2 3 4
// 4 2 1 3

import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        b=getReversize(a,n);
        for(int i=0;i<n;i++)
        {
            if(i==n-1)
            {
                System.out.print(b[i]);
            }else
            {
                System.out.print(b[i]+" ");
            }
        }
    }
    public static int[] getReversize(int[] a,int n)
    {
        int[] b=new int[n];
        int j=n-1;
        boolean flag=true;
        int flag1=1;
        for(int i=0;i<n;i++)
        {
            b[i]=a[j];
            if(flag)
            {
                j-=2;
            }else{
                if(flag1==2)
                    j+=2;
                else j+=1;
            }
            if(j<=0)
            {
                flag=false;
                if(j<0)
                    flag1=2;
                j=0;
            }
        }
        return b;
    }
}