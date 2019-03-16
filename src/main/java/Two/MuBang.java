package Two;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//木棒排面积
public class MuBang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        List<Integer> integerList=new ArrayList<Integer>(50000);
        while((n--)>0)
        {
            int i=scanner.nextInt();
            int L=scanner.nextInt();
            if(i==1)
            {
                integerList.add(L);
            }else if(i==2)
            {
                integerList.remove((Integer)L);
            }
            System.out.println(integerList);
            if(adjust(integerList))
                System.out.println("Yes");
            else System.out.println("No");
        }
    }

    public static boolean adjust(List<Integer> integerList)
    {
        if(integerList.size()<=2)
        {
            return false;
        }
        int size=integerList.size();
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum=0;
            int l=integerList.get(i);
            for(int j=0;j<size;j++)
            {
                sum+=integerList.get(j);
            }
            if(sum<=2*l)
                return false;
        }
        return true;
    }
}
