package staticExample;

public class StaticBlock {
    static int a=1;
    static int b;
    //onlu runs once ,when first obj is createed line no 13 not in line no 19
    static {
        System.out.println("i am in static block");
        b=a*4;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " "+StaticBlock.b);

        StaticBlock.b +=3;
        System.out.println(StaticBlock.a + " "+StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " "+StaticBlock.b);


    }
}
