package 网易;

import java.util.Scanner;

public class MaxSubLen {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int len = maxLenSub(str);
        System.out.println(str);
    }

    public static int maxLenSub(String str) {
        int len = str.length();
        if (len == 1)
            return 1;
        //数组长度大于1
        int start = 0, begin = 0, end = 1;
        char[] ch = str.toCharArray();
        int maxLen = 0;
        while (end < len) {
            while (end < len && ch[begin] == ch[end]) {
                begin++;
                end++;
            }
            //前后两个位置不相等。记录不相等开始位置
            start = begin;
            while (end < len && ch[begin] != ch[end]) {
                begin++;
                end++;
            }
            //前后两个位置，需要计算不相等子串长度
            int sublen = begin - start + 1;
            maxLen = Math.max(sublen, maxLen);
        }
        return maxLen;
    }
}
