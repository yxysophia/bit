package 网易;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 例如: s = "ABAB",那么小易有六种排列的结果:
 * "AABB","ABAB","ABBA","BAAB","BABA","BBAA"
 * 其中只有"AABB"和"BBAA"满足最多只有一对不同颜色的相邻砖块。
 */
public class Colour {

        public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);
            String clour=scanner.next();
            int i=0;
            clour.toCharArray();
            Math.max(1.2,2);
            int count=findCout(clour);
            System.out.println(count);

        }
        public static int findCout(String clour)
        {
            int[] cl=new int[26];
            for(int i=0;i<clour.length();i++)
            {
                cl[clour.charAt(i)-'A']++;
            }
            int count=0;
            for(int i=0;i<26;i++)
            {
                if(cl[i]!=0)
                    count++;
                if(count>2)
                    return 0;
            }
            if(count==1)
            {
                return 1;
            }
            else
                return 2;
        }
}
