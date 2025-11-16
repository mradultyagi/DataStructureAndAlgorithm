package abstractdemo;

public class daughter extends parent{
    @Override
    void career(String career) {
        System.out.println("i am going to be a "+career);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("i love "+name+"he is "+age);
    }
}
