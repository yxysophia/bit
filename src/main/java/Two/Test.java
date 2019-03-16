package Two;

class Tes {
    public static void hello()
    {
        System.out.println("heloo");
    }
}

//public class Test
//{
//    public static void main(String[] args) {
//        Tes tes=null;
//        tes.hello();
//    }
//}

class Base{
    public Base(String s){
        System.out.print("B");
    }
}
public class Test extends Base{
    public Test (String s) {
        super(s);
        System.out.print("D");
    }
    public static void main(String[] args){
        new Test("C");
    }
}
