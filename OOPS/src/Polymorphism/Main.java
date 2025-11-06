package Polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        CompileTimePolymorphism c = new CompileTimePolymorphism();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2.3));
//        cilcle circle = new cilcle();
//        shape.area();
//        cilcle.area(12);

        RunTimePolyANIMAL a = new RunTimePolyANIMAL();
        a.sound();
        RunTimePolyANIMAL b = new dog();
        b.sound();


    }
}
