package oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box= new Box(5,4,6);
        Box box1= new Box(box);
        System.out.println(box1.l+ " " +  box.b+" " + box.h);
    }
}
