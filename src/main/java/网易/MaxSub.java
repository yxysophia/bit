package 网易;
// 高 低   高 低  高 低
import java.util.Scanner;
import java.util.Arrays;
public class MaxSub
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();  //人数
        int[] a=new int[num];
        for(int i=0;i<num;i++)
        {
            a[i]=scanner.nextInt();
        }
        int maxSub=getMaxSub(a,num);
        System.out.println(maxSub);
    }
    public static int getMaxSub(int[] a,int num) {
        int[] b = new int[num];
        Arrays.sort(a); //将身高排序
        int mid = num / 2; //中间位置 [0,mid-1]身高低  [mid,num-1]是身高高
        b[mid] = a[num - 1];
        int i = 0, j = num - 2;//矮身高  高身高
        int index = mid - 1;
        int count1 = 1;
        int count2 = 1;
        while (i < mid) {
            b[index] = a[i++];
            if (index + count1 * 2 < num && i < mid) {
                b[index + count1 * 2] = a[i++];
                index -= 2;
                count1 += 2;
            } else break;
        }
        index = mid - 2;
        while (index >= 0 && j >= mid) {
            b[index] = a[j--];
            if (index + count2 * 4 < num) {
                b[index + count2 * 4] = a[j--];
                index -= 2;
                count2++;
            }
        }
        if(b[num-1]==0)
            b[num-1]=a[mid];
        int maxSub = 0;
        if (Math.abs(b[num - 1] - b[num - 2]) < Math.abs(b[num - 1] - b[0])) {
            int tmp = b[num - 1];
            num--;
            maxSub += Math.abs(tmp - b[0]);
        }
        for (int start = 0; start < num - 1; start++) {
            maxSub += Math.abs(b[start] - b[start + 1]);
        }
        return maxSub;
    }
}

//public class MaxSub
//{
//    public static void main(String[] args)
//    {
//        Scanner scanner=new Scanner(System.in);
//        int num=scanner.nextInt();  //人数
//        int[] a=new int[num];
//        for(int i=0;i<num;i++)
//        {
//            a[i]=scanner.nextInt();
//        }
//        int maxSub=getMaxSub(a,num);
//        System.out.println(maxSub);
//    }
//
//    public static int getMaxSub(int[] a,int num)
//    {
//        if(num==1)
//            return a[num-1];
//        if(num==2)
//            return Math.abs(a[num-2]-a[num-1]);
//        //学生人数大于2,身高高的数组里人数至少有2个，身高低的数组里人数至少有1个
//        int[] b=new int[num];
//        Arrays.sort(a); //将身高排序
//        int mid=num/2; //中间位置 [0,mid-1]身高低  [mid,num-1]是身高高
//        int i=0,j=num-1;//矮身高  高身高
//        int count1=(mid-1)/2, count2=(num-mid-1)/2;
//        int mod1=(mid-1)%2,mod2=(num-mid-1)%2;
//        int count2Num=1;
//        b[mid]=a[j--];
//        while(count2Num<=count2 )
//        {
//
//            b[mid-count2Num*2]=a[j--];
//            b[mid+count2Num*2]=a[j--];
//            count2Num++;
//        }
//
//        int count1Num=1;
//        int mid1=mid-1;
//        b[mid1]=a[i++];
//        while(count1Num<=count1 )
//        {
//
//            b[mid1+count1Num*2]=a[i++];
//            b[mid1-count1Num*2]=a[i++];
//            count1Num++;
//        }
//        if(b[0]==0)
//        {
//            b[0]=a[j];
//        }
//        if(b[num-1]==0)
//        {
//            b[num-1]=a[i];
//        }
//        for(int index=0;index<num;index++)
//        {
//            if(b[index]==0)
//            {
//                if(j>mid)
//                {
//                    b[index]=a[j];
//                }else if(i<mid)  //证明还剩身高低的同学
//                    b[index]=a[i];
//            }
//        }
//
//        int maxSub=0;
//        if(Math.abs(b[num-1]-b[num-2])<Math.abs(b[num-1]-b[0]))
//        {
//            int tmp=b[num-1];
//            num--;
//            maxSub+=Math.abs(tmp-b[0]);
//        }
//        for(int index=0;index<num-1;index++)
//        {
//            maxSub+=Math.abs(b[index]-b[index+1]);
//        }
//        return maxSub;
//    }
//}
//
//
