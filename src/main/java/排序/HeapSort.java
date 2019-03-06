package 排序;

abstract class A
{
    public int count=10;
    public abstract void method(int a);
    public void method()
    {

    }
}
//堆排
public class HeapSort {
    public static void main(String[] args) {
        int a[] = new int[]{9,8,7,6,5,4,3,2,1,0};
        int num = a.length;
        heapSort(a,  num );
        for (int i = 0; i < num; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void adjustDow(int[] a,int parent,int num)
    {
        int child=parent*2+1;

        while(child<num)
        {
            if(child+1<num && a[child]<a[child+1])
            {
                child++;
            }
            if(a[parent]<a[child])
            {
                int tmp=a[parent];
                a[parent]=a[child];
                a[child]=tmp;
                parent=child;
                child=parent*2+1;
            }else break;
        }
    }
    public static  void heapSort(int[] a,int num)
    {
        //从最后一个非叶子结点开始向下调整为大堆
        for(int i=(num-2)/2;i>=0;i--)
        {
            adjustDow(a,i,num);
        }

        //将堆顶和最后一个元素进行交换，然后再向下调整
        int size=num;
        for(int i=0;i<num;i++)
        {
            int tmp=a[0];
            a[0]=a[size-1];
            a[size-1]=tmp;
            size--;
            adjustDow(a,0,size);
        }
    }
}
