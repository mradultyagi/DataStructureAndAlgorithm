package abstractdemo;

public class Son extends parent{

    @Override
    void career(String name) {
        System.out.println("i am going to be a doc");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("i love "+name+"she is "+age);
    }
}

