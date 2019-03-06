package 排序;

//插入排序
public class InsertSort {
    public static void main(String[] args) {
        int a[]=new int[]{9,8,7,6,5,4,3,2,1,0};
        int num=a.length;
        insertSort(a,num);
        for(int i=0;i<num;i++)
        {
            System.out.println(a[i]+" ");
        }
    }

    public static void insertSort(int a[],int num) {
        for(int i=1;i<num;i++)
        {
            int end=i-1;
            while(end>=0 && end+1<num && a[end]>a[end+1])
            {
                int tmp=a[end+1];
                a[end+1]=a[end];
                a[end]=tmp;
                end--;
            }
        }
    }
}
