package inheritance;

import access.A;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4,6,7);
        BoxWeight box2 = new BoxWeight();
        System.out.println(box2.weight + " " + box.l+" "+ box.w);
        BoxPrice box3 = new BoxPrice(1.0,2.0,3.0,4.0,5.0);
        A a = new A(11,"fds");
        System.out.println(a.getNum());
    }
}
