/**
 * 二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，
 * 网格的列编号为0~W-1。每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
 * 对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
 * ( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
 * 小易想知道最多可以放多少块蛋糕在网格盒子里。
 *
 * 输入描述:
 * 每组数组包含网格长宽W,H，用空格分割.(1 ≤ W、H ≤ 1000)
 * 输出描述:
 * 输出一个最多可以放的蛋糕数
 *
 * 输入  3 2
 * 输出   4
 * 1 1 x x 1 1  x
 * 1 1 x x 1 1  x
 * x x 1 1 x x  1
 * x x 1 1 x x  1
 * 则第一行应该为：110011001100...
 * 110011001100...因此需要对横纵坐标依次遍历通过周期4进行判断，
 */

import java.util.Scanner;

public class  Day7
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int w=scanner.nextInt(); //列
        int h=scanner.nextInt(); //行
        int count=w*h;
        for(int i=0;i<h;i++)
        {
            if(i%4==0 || i%4==1)
            {
                for(int j=0;j<w;j++)
                {
                    if(j%4==2 || j%4==3)
                        count--;
                }
            }
            else
            {
                for(int j=0;j<w;j++)
                {
                    if(j%4==0 || j%4==1)
                        count--;
                }
            }
        }
        System.out.println(count);
    }
}