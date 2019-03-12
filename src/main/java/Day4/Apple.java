package Day4;

import java.util.Scanner;

/**
 *
 * 1. 小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
 * 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易
 * 将不会购买。
 * 输入描述：
 * 输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
 * 输出描述：
 * 输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
 * 示例1:
 * 输入
 * 20
 * 输出
 * 3
 */
public class Apple {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(); //苹果数量
        int a=0,b=0; //6斤和8斤装数量
        int m=n/8;  //装8斤的最大数量
        for(int i=m;i>=0;i--)
        {
            if((n-8*i)%6==0)
            {
                b=i;
                a=(n-8*i)/6;
                System.out.println(a+b);
                break;
            }
        }

    }
}
