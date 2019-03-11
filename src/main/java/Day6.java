import java.util.Arrays;
import java.util.Scanner;
public class Day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] c = str.split(" ");
        int[] a=new int[c.length];
        int i=0;
        for( i=0;i<c.length;i++)
        {
            a[i]=Integer.parseInt(c[i]);
        }

        Arrays.sort(a);
        int count=0;
        int j=0;
        while(j<i)
        {
            count=0;
            int num=a[j];
            while(j<i && a[j]==num )
            {
                j++;
                count++;
            }
            if(count>=i/2)
            {
                System.out.println(num);
                break;
            }

        }
    }
}