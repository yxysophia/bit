package 排序;


//快排
public class QuickSort {
    public static void main(String[] args) {
        int a[]=new int[]{10,9,8,7,6,5,4,3,2,1};
        int num=a.length;
        quickSort(a,0,num-1);
        for(int i=0;i<num;i++)
        {
            System.out.println(a[i]+" ");
        }
    }

    //快排
    public static void quickSort(int a[],int left,int right)
    {
        if(left>=right)
            return;
        int div=realQuickSort(a,left,right);
        quickSort(a,left,div-1);
        quickSort(a,div+1,right);
    }

    public static  int realQuickSort(int[] a,int left,int right)
    {
        int key=a[right];
        int index=right;
        while(left<right)
        {
            while(left<right && a[left]<=key)
                left++;
            while(left<right && a[right]>=key)
                right--;
            if(left<right)
            {
                int tmp=a[left];
                a[left]=a[right];
                a[right]=tmp;
            }
        }
        int tmp=a[index];  //基准值
        a[index]=a[right];
        a[right]=tmp;
        return  right;

    }
}
