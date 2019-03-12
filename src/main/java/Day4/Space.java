package Day4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * 对于一个给定的字符串，我们需要在线性(也就是O(n))的时间里对它做一些变形。首先这个字符串中包含着一
 * 些空格，就像"Hello
 * World"一样，然后我们要做的是把着个字符串中由空格隔开的单词反序，同时反转每个字符的大小写。比
 * 如"Hello
 * World"变形后就变成了"wORLD hELLO"。
 * 输入描述：
 * 给定一个字符串s以及它的长度n(1≤n≤500)
 * 输出描述：
 * 请返回变形后的字符串。题目保证给定的字符串均由大小写字母和空格构成。
 * 示例1:
 * 输入
 * "This is a sample",16
 * 输出
 * "SAMPLE A IS tHIS"
 */
public class Space {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int len=scanner.nextInt(); //长度
        String[] strings=str.split(" ");
        ArrayList<String> arrayList=new ArrayList<String>();
        for(String st:strings)
        {
            if(!("".equals(st)))
                arrayList.add(st);

        }
        Stack<String> stringStack=new Stack<String>();
        for(int i=0;i<arrayList.size();i++)
        {
            stringStack.push(arrayList.get(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!stringStack.isEmpty())
        {
            String s=stringStack.pop();
            StringBuilder ch=new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                if('a'<=s.charAt(i) &&s.charAt(i)<='z')
                {
                    ch.append((char)(s.charAt(i)-32));
                }
                else
                    ch.append((char)(s.charAt(i)+32));
            }
            sb.append(ch+" ");
        }
        System.out.println(sb.toString());
    }
}
