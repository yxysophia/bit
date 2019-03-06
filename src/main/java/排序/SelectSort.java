package 排序;


//选择排序
public class SelectSort {
    public static void main(String[] args) {
        int a[]=new int[]{10,9,8,7,6,5,4,3,2,1};
        int num=a.length;
        selectSort(a,0,num-1);
        for(int i=0;i<num;i++)
        {
            System.out.println(a[i]+" ");
        }
    }

    public static  void selectSort(int[] a,int left,int right)
    {
        int num=a.length;
        while(left<right)
        {
            int min=left,max=left;
            for(int i=left+1;i<=right;i++)
            {
                if(a[i]>a[max])
                    max=i;
                if(a[i]<a[min])
                    min=i;
            }

            //将最小值和左边的交换  最大值和右边的进行交换
            int tmp=a[left];
            a[left]=a[min];
            a[min]=tmp;

            //
            if(max==left)
            {
                max=min;
            }
            tmp=a[right];
            a[right]=a[max];
            a[max]=tmp;
            left++;
            right--;
        }
    }
}
