import java.util.Scanner;
import java.util.ArrayList;
public class ComeOn {
    public static void main(String[] args) {


       StringBuilder sb=new StringBuilder();
       sb.append("abac");
        System.out.println(delTuo(sb,0,sb.length()-1).toString());
    }

    public static StringBuilder delTuo(StringBuilder sb,int left,int right)
    {

        if(left>right-2)
            return sb;
        int begin=left;
        if(sb.charAt(begin)==sb.charAt(begin+2)&& sb.charAt(begin)!=sb.charAt(begin+1))
        {
            sb.replace(left,left+1," ");
            right=sb.length()-1;
        }

        return delTuo(sb,left+1,right);
    }
}