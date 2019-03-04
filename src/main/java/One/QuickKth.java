package One;

//根据快排思想找第K的数

/**
 * 根据快排，将一个数字放在该方的位置上 ，前面数字比它大，后面数字比它小，根据K来判断是向右找还是向左找
 * 如果该位置比K大，说明第K大数字在前边，向左找，否则向右找
 */
public class QuickKth {
    public static void main(String[] args) {
        int[] a=new int[]{1,3,5,2,2};

        System.out.println(findKth(a,5,1));
        System.out.println(findKth(a,5,2));
        System.out.println(findKth(a,5,3));
        System.out.println(findKth(a,5,4));
        System.out.println(findKth(a,5,5));
    }

    public static int findKth(int[] a,int num,int k)
    {
        int ret=find(a,0,num-1,k);
        return ret;
    }

    public static int find(int[] a,int left,int right,int k)
    {
//        if(left<=right)  //需要是==，  一个数字也需要排序后根据下标，然后是要找第K大的数，返回
//        {
        int ret=quickSort(a,left,right);
        if(ret==(k-1))
            return a[ret];
        else if(ret<k-1)  // ret ret+1 k  在右边找，要找的数比ret位置数小
            return find(a,ret+1,right,k);
        else  //要找的数比ret位置大，在左边找
            return find(a,left,ret-1,k);
//        }
//        return -1; //不会走到这里，因为肯定存在第K大的数
    }

    public static int quickSort(int[] a,int left,int right)  //降序
    {
        int key=a[right];
        int index=right;
        while(left<right)
        {
            //比key的数在要换到前边，比key小的数要换到后边
            while(left<right && a[left]>=key )  //找到第一个比key小的数
                left++;
            while (left<right && a[right]<=key)  //找到第一个比key大的数
                right--;
            if(left<right)
            {
                int tmp=a[left];
                a[left]=a[right];
                a[right]=tmp;
            }
        }
        int tmp=a[right];
        a[right]=a[index];
        a[index]=tmp;
        return right;
    }
}
