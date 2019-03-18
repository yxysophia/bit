package Three;

class B
{
    private String name="kk";

}
public class Chcount extends B{

    public static void main(String[] args) {
        B b=new Chcount();
        String str="hello";
        String dtr1="he"+new String("llo");
        System.out.println(str==dtr1);
    }
}
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Chcount {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String str=scanner.nextLine();
//        System.out.println(findChCount(str));
//    }
//    public static Map<Character,Integer> findChCount(String str)
//    {
//        Map<Character,Integer> map=new HashMap<Character, Integer>();
//
//        for(int i=0;i<str.length();i++)
//        {
//            char ch=str.charAt(i);
//            if(!map.containsKey(ch) && ch!=' ')
//            {
//               int count=0;
//                for(int j=i;j<str.length();j++)
//                {
//                    if(str.charAt(j)==ch)
//                    {
//                        count++;
//                        map.put(ch,count);
//                    }
//                }
//            }
//        }
//        return map;
//    }
//}
