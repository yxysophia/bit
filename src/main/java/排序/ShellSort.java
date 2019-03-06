package 排序;


//希尔排序
public class ShellSort {
    public static void main(String[] args)
    {

        int a[] = new int[]{9,8,7,6,5,4,3,2,1,0};
        int num = a.length;
        shellSort(a,  num );
        for (int i = 0; i < num; i++) {
            System.out.println(a[i] + " ");
        }
    }
    public static void shellSort(int[] a,int num)
    {
        int gap=num;
        while (gap>1)
        {
            gap=gap/3+1;
            for(int i=0;i+gap<num;i++)
            {
                int end=i;
                int tmp=a[end+gap];
                while(end>=0  && a[end]>tmp)
                {
                    a[end+gap]=a[end];
                    end-=gap;
                }
                a[end +gap]=tmp;
                for (int j = 0; j < num; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println("\n");
            }
        }
    }
}
