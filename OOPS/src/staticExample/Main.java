package staticExample;

public class Main {
    public static void main(String[] args) {
//        human mradul = new human(23,"mradul",0,false);
//        human tyagi = new human(22,"tyagi",9000,false);
//        System.out.println(tyagi.population);
//    }
//    void greeting(){
//        System.out.println("hello");
//    }
//    void fun2(){
//        greeting();
//    }
//    static void fun(){
//        Main obj = new Main();
//        obj.greeting();

        Singelton s1 = Singelton.getInstance();
        Singelton s2 = Singelton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
      }
}
