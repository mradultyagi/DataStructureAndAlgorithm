package Polymorphism;

public class RunTimePolyANIMAL {
    void sound(){
        System.out.println("animal makes a sound");
    }

}

class dog extends RunTimePolyANIMAL{
    void sound(){
        System.out.println("dog barks");
    }

}
class cat extends RunTimePolyANIMAL{
    void sound(){
        System.out.println("cat meows");
    }
}
